package ch05.exam_10_1;

public class Dictionary extends PairMap
{
	// 변수 : 키 문자열, 밸류 문자열, 문자열 카운트
	private String[] keyArray;
	private String[] valueArray;
	private int index;

	// 생성자 : 키 밸류 문자열 사이즈를 파라미터로 받는 생성자
	public Dictionary(int size)
	{
		super();
		keyArray = new String[size];
		valueArray = new String[size];
		index = 0;
	}

	@Override
	String get(String key)
	{
		String str = null;
		for (int i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				str = valueArray[i];
				break;
			}
		}
		return str;
	}

	@Override
	void put(String key, String value)
	{
		int i = 0;
		boolean findFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				findFlag = true;
				valueArray[i] = value;
				break;
			}
		}
		if (!findFlag)
		{
			keyArray[index] = key;
			valueArray[index] = value;
			index++;
		}

	}

	@Override
	String delete(String key)
	{
		int i = 0;
		String str = null;
		boolean findFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				findFlag = true;
				str = "삭제성공";
				break;
			}
		}

		if (findFlag)
		{
			for (int j = i; j < index; j++)
			{
				keyArray[j] = keyArray[j + 1];
				valueArray[j] = valueArray[j + 1];
			}
			index--;
		} else
		{
			str = "삭제실패";
		}
		return str;
	}

	@Override
	int length()
	{
		return index;
	}

	public void print()
	{
		line();
		System.out.printf("\n|index\t|");
		for (int i = 0; i < keyArray.length; i++)
		{
			System.out.printf("   %d\t|", i);
		}
		line();
		System.out.printf("\n|key\t|");
		for (int i = 0; i < index; i++)
		{
			System.out.printf("%s\t|", keyArray[i]);
		}
		line();
		System.out.printf("\n|value\t|");
		for (int i = 0; i < index; i++)
		{
			System.out.printf("%s\t|", valueArray[i]);
		}
		line();
	}

	public void line()
	{
		System.out.printf("\n");
		for (int i = 0; i < keyArray.length + 1; i++)
		{
			System.out.printf(" ------\t");
		}
	}
}
