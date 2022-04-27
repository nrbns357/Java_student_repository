package kr.hs.dgsw.java.dept1.d0427;

public class Adder extends Calculator {

	@Override
	public int calculate() {
		return value1 + value2;
	}

	@Override
	public String getOperator() {
		return "+";
	}
	
	public static void main(String[] args) {
		Calculator adder = new Adder();
		Adder adder2 = new Adder();
		
		adder.execute();
		
	}
	
	
}
