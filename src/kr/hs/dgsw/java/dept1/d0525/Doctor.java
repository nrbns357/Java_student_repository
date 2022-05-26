package kr.hs.dgsw.java.dept1.d0525;

public class Doctor implements Doer {
	@Override
	public void work() {
		System.out.println("의사 선생님이 수술을 합니다.");
	}

	@Override
	public void play() {
		System.out.println("의사 선생님이 배그를 합니다.");
	}
} 
