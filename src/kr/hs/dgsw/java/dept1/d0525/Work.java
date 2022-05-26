package kr.hs.dgsw.java.dept1.d0525;

public class Work {

	public void doWorking(Doer doer) {
		doer.work();
		doer.play();
	}
	
	public static void main(String[] args) {
		Work work = new Work();
		Doer doer = null;
		
//		doer = new Doctor();
		doer = new Student();
		
		work.doWorking(doer);
		
	}
}
