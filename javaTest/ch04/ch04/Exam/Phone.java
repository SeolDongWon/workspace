package ch04.Exam;

public class Phone
{
	// 멤버변수
	private String name;
	private String tel;

	// 생성자
	public Phone()
	{
		this("무기명", "000-0000-0000");
	}

	public Phone(String name, String tel)
	{
		this.name = name;
		this.tel = tel;
	}

	// 멤버함수(연산)
	// 멤버함수get set
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}
	//출력함수

	@Override
	public String toString()
	{
		return "Phone [name=" + name + ", tel=" + tel + "]";
	}

	
}
