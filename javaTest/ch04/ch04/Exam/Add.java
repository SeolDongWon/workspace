package ch04.Exam;

public class Add
{
	// 멤버변수
	private int a, b;
	// 생성자
	public Add()
	{
		this(0, 0);
	}

	public Add(int a, int b)
	{
		super();
		this.a = a;
		this.b = b;
	}
	// 멤버함수(연산)
	public int calculate()
	{
		return this.a + this.b;
	}
	// 멤버함수(겟터,셋터)
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	//출력함수
}
