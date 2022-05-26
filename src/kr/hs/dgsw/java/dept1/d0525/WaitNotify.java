package kr.hs.dgsw.java.dept1.d0525;

public class WaitNotify {

	public static class Thread1 implements Runnable {
		@Override
		public void run() {
			System.out.println("T1이 시작됩니다. ");
			
			try {
				Thread.sleep(1000);
				System.out.println("notify ");
				notify();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	public static class Thread2 implements Runnable {
		
		Thread1 thread1;
		
		@Override
		public void run() {
			System.out.println("T2가 수행됩니다.");
			try {
				synchronized (thread1) {
					System.out.println("T1을 기다립니다.");
					thread1.wait();
					System.out.println("T2가 재개됩니다.");
				}
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1);
		
		Thread2 thread2 = new Thread2();
		thread2.thread1 = thread1;
		Thread t2 = new Thread(thread2);
		
		t1.start();
		
		t2.start();
		
	}
	
}