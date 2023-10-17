package ch05.exam_13;

public class Ex_321_13_main
{
	public static void main(String[] args)
	{
		Shape donut = new Circle(10); // 반지름이 10인 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
