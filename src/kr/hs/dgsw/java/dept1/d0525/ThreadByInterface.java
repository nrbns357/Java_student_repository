package kr.hs.dgsw.java.dept1.d0525;

public class ThreadByInterface implements Runnable {
	
	private final String name;
	
	public ThreadByInterface(String name) {
		this.name = name;
	}
		

		public void run() {
			for(int i =0; i < 10; i++) {
				System.out.println(this.name + " : " + i);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					
				}
			}
		}
	
	public static void main(String[] args) {
		ThreadByInterface threadByInterface = new ThreadByInterface("1번");
		Thread thread = new Thread(threadByInterface);
		thread.setDaemon(false); //true면 자식 쓰레드 까지 끝내줌 false면 부모 쓰레드만 끝나고 자식은 계속실행됨
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.printf("메인스레드 종료\n");
	}
}
