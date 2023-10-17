package ch05.exam_14;

public class Rect implements Shape
{
	private int i;
	private int j;

	public Rect(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public void draw(){
		System.out.printf("%dx%d 크기의 사각형입니다.\n",i,j);
	}
	@Override
	public double getArea(){
		return i*j;
	}
}
