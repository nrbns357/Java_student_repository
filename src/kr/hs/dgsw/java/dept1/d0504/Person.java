package kr.hs.dgsw.java.dept1.d0504;

public class Person implements Printer { // implements: Printer에 기능을 구현 하겠다.
protected String name;
	
	public void sayHello() {
		System.out.println(name + "님 안녕하세요.");
	}
	
	@Override
	public void print() {
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	
	@Override
	public void print(String value) {
		this.print();
		System.out.println("나의 친구의 이름은 " + value + "입니다.");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "유재석";
		person.sayHello();
		person.print();
		person.print("강호동");
		
		Printer person1 = new Person();
		//person1.name = "이효리";
		//person1.sayHello();
		person1.print();
		person1.print("아이유");
	}
	
}
