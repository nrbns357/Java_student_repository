package kr.hs.dgsw.java.dept1.d0525;

public class InterruptStudy {
	public static class Thread implements Runnable{

		public class Child() {
			System.out.println("자식 스레드가 시작했습니다.");
			
			try {
				Thread.sleep(100000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("자식 스레드 종료");
		}
	}
	
	public static void main (String[] args) {
		Thread thread = new Thread(new Child());
		thread.start();
		
		Thread thread2 = new Thread(new Child());
		thread2.start();
		
		try {
		Thread.sleep(1500);
		System.out.printf("부모가 자식을 꺠웁니다!");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
}
