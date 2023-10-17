package ch05.sec02;

public interface PhoneInterface
{
	//멤버변수(상수)
	public static final int TIMEOUT = 10_000;
	//생성자
	//멤버함수(추상메소드)
	public abstract void sendCall();
	public abstract void receiveCall();
}
