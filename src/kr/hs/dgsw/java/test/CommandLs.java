package kr.hs.dgsw.java.test;

import java.io.File;
import java.util.Scanner;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		boolean exist = this.currentDirectory.exists();
		
		
		if(exist == false) {
			System.out.println("404: can not found dir");
			return this.currentDirectory;
		}

		File[] listFiles = this.currentDirectory.listFiles();
			for (File file : listFiles) {
				System.out.println(file.getName());
			}
		return null;
	}
	
}