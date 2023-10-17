package ch04.sec05;

public class Book
{
	// 멤버변수(title, author)
	private String title;
	private String author;

	// 디폴트생성자
	public Book()
	{
	}

	// 매개변수생성자(title)
	public Book(String title)
	{
		this(title,"작가미상");
	}
	public Book(String author, boolean falg
			
			
			)
	{
		this("타이틀미상",author);
	}

	// 매개변수생성자(title,author)
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}

	// 멤버함수(없음)
	// 멤버함수(getter,setter)
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	// 출력(toString)
	@Override
	public String toString()
	{
		return "Book [title=" + title + ", author=" + author + "]";
	}

}
