package ch12.sec09;

public class ThreadStateMain {

	public static void main(String[] args) {
		// 점검해야할 스레드
		TargetThread targetThread = new TargetThread();
		// 감시해아할 스레드
		StatePrintThread spt = new StatePrintThread(targetThread);
		spt.start();
		spt.setStopFlag(true);

		System.out.println("메인스레드 종료");

	}
}
