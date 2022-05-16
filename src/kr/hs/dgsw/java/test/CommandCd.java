package kr.hs.dgsw.java.test;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		String path = currentDirectory.getPath();
		String usePath = commandLine.substring(3);

		if(usePath.equals("..")) {	
			try {
				path = currentDirectory.getParentFile().getAbsolutePath();
			} catch(NullPointerException e) {
				System.out.println("cannot find the path");
				path = currentDirectory.getAbsolutePath();
			}
		}
		else if((usePath.startsWith("") && usePath == "") || usePath.startsWith(" ")) {
			System.out.println("----cannot find the path----");
		}
		else{
				File file = new File(path + "/" + usePath);
				
				if(file.exists() && currentDirectory.isDirectory()){
					path += "/" + usePath;
				}else if(!file.exists()) {
					System.out.println("---cannot find file---");
				}
			}
		return new File(path);
		
	}
}