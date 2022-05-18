package kr.hs.dgsw.java.test;

import java.io.File;

public class CommandRm extends AbstractCommand {
	public CommandRm(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		String path = currentDirectory.getPath();
		String useCommand = commandLine.substring(3);
		
		
		try {
			
		if(currentDirectory.exists()) {
				
				if(currentDirectory.delete()) {
					System.out.println("파일 삭제를 성공");
				}else {
					System.out.println("파일 삭제를 실패");
				}
		}else {
			System.out.println("파일이 존재하지 않습니다.");			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return currentDirectory;
	}
	
	
}
