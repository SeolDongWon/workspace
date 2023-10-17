package ch12.sec14;

public class GroupThreadMain {
	public static void main(String[] args) throws InterruptedException {
		// 여기는 메인스레드가 system/Main 그룹에 소속된 MyGroup을 만든다.
		ThreadGroup tg = new ThreadGroup("MyGroup");
		// 메인그룹에 소속된 스레드를 만든다(main 스레드, 작업스레드 ~~)
		// MyGroup에 소속된 스레드를 만든다.
		WorkThread wt0 = new WorkThread(tg, "workThread0");
		WorkThread wt1 = new WorkThread(tg, "workThread1");
		WorkThread wt2 = new WorkThread(tg, "workThread2");

		wt0.start();
		wt1.start();
		wt2.start();

		// 그룹내용을 출력해주는 기능
//		System.out.println("[main스레드그룹의 list() 메소드출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// 그룹속에 들어있는 내용들을 보여주는 기능을 하는 함수
		mainGroup.list();

		Thread.sleep(2000);
//		wt0.interrupt();
//		wt1.interrupt();
		tg.interrupt();

//		System.out.println("[main스레드그룹의 interrupt() 메소드출력 내용]");

		System.out.println("메인스레드 종료");
	}
}
