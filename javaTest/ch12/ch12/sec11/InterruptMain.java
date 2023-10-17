package ch12.sec11;

public class InterruptMain {
	public static void main(String[] args) throws InterruptedException {
		PrintThread pt = new PrintThread();
		pt.start();

		Thread.sleep(1000);
		//pt.stopFlag = true;
		if(pt.isDaemon()==true) {
			System.out.println("작업스레드는 데몬스레드");
		}else {
			System.out.println("작업스레드는 독립스레드");
		}
		pt.interrupt();

		System.out.println("main 스레드 종료");
	}
}
