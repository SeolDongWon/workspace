package ch05.sec02;

public class SamsungPhone extends Object implements PhoneInterface{
	//멤버변수
	//생성자
	public SamsungPhone() {super();}
	//멤버함수(오버라이딩,출력)
	@Override
	public void sendCall(){System.out.printf("띠리리링\n");}
	@Override
	public void receiveCall(){System.out.printf("전화왔어요\n");}
	//멤버함수(자식이 필요한 메소드)
	public void flash() {System.out.printf("전화기에 불이 켜졌습니다.\n");
	}
}
