package ch12.sec05;

public class CalculatorMain {

	public static void main(String[] args) {
		// 공유자원객체를 만든다.
		Calculator calculator = new Calculator();

		// 작업스레드 user1, user2를 생성한다.
		User1 user1 = new User1("user1");
		user1.setCalcultator(calculator);
		user1.start();

		User2 user2 = new User2("user2");
		user2.setCalcultator(calculator);
		user2.start();

		System.out.println("메인스레드종료");
	}
}
