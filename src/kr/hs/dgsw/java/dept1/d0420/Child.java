package kr.hs.dgsw.java.dept1.d0420;

public class Child extends Parent{
	
	protected int age;
	
	public static void main(String[] args) {
		Child child = new Child();
		child.name = "홍길동";
		child.sayHello();
		//child.weight = 50; // private으로 선언된 변수는 상속이 안된다.
		child.age = 18;
		
		Parent parent = new Parent();
		parent.name = "이경태";
		parent.sayHello();
		//parent.age = 40; // 
	}
	
}
