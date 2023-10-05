package ch12.sec03;

import java.awt.Toolkit;

public class BeepTask2 implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 소리 5번
		try {
			toolkit.beep();
			Thread.sleep(1000); // 1초간 지연
			toolkit.beep();
			Thread.sleep(1000); // 1초간 지연
			toolkit.beep();
			Thread.sleep(1000); // 1초간 지연
			toolkit.beep();
			Thread.sleep(1000); // 1초간 지연
			toolkit.beep();
		} catch (InterruptedException e) {
			System.out.println(e);
		} finally {
			System.out.println("서브스레드 종료");
		}
	}
}
