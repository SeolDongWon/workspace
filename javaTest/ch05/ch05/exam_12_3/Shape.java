package ch05.exam_12_3;

public abstract class Shape {
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next= obj;}
	public Shape getNext() { return next;}
	public abstract void draw();
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}