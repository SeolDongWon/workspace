package ch04.Ex.Seol;


class TV
{
	private String company;
	private int year;
	private int inch;

	public TV(String name, int year, int inch)
	{
		super();
		this.company = name;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",company, year, inch);
	}
}	

public class Ex_241_01
{
	public static void main(String[] args)
	{
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
	}
}
