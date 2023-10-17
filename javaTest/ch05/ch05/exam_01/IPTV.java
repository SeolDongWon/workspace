package ch05.exam_01;

public class IPTV extends ColorTV{
	String IP = null;
	public IPTV(String IP, int size, int color){
		super(size, color);
		this.IP=IP;
	}
	public void printProperty(){
		System.out.printf("\"%s\" 주소에 %d인치 %d컬러\n", this.IP, super.getSize(), super.getColor());
	}
}
