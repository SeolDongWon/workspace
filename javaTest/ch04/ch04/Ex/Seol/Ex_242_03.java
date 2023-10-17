package ch04.Ex.Seol;

class Song
{
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song()
	{
	}

	public Song(int year, String country, String artist, String title)
	{
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show()
	{
		System.out.printf("%d년 %s국적의 %s가 부른 %s", year, country, artist, title);
	}

}

public class Ex_242_03
{
	public static void main(String[] args)
	{
		Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		song.show();
	}
}
