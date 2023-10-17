package ch06.exam_0;

public class Ex_384_2
{
	public static void main(String[] args)
	{
		Circle a = new Circle(2, 3, 5); // 중심 (2,3)에 반지름 5인 원
		Circle b = new Circle(2, 3, 30); // 중심 (2,3)에 반지름 30인 원
		System.out.println("원 a :" + a);
		System.out.println("원 b :" + b);
		if (a.equals(b))
		{
			System.out.println("같은 원");
		} else
		{
			System.out.println("다른 원");
		}
	}
}

class Circle{
	private int i;
	private int j;
	private int k;

	public Circle(int i, int j, int k){
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString(){
//		return " Circle (" + i + "," + j + ") 반지름" + k ;
		return String.format("Point(%d,%d)",this.i,this.j);
	}
	@Override
	public boolean equals(Object obj){
		Circle c =(Circle)obj;
		if(i==c.i&&j==c.j) {
			return true;
		}
	return false;
	}
}
