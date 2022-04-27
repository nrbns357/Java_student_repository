package kr.hs.dgsw.java.dept1.d0427;

public abstract class Animal { //abstract[추상화 클래스]
	
	public abstract String getName();
	public abstract String makeSound(); // 추상 메소드
	
	
	
	public void printSound() { //메소드
		System.out.println(getName() + "이(가) " + makeSound() + " 노래합니다.");
	}
	
	
	public static void main(String[] args) {
		Animal animal = new Dog(); // 객체로 만들 수 없다 왜냐? : 추상클래스이기 떄문에
		animal.printSound();
	}
	
	
}
