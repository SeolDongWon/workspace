package ch05.sec02;

public class InterfaceTestMain
{
	public static void main(String[] args)
	{
		//객체
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
		
		//업캐스팅
		PhoneInterface pi = sp;
		pi.sendCall();
		pi.receiveCall();
		
	}
}
