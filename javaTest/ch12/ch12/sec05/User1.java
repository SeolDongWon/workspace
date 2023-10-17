package ch12.sec05;

public class User1 extends Thread {
	// 멤버변수
	private Calculator calculator;

	// 디생
	public User1(String name) {
		super();
		this.setName(name);
	}

	public void setCalcultator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		super.run();
		this.calculator.setMemory(100);
	}
}
