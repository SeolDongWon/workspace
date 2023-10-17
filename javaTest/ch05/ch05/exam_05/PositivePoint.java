package ch05.exam_05;

// 양수공간에서만 점을 나타내는 클래스
public class PositivePoint extends Point
{
	//멤버변수(부모것은 내것이다)
	public PositivePoint() {this(0,0);}
	public PositivePoint(int x) {this(x,0);}
	public PositivePoint(int x, int y){
		super(x, y);
		if((0>x)||(0>y)) {super.move(0, 0);}
	}
	public void move(int x, int y) {
		if((0<x)&&(0<y)) {super.move(x, y);}
	}
	public String toString() {
		return "("+this.getX()+","+this.getY()+")의 점";
	}
	
}
