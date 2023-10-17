package ch05.exam_05;

public class ColorPoint extends Point
{
	private String color;
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color=color;
	}
	public void setXY(int x, int y) {this.move(x, y);}
	public void setColor(String color) {this.color=color;}
	public String toString() {
		return this.color+"색의 ("+this.getX()+","+this.getY()+")의 점";
	}
	public String getColor(){return color;}
}
