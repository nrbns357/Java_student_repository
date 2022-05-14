package kr.hs.dgsw.java.test;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		String usePath = commandLine.substring(3);
		String path = currentDirectory.getPath();
		

		if(usePath == "..") {			
			for(int i = commandLine.length() - 1; i >= 0; i--) {
				char nowPath = path.charAt(i);
				if(nowPath == '/') {
//					String  = path.substring(0, i);
				}
			}
			
		}else{
			path += "/" + usePath;
		}
		return new File(path);
	}
}