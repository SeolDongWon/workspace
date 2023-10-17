package ch04.Exam;

public class Dictionary
{
	// 정적객체배열참조변수
	private static String[] kor = new String[] { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = new String[] { "love", "baby", "money", "future", "hope" };

	// 생성자
	public Dictionary()
	{
	}

	// 정적멤버함수(연산)
	public static String korToEng(String word)
	{
		String returnValue = null;
		for (int i = 0; i < kor.length; i++)
		{
			if (kor[i].equals(word))
			{
				returnValue = eng[i];
				break;
			}
		}
		return returnValue;
	}
}
