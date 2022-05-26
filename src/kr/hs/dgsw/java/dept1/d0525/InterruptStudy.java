package kr.hs.dgsw.java.dept1.d0525;

public class InterruptStudy {
	public static class Child implements Runnable {
		@Override
		public void run() {
			System.out.println("자식 스레드가 잠에 빠져듭니다.");
			
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("자식 스레드가 깨어납니다.");
		}
	}
	
	public static class Child2 implements Runnable {
		@Override
		public void run() {
			System.out.println("자식2 스레드가 잠에 빠져듭니다.");
			
			try {
				synchronized (this) {
					wait();

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("자식2 스레드가 깨어납니다.");
		}
	}

	public static void main(String[] args) {
		//Thread thread = new Thread(new Child());
		//thread.start();
		
		Thread thread2 = new Thread(new Child2());
		thread2.start();
		
		
		try {
			Thread.sleep(1500);

			/*
			System.out.println("부모가 자식을 깨웁니다.");
			thread.interrupt();
			*/
			
			thread2.notify();
			
			
		} catch (InterruptedException e) {}
		
		
	}
}
