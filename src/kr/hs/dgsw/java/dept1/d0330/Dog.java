package kr.hs.dgsw.java.dept1.d0330;

public class Dog {
	
	private final String name; //final이 선언되면 그 변수의 값은 변경이 안된다.and 생성자 안에서만 사용가능 일반 메소드에서 오류가 나온다.
	private int age;
	
	public Dog(String name) {
		this(name, 0);// final이 생성자에서 딱 한번 값을 설정을 해줄 수 있는 기회를 준다. (이렇게 사용하면 됨)
		System.out.println();
	}
	
	public Dog(String name, int age) {//생성자: 생성자는 class 이름과 같아야 한다. 리턴 타입을 지정 할 경우에는 메소드가 되어 버린다.
		this.name = name;	
		this.age = age;
		System.out.println("생성자가 호출되었습니다.");
	}
	
	public void print() {//메소드
		System.out.printf("%s는 나이가 %d살입니다.\n",this.name , this.age);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getName(String dummy) {
		return this.age + "";
	}
	
	public static void main(String[] args) {
		System.out.println("해피 만들기 전");
		Dog happy = new Dog("해피",5);
		happy.print();
		
		happy.getName(); 
		happy.getName("abc");
		// !오버로딩: 같은 이름을 가진 메소드에 타입 인자를 다르게 받는 것(타입이 달라야함)
		
		Dog puppy = new Dog("퍼피",0);
		puppy.print();
		
		
		System.out.println("Count of args : " + args.length);
		for(int i = 0; i < args.length; i++) {
			System,out.printf("%d - %s\n",);
		}

	}
	
	/*
	 * public void setName(String name) { this.name = name; }
	 */
}
