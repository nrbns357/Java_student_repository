package kr.hs.dgsw.java.dept1.d0525;

public class ThreadByInterface implements Runnable {

	private String name;
	
	public ThreadByInterface(String name) {
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
		ThreadByInterface threadByInterface = 
				new ThreadByInterface("1번");
		
		Thread thread = new Thread(threadByInterface);
		thread.setDaemon(true);	// 스레드를 daemon으로 설정하면, 부모 스레드가 종료될 때, 함께 종료됩니다.
		
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료");
	}

	
}
