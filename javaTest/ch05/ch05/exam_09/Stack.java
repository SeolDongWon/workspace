package ch05.exam_09;

//인터페이스의 구성 : 추상메소드, 상수 << 모호성발생 방지
interface Stack{
	//멤버변수(상수)
	//생성자없음
	//멤버함수(추상메소드)
	public abstract int length();	// 현재 스택에 저장된 개수 리턴
	public abstract int capacity();	// 스택의 전체 저장 가능한 개수 리턴
	public abstract String pop();	// 스택의 톱(top)에 실수 저장
	public abstract boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}
