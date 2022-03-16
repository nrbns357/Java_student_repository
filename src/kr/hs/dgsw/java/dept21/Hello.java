package kr.hs.dgsw.java.dept21;

public class Hello {
		
	public void sayHello() {
//		System.out.println("Hello World!");
		sayHello("World");
	}

	public void sayHello(String name) {
		System.out.println("Hello " + name  + "!");
	}
	
	public void sayHello(int age) {
		System.out.println("number: " + age);
	}
}
