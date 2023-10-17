package ch12.sec09;

public class StatePrintThread extends Thread {
	// 멤버변수(감시해야할 스레드 객체 저장)
	private Thread targetThread;
	private boolean stopFlag;

	public StatePrintThread(Thread targetThread) {
		super();
		this.stopFlag = false;
		this.targetThread = targetThread;
	}

	public boolean isStopFlag() {
		return stopFlag;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}

	@Override
	public void run() {
		super.run();
		// 감시해야할 스레드의 상태를 파악해서 출력하는 일을 한다.
		while (!stopFlag) {
			// 감시해야할 스레드 상태정보
			// (5가지 NEW,RUNNABLE,일시정지(BLOCKED,WAITING,TIME-WAITING),TERMINATED)
			State state = targetThread.getState();
			System.out.println("타겟스레드상태: " + state);
			if (state == Thread.State.TERMINATED) {
				break;
			}
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
