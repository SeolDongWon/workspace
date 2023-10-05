package ch12.sec06;

public class WaitNotifyTest {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA ta = new ThreadA(workObject);
		ThreadB tb = new ThreadB(workObject);
		
		ta.start();
		tb.start();
		System.out.println("메인스레드 종료");
	}
}
