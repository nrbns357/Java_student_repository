package kr.hs.dgsw.java.dept1.d0427;

public class Zoo {
//	public void breed(Dog dog) {
//		dog.printSound();
//	}
//	
//	public void breed(Cat cat) {
//		cat.printSound();
//	}
	
	public void breed(Animal animal) {
		animal.printSound();
	}
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Horse horse = new Horse();
		
		zoo.breed(dog);
		zoo.breed(cat);
		zoo.breed(horse);
	}
}
