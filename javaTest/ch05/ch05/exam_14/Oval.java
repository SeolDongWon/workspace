package ch05.exam_14;

public class Oval implements Shape
{
	private int i;
	private int j;

	public Oval(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public void draw(){
		System.out.printf("%dx%d에 내접하는 타원입니다.\n",i,j);
	}
	@Override
	public double getArea(){
		return this.PI * i * j;
	}
}
