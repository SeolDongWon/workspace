package ch05.exam_10_test;

public class Dictionary extends PairMap
{
	private int no;
	String[] keyArray = null;
	String[] valueArray = null;

	public Dictionary(int size)
	{
		keyArray = new String[size];
		valueArray = new String[size];
		no = 0;
	}

	@Override
	String get(String key)
	{
		int i = 0;
		String str = null;
		boolean fineFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				fineFlag = true;
				break;
			}
		}
		
		if (fineFlag == true)
		{
			str = valueArray[i];
		}
		return str;
	}

	@Override
	void put(String key, String value)
	{
		int i = 0;
		boolean fineFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				fineFlag = true;
				break;
			}
		}
		if (fineFlag == true)
		{
			valueArray[i] = value;
		} else if (no >= keyArray.length)
		{
			System.out.printf("배열의 크기를 넘었습니다\n");
		} else
		{
			keyArray[no] = key;
			valueArray[no] = value;
			no++;
		}
	}

	@Override
	String delete(String key)
	{
		int i = 0;
		String str = null;
		boolean fineFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				fineFlag = true;
				break;
			}
		}
		if (fineFlag == true)
		{
			keyArray[no] = null;
			valueArray[no] = null;

			str = "삭제성공";

			for (int j = i; j < no; j++)
			{
				keyArray[j] = keyArray[j + 1];
				valueArray[j] = valueArray[j + 1];
			}

			no--;
			
		} else
		{
			str = "삭제실패";
		}
		return str;
	}

	@Override
	int length()
	{
		return no;
	}

	public void print()
	{
		for (int i = 0; i < keyArray.length; i++)
		{
			System.out.printf("%s\t", keyArray[i]);
		}
		System.out.printf("\n");
		for (int i = 0; i < valueArray.length; i++)
		{
			System.out.printf("%s\t", valueArray[i]);
		}
	}
}
