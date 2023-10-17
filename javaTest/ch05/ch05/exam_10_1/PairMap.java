package ch05.exam_10_1;

abstract class PairMap
{
	
	protected String keyArray [];  // key를 저장하는 배열
	protected String valueArray[]; // value를 저장하는 배열
	public PairMap() {
		super();
	}
	abstract String get(String key); // key값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value);// key와 value를 쌍으로 저장, 기존에 key가 있으면 value로 수정
	abstract String delete(String key);//key값을 가진 아이템 (value와 함께)삭제
	abstract int length();//현재 저장된 아이템의 개수 리턴
}
