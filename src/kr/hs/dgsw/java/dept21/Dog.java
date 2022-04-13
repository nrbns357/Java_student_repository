package kr.hs.dgsw.java.dept21;

public class Dog {
	
	String color;
	
	double weight;
	
	String name;
	
	
	public void makeSound(){
		System.out.println("멍멍");
	}
	
	public void eat(String food) {
//		System.out.println(name + "는" +food + "을(를)먹습니다.");
		
		System.out.printf("%s는(은) %s을(를) 먹습니다.\n",name,food);
	}
	
	public void printInformation() {
//		System.out.println("�̸� : " + name + "   ������ : " + weight + "  ���� : " + color);
		System.out.printf("�̸� : %s ������ : %.2f ���� : %s\n", name, weight, color);
		
	}
}