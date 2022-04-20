package kr.hs.dgsw.java.dept1.d0420;

public class Reptiles extends Animal {

	@Override //재 정의
	public void birth() {
		System.out.println("알을 놓아서 부화합니다.");
	}
	
	public static void main(String[] args) {
		Reptiles reptiles = new Reptiles();
		reptiles.birth();
	}
}
