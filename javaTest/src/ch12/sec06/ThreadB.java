package ch12.sec06;

public class ThreadB extends Thread {
	private WorkObject workobject;

	public ThreadB(WorkObject workobject) {
		super();
		this.workobject = workobject;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			workobject.methodB();
		}
		System.out.println("스레드B 종료");
	}
}
