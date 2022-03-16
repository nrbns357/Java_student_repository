package kr.hs.dgsw.java.dept21;

public class Dog {
	
	String color;
	
	double weight;
	
	String name;
	
	
	public void makeSound(){
		System.out.println("¸Û¸Û");
	}
	
	public void eat(String food) {
//		System.out.println(name + "ÀÌ(°¡)" +food + "À» ¸Ô´Â´Ù.");
		
		System.out.printf("%sÀÌ(°¡) %sÀ»(¸¦) ¸Ô´Â´Ù.\n",name,food);
	}
	
	public void printInformation() {
//		System.out.println("ÀÌ¸§ : " + name + "   ¸ö¹«°Ô : " + weight + "  »ö±ò : " + color);
		System.out.printf("ÀÌ¸§ : %s ¸ö¹«°Ô : %.2f »ö±ò : %s\n", name, weight, color);
		
	}
}
