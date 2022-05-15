package kr.hs.dgsw.java.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		boolean exist = currentDirectory.exists();
		
		
		if(exist == false) {
			System.out.println("404: can not found dir");
			return currentDirectory;
		}

		File[] listFiles = currentDirectory.listFiles();
		
		for (File file : listFiles) {
			boolean bFile = file.isFile();
			long modifiedTime = file.lastModified();
			long size = file.length();
			String sizeBitChange = Long.toString(size);
			Date date = makeDate(modifiedTime);
			String time = formatDate(date);
			
			if(size >= 1024 * 1024 * 1024){
				sizeBitChange = size/(100000000) + "G";
			}else if(size >= 1024 * 1024) {
				sizeBitChange = size/1000000 + "M";
			}else if(size >= 1024) {
				sizeBitChange = size/1000 + "K";
			}
			
			if(!bFile) {
			System.out.printf("%s  <DIR>  %15s %s\n",time, sizeBitChange, file.getName());
			}else {
				System.out.printf("%s         %15s %s\n",time, sizeBitChange, file.getName());
			}
		}
			
		return currentDirectory;
	}
	
	public Date makeDate(long unixTime) {
		return new Date(unixTime);
	}
	
	private String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
}