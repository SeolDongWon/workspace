package ch12.sec09;

public class TargetThread extends Thread {

	// 10억번 계산 실행 >> 1.5초 일시정지 >> 10억번 계산 실행
	@Override
	public void run() {
		super.run();
		// 10억번정도 계산을 하는 일을 한다.
		for (long i = 0; i < 2_000_000_000; i++) {
			// runnable 상태임(실행상태)
		}
		// Time waiting(1.5초) : 일시정지상태
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 10억번정도 계산을 하는 일을 한다.
		for (long i = 0; i < 2_000_000_000; i++) {
			// runnable 상태임(실행상태)
		}

	}
}
