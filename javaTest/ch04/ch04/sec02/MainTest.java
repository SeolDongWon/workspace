package ch04.sec02;

public class MainTest
{

	public static void main(String[] args)
	{
		StudentScore studentscore = new StudentScore("설동원", 6, 33, 65, 78, 94);

		studentscore.calTotal();
		studentscore.calAverage();
		studentscore.calGrade();

		System.out.printf("%s", studentscore);
		System.out.printf("\n END");
	}
}
