package ch05.exam_12;

public abstract class Shape
{
	private Shape next;
	public Shape(){next = null;}
	public void setNext(Shape obj){next = obj;} // 링크연결
	public Shape getNext(){return next;}
	public abstract void draw(); // 추상메소드
}

class Line extends Shape{
	@Override
	public void draw(){
		System.out.printf("Line\n");
	}
}

class Rect extends Shape{
	@Override
	public void draw(){
		System.out.printf("Rect\n");
	}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.printf("Circle\n");
	}
}
