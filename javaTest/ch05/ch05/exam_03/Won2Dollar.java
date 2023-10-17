package ch05.exam_03;

//원화를 달러로 변환하는 클래스
public class Won2Dollar extends Converter{
	//멤버변수
	//생성자(디생+부모디생)
	
	public Won2Dollar(double ratio){
		super();
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src){
		return src / this.ratio;
	}
	@Override
	protected String getSrcString(){
		return "원";
	}
	@Override
	protected String getDestString(){
		return "달러";
	}
}
