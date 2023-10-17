package ch04.Exam;

public class Day extends Object
{
	// 멤버변수
	private String work;

	// 생성자(디폴생)
	public Day()
	{
		super();
	}

	// 멤버함수(연산)
	// getter,setter
	public void setWork(String work)
	{
		this.work = work;
	}

	public String getWork()
	{
		return work;
	}

	// 출력함수
	public void show()
	{
		if (work == null)
		{
			System.out.printf("일이 없습니다.\n");
		} else
		{
			System.out.printf("%s 입니다.\n", this.work);
		}
	}

}
