package kr.hs.dgsw.java.dept1.d0420;

import java.util.Scanner;

public class Adder {
	protected final Scanner scanner;

	public Adder() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
//		두 정수를 입력 받는다.
	
		Values values = this.inputValues();
		
//		계산을 수행한다.
		int result = this.calculate(values);
		
//		결과를 출력한다.
		this.showResult(values, result);
		
//		사용된 자원을 해제한다.
		this.scanner.close();
	}
	
	public Values inputValues() {
		Values values = new Values();
		System.out.println("두 정수를 입력해주세요.");
		values.setValue1(this.scanner.nextInt());
		values.setValue2(this.scanner.nextInt());
		return values;
	}
	
	public int calculate(Values values) {
		
		return values.getValue1() + values.getValue2();
	}
	
	public void showResult(Values values, int result) {
		System.out.printf("%d %s %d = %d",values.getValue1(), getOperator() , values.getValue2(), result);
	}
	
	public String getOperator() {
		return "+";
	}
	
	public class Values{
		private int value1;
		
		private int value2;

		public int getValue1() {
			return value1;
		}

		public void setValue1(int value1) {
			this.value1 = value1;
		}

		public int getValue2() {
			return value2;
		}

		public void setValue2(int value2) {
			this.value2 = value2;
		}
		
	}
}
