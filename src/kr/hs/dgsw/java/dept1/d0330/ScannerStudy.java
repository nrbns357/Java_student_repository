package kr.hs.dgsw.java.dept1.d0330;

import java.util.Scanner;

public class ScannerStudy {
	
	
	
	private final Scanner scanner;
	
	public ScannerStudy() {
		this.scanner = new Scanner(System.in);
		
	}
	
	public void execute() {
		String input = null;
//		while(true) 
		{
//			System.out.println("정수를 입력하세요.");
//			input1 = this.scanner.next(); //next는 string만 리턴 할 수 있다. 그리고 스페이스 기준으로 한 단어만 리턴 한다.
			
//			System.out.println("정수를 입력하세요.");
//			input2 = this.scanner.next(); //next는 string만 리턴 할 수 있다. 그리고 스페이스 기준으로 한 단어만 리턴 한다.

//			System.out.printf("당신은 '%s'을 입력하셨습니다.\n",input);
//			String result = input1 + input2;
//			System.out.printf("%s + %s = %s",input1, input2, input1+input2) //next는 string만 리턴 할 수 있다. 그리고 스페이스 기준으로 한 단어만 리턴 한다.
			
			
//			System.out.println("정수를 입력하세요.");
//			input = this.scanner.nextLine(); // 입력한 문장을 다 리턴한다.
			
			System.out.println("정수를 입력하세요.");
//			value = this.scanner.nextInt();
//			System.out.printf("%d의 제곱은 %d입니다.\n\n", value, (value * value));
			
		}
		this.scanner.close();
	}
	
	public  static void main(String[] args) {
		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.execute();
	}
	
	
}
