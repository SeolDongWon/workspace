package ch05.sec01;

public class Point{
	// 멤버변수
	private int x, y;
	// 생성자
	public Point(){super();}
	// 함수(연산)(겟셋)
	public void set(int x, int y){this.x = x;this.y = y;}
	// 함수(출력)
	public void showPoint()
	{
		System.out.printf("(%d + %d)\n", this.x, this.y);
	}
	public void add() {
		System.out.printf("%d \n",x+y);
	} 
}
