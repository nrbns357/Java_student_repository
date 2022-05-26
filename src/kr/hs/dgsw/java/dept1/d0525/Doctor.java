package kr.hs.dgsw.java.dept1.d0525;

public class Doctor implements Doer {
	
	@Override
	public void work() {
		System.out.println("의사 공부를 매우 열심히 합니다.");
	}
	
	@Override
	public void play() {
		System.out.println("의사 운동장에서 축구를 합니다.");
	}
}
