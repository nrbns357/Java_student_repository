package kr.hs.dgsw.java.dept1.d0406.algorithm;

import java.util.Scanner;

public class Measure {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		System.out.printf("%d의 약수는", input);
		for(int i = 1; i <= input; i++) {
			if(input % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.printf("입니다.");
		scanner.close();
	}
}
