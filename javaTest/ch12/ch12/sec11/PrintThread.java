package ch12.sec11;

public class PrintThread extends Thread {
	public boolean stopFlag = false;
	int i = 0;
	@Override
	public void run() {
//		try {
			while (!stopFlag) { // while을 빠져나가는 방법 1:stopFlag , 2:try-catch
				System.out.printf("%s 작업스레드 실행중\n", this.getName());
				i++;
				//Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
//		} catch (InterruptedException e) {
//		} catch (Exception e) {
//			System.out.printf("%s 작업스레드 인터럽트로 작업중지\n", this.getName());
//		}
		System.out.printf("%d 작업스레드 종료",i);
	}
}
