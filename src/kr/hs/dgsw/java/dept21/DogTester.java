package kr.hs.dgsw.java.dept21;

public class DogTester {
	//"main" + ��Ʈ�� + �����̽� ���� �Լ��� �������
	public static void main(String[] args) {
		Dog jindo = new Dog();
		Dog chichu = new Dog();
		
		jindo.name = "������";
		jindo.weight = 8.5;
		jindo.color = "��������";
		
		chichu.name = "����";
		chichu.weight = 3.2;
		chichu.color = "���";
		
		
		jindo.makeSound();
		jindo.eat("���ٱ�");
		jindo.printInformation();
		
		
		chichu.makeSound();
		chichu.eat("���");
		chichu.printInformation();
	}
}
