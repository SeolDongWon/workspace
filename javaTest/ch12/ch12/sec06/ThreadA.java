package ch12.sec06;

public class ThreadA extends Thread {
	private WorkObject workobject;

	public ThreadA(WorkObject workobject) {
		super();
		this.workobject = workobject;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			workobject.methodA();
		}
		System.out.println("스레드A 종료");
	}
}
