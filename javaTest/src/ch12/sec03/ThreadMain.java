package ch12.sec03;

import java.awt.Toolkit;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		// 소리 5번
//		toolkit.beep();
//		Thread.sleep(1000); // 1초간 지연
//		toolkit.beep();
//		Thread.sleep(1000); // 1초간 지연
//		toolkit.beep();
//		Thread.sleep(1000); // 1초간 지연
//		toolkit.beep();
//		Thread.sleep(1000); // 1초간 지연
//		toolkit.beep();

		// 1번방식
//		Thread thread1 = new BeepTask();
//		thread1.start();

		// 2번방식
//		Runnable runnable = new BeepTask2();
//		Thread thread2 = new Thread(runnable);
//		thread2.start();

		// 3번방식
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				super.run();
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
		};
//		thread3.start();

		// 4번방식
		Thread thread4 = new Thread(new Runnable() {

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
		});
//		thread4.start();

		// 5번방식
		Thread thread5 = new Thread(() -> {
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
		});
//		thread5.start();

		// 출력 다섯번
		System.out.println("땡");
		Thread.sleep(1000); // 1초간 지연
		System.out.println("땡");
		Thread.sleep(1000); // 1초간 지연
		System.out.println("땡");
		Thread.sleep(1000); // 1초간 지연
		System.out.println("땡");
		Thread.sleep(1000); // 1초간 지연
		System.out.println("땡");

		// 종을 다섯번 울리는 일 맡아서 한다.(5초)
		System.out.println("메인스레드 종료");
	}
}
