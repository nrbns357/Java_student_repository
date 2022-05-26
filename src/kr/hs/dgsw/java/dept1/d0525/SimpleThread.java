package kr.hs.dgsw.java.dept1.d0525;

public class SimpleThread extends Thread {

	private String name;
	
	public SimpleThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(this.name + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		
		SimpleThread thread = new SimpleThread("1번");
		thread.start();
		
		SimpleThread thread2 = new SimpleThread("2번");
		thread2.start();
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Main : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
}