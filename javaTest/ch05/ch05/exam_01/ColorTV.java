package ch05.exam_01;

public class ColorTV extends TV
{
	private int color;
	public ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	public int getColor(){return color;}
	public void setColor(int color){this.color = color;}
	public void printProperty(){
		System.out.printf("%d인치 %d컬러\n", super.getSize(), this.color);
	}
}
