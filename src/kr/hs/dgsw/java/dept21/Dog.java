package kr.hs.dgsw.java.dept21;

public class Dog {
	
	String color;
	
	double weight;
	
	String name;
	
	
	public void makeSound(){
		System.out.println("�۸�");
	}
	
	public void eat(String food) {
//		System.out.println(name + "��(��)" +food + "�� �Դ´�.");
		
		System.out.printf("%s��(��) %s��(��) �Դ´�.\n",name,food);
	}
	
	public void printInformation() {
//		System.out.println("�̸� : " + name + "   ������ : " + weight + "  ���� : " + color);
		System.out.printf("�̸� : %s ������ : %.2f ���� : %s\n", name, weight, color);
		
	}
}
