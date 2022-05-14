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
			
			Date date = makeDate(modifiedTime);
			String time = formatDate(date);
			
			if(!bFile) {
			System.out.printf("%s  <DIR>  %15s %s\n",time, Long.toString(size), file.getName());
			}else {
				System.out.printf("%s         %15s %s\n",time, Long.toString(size), file.getName());
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