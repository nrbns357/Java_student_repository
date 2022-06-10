package kr.hs.dgsw.java.dept1.d0608;

public class SyncStudy {

	private static Object obj = new Object();
	
	public static class Waiter implements Runnable {
		private final String name;
		
		public Waiter(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println(name + " 스레드가 시작됩니다.");
			
			// do something
			
			System.out.println(name + " 스레드가 기다립니다.");
			
			try {
				synchronized (obj) {
					obj.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " 스레드가 재개됩니다.");
			
		}
	}
	
	public static void main(String[] args) {
		
		Waiter waiter1 = new Waiter("T1");
		new Thread(waiter1).start();

		Waiter waiter2 = new Waiter("T2");
		new Thread(waiter2).start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		synchronized (obj) {
			obj.notifyAll();
		}
	}
	
}
