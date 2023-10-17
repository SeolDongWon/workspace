package ch12.sec12;

public class DemonMain {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new PrintThread();
		Thread thread = new Thread(runnable);
		thread.setDaemon(true); // 독립스레드를 데몬스레드로 전환
		thread.start();

		Thread.sleep(2000);

		System.out.println("메인스레드 종료");
	}
}
