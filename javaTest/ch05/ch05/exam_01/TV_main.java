package ch05.exam_01;

public class TV_main
{
	public static void main(String[] args)
	{
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2",32,1024);
		iptv.printProperty();
	}
}
