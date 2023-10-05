package ch12.sec01;

import java.awt.Toolkit;

public class BeepTask extends Thread {
	// 스레드를 실행하려면 run메소드를 오버라이딩 해야한다
	@Override
	public void run() {
		super.run();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		try {
			Thread.sleep(1000);
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
			System.out.println("작업스레드 종료");
		}
	}
}
