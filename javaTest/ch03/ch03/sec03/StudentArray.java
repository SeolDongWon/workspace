package ch03.sec03;

public class StudentArray
{
	public static final int PEOPLE_NUMBER = 3;
	public static final String[] FIRST_NAME = { "김", "문", "박", "백", "설", "이", "임", "한" };
	public static final String[] LAST_NAME = { "범", "지", "진", "가", "동", "정", "현", "우" };

	public static void main(String[] args)
	{
		// 1 변수선언(국어,영어,수학,총점,평균,패스,등급,이름,입력객체, : 5명을 입력한다.)
		// 2 변수초기값설정
		int[] kor = new int[PEOPLE_NUMBER];
		int[] eng = new int[PEOPLE_NUMBER];
		int[] math = new int[PEOPLE_NUMBER];
		int[] total = new int[PEOPLE_NUMBER];
		double[] avr = new double[PEOPLE_NUMBER];
		char[] grade = new char[PEOPLE_NUMBER];
		String[] name = new String[PEOPLE_NUMBER];

		// 3 입력
		for (int i = 0; i < PEOPLE_NUMBER; i++)
		{
			kor[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
			eng[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
			math[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
			total[i] = kor[i] + eng[i] + math[i];
			avr[i] = (double) total[i] / 3;
			name[i] = createName();

			switch ((int) avr[i] / 10)
			{
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
			}
		}

		// 4 출력
		System.out.printf(" name \t kor \t eng \t math \t total \t avr \t grade\n");
		System.out.printf("=======================================================\n");
		for (int i = 0; i < PEOPLE_NUMBER; i++)
		{
			System.out.printf(" %s \t %d \t %d \t %d \t", name[i], kor[i], eng[i], math[i]);
			System.out.printf(" %d \t %.2f \t %c등급\n", total[i], avr[i], grade[i]);
		}
	}

	public static String createName()
	{
		String name = FIRST_NAME[(int) (Math.random() * (FIRST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)];
		return name;
	}
}
