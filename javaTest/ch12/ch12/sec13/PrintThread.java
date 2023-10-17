package ch12.sec13;

public class PrintThread extends Thread {

	public PrintThread(String name) {
		this.setName(name);// 스레드 이름
	}

	@Override
	public void run() {
		while (true) {
			System.out.printf("%s 스레드 작업내용을 실행함\n", this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
