package ch05.exam_09_1;

public class StringStack implements Stack
{
	// 문자열을 저장할 수 있는 배열을 선언하고 위치를 저장하는 인덱스를 설계
	// 멤버변수
	private String[] data;
	private int index;
	// 생성자
	public StringStack(int size){
		data = new String[size];
		index = 0;
	}

	@Override
	public int length()	{
		return index;
	}

	@Override
	public int capacity(){
		return 0;
	}

	@Override
	public String pop(){
		String value = null;
		if(index>0) {
			index--;
			value = data[index];
		}else {
			System.out.printf("더이상 줄 값이 없습니다.\n");
		}
		return value;
	}

	@Override
	public boolean push(String val){
		if (index >= data.length)
		{
			System.out.printf("스택이 꽉 차서 푸시 불가!\n");
			return false;
		} else
		{
			data[index] = val;
			index++;
			return true;
		}
	}
}
