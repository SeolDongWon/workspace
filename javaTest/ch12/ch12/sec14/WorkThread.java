package ch12.sec14;

public class WorkThread extends Thread {

	public WorkThread(ThreadGroup group, String name) {
		super(group, name);
		this.setName(name);
	}

	@Override
	public void run() {
		while (true) {
			System.out.printf("%s 작업실행중 \n", this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.printf("%s 작업 인터럽트 발생 \n", this.getName());
				break;
			}
		}
		System.out.printf("%s 작업종료 \n", this.getName());
	}
}
