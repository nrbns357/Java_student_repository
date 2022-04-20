package kr.hs.dgsw.java.dept1.d0420;

public class Tiger extends Mammal {

	public void makeSound() {
		System.out.println("야옹");
	}
	
	@Override
	public void birth() {
		System.out.println("호랑이가 무서운 새끼를 낳스빈다.");
	}
	
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.move();
		tiger.birth();
		
		Mammal tiger2 = new Tiger();
		tiger2.move();
		tiger2.birth();
//		tiger2.makeSound();
		
//		String abc = new Tiger();
	}
}
