package ch05.sec01;

public class ColorPoint extends Point{
	// 멤버변수
	private String color;
	// 생성자
	// public ColorPoint(){super();} // 자식클래스의 생성자는 부모생성자를 호출
	public ColorPoint(){super();}
	public ColorPoint(String color){this.color = color;}
	public void add() {
		System.out.printf("%d \n",60);
	} 
	public void pirnt() {
		add();
		this.add();
		super.add();
	}
}
