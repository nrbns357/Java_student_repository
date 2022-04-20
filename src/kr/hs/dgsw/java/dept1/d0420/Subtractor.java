package kr.hs.dgsw.java.dept1.d0420;

import kr.hs.dgsw.java.dept1.d0420.Adder.Values;

public class Subtractor extends Adder {
	@Override
	public int calculate(Values values) {
		return values.getValue1() - values.getValue2();
	}
	
	@Override
	public void showResult(Values values, int result) {
		System.out.printf("%d - %d = %d",values.getValue1(), values.getValue2(), result);
	}
	
	public static void main(String[] args) {
		Subtractor subtractor = new Subtractor();
		subtractor.execute();
	}
}
