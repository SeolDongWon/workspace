package ch12.sec13;

import java.util.Map;
import java.util.Set;

public class GroupThreadMain {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread("DongWon Thread");
		// 데몬스레드
		pt.setDaemon(true);
		// 우선순위 최고10
		pt.setPriority(Thread.MAX_PRIORITY);
		pt.start();

		// 소속그룹 출력하는 기능부여함.(외우지말고, 한번경험생각할것)
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> set = map.keySet();
		for (Thread thread : set) {
			System.out.printf("스레드이름: %-20s ", thread.getName());
			System.out.printf("데몬/독립: %-10s", thread.isDaemon() ? "데몬" : "독립");
			ThreadGroup threadGroup = thread.getThreadGroup();
			System.out.printf("소속그룹: %-20s", threadGroup.getName());
			System.out.println("");
		}

		System.out.println("메인스레드 종료");
	}
}
