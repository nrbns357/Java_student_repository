package kr.hs.dgsw.java.dept1.d0518;

import java.io.IOException;

public class MyClass {
	
	private void method1() throws MyException, IOException {
		System.out.println("method1 호출됨");
		method2();
		
		ArithmeticException e = new ArithmeticException();
		throw e;
	}
	
	private void method2() throws MyException, IOException {
		System.out.println("method2 호출됨");
		method3();
		
		IOException e = new IOException();
		throw e;
		
	}
	
	private void method3() throws MyException { // throws MyException: 호출자에게 에러를 떠넘김
		System.out.println("method3 호출됨");
		
		//예외를 만들어서 발생시킵니다.
		MyException e = new MyException();
		throw e; // throw는 던지다는 의미이다. (e를 던진다, 에러를 보여준다.)
	}
	
	public static void main(String[] args) {
		
		try {
			MyClass myClass = new MyClass();
			myClass.method1();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
