package ch12.sec06;

//공유자원
public class WorkObject {
	public int bread;

	public synchronized void methodA() {
		if (bread == 0) {
			this.bread = (int) (Math.random() * (10 - 1 + 1) + (1));
			System.out.printf("ThreadA의 methodA() 생산자가 빵을 %d개 생산 = \n", this.bread);
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() {
		if (bread != 0) {
			System.out.printf("ThreadB의 methodB() 소비자가 빵을 %d개 산다 = \n", this.bread);
			this.bread = 0;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
