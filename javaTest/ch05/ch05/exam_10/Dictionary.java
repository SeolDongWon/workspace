package ch05.exam_10;

public class Dictionary extends PairMap
{
	private int no;

	public Dictionary(int size)
	{
		super.keyArray = new String[size];
		super.valueArray = new String[size];
		this.no = 0; //
	}

	@Override
	String get(String key)
	{
//		String str = null;
//		for (int i = 0; i < keyArray.length; i++)
//		{
//			if (keyArray[i] != null && keyArray[i].equals(key))
//			{
//				str = valueArray[i];
//				break;
//			}
//		}
//		return str;
// ================================================= 여기까지 내가한거
		boolean findFlag = false;
		int i = 0;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				findFlag = true;
				break;
			}
		}

		if (findFlag == true)
		{
			return valueArray[i];
		}

		return null;

	}

	@Override
	void put(String key, String value)
	{
//		int i = 0;
//		boolean findFlag = false;
//		for (i = 0; i < keyArray.length; i++)
//		{
//			if (keyArray[i] != null && keyArray[i].equals(key))
//			{
//				findFlag = true;
//				keyArray[i] = key;
//				valueArray[i] = value;
//				break;
//			}
//		}
//
//		if (!findFlag)
//		{
//			keyArray[no] = key;
//			valueArray[no] = value;
//			no++;
//		}
//		return;
		// ================================================= 여기까지 내가한거
		int i = 0;
		boolean findFlag = false;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				findFlag = true;
				break;
			}
		}

		if (findFlag == true)
		{
			valueArray[i] = value;
		} else if (no >= keyArray.length)
		{
			System.out.printf("배열범위를 넘었습니다.\n");
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
//		String tmpKey = key;
//		for (int i = 0; i < keyArray.length; i++)
//		{
//			if (keyArray[i] != null && keyArray[i].equals(key))
//			{
//				keyArray[i] = null;
//				valueArray[i] = null;
//				break;
//			}
//		}
//		return tmpKey;
//=================================================	 여기까지는 내가한거	

		boolean findFlag = false;
		String deleteStr = null;
		int i = 0;
		for (i = 0; i < keyArray.length; i++)
		{
			if (keyArray[i] != null && keyArray[i].equals(key))
			{
				findFlag = true;

				break;
			}
		}
		
		if (findFlag == true)
		{
			keyArray[i] = null;
			valueArray[i] = null;
			no--;
			deleteStr = "삭제완료";

			for (int j = i; j < keyArray.length - 1; j++)
			{
				keyArray[j] = keyArray[j + 1];
				valueArray[j] = valueArray[j + 1];
			}
		} else
		{
			deleteStr = "삭제실패";
		}

		return deleteStr;
	}

	@Override
	int length()
	{
		return this.no;
	}

	void print()
	{
		for (int i = 0; i < no; i++)
		{
			System.out.printf("%s\t", keyArray[i]);
		}
		System.out.printf("\n");
		for (int i = 0; i < no; i++)
		{
			System.out.printf("%s\t", valueArray[i]);
		}
	}
}
