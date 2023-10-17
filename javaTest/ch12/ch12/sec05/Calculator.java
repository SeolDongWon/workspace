package ch12.sec05;

public class Calculator {
	// 멤버변수
	private int memory;
	// 생성자

	public Calculator() {
		super();
	}

	// 겟터,셋터
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		// switching 발생(강제로 스위칭을 발생시키기위해서 2초 시간을 부여함)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "=" + this.memory);
	}
}
