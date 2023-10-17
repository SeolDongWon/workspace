package ch05.exam_14;


public class Circle implements Shape
{
	private int radius;
	public Circle(int i){this.radius = i;}
	@Override
	public void draw(){
		System.out.printf("반지름이 %d인 원입니다.\n",this.radius);
	}
	@Override
	public double getArea(){
		return this.PI * this.radius * this.radius;
	}
}
