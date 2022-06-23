package kr.hs.dgsw.java.test;

import java.io.File;
import java.util.Scanner;

public class CommandRm extends AbstractCommand {
	public CommandRm(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		String path = currentDirectory.getPath();
		String useCommand = commandLine.substring(3);
		File deleteFile = new File(path + useCommand);
		Scanner scanner = new Scanner(System.in);
		
		try {
			if(deleteFile.exists()) {
				
				System.out.print("정말로 " + useCommand + "를 삭제 하시겠습니까? (yes or no) : ");
				String isDeleteFileWhether = scanner.nextLine();
				if(isDeleteFileWhether.equalsIgnoreCase("yes")) {
					if(deleteFile.delete()) {
						System.out.println("파일 삭제를 성공했습니다.");
					}else {
						System.out.println("파일 삭제를 실패했습니다.");
					}
				}else {
					System.out.println("삭제를 취소하였습니다.");
				}
				
				
			}else {
				System.out.println("파일을 찾을 수 없습니다.");			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return currentDirectory;
	}
	
	
}
