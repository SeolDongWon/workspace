package ch05.exam_11;

abstract class Calc
{
	//멤버변수
	protected int a;
	protected int b;
	//생성자
	public Calc() {
		super();
	}
	//메소드 - 연산 겟 셋 추상 출력
	abstract void setValue(int a, int b);
	abstract double calculate();
}

class Add extends Calc{
	public Add() {}
	@Override
	void setValue(int a, int b){this.a=a;this.b=b;}
	@Override
	double calculate() {return this.a + this.b;}
}
class Sub extends Calc
{
	public Sub(){}
	@Override
	void setValue(int a, int b){this.a=a;this.b=b;}
	@Override
	double calculate(){return this.a - this.b;}
}
class Mul extends Calc{
	public Mul() {}
	@Override
	void setValue(int a, int b){super.a=a;super.b=b;}
	@Override
	double calculate(){return this.a * this.b;}
}
class Div extends Calc{
	public Div() {}
	@Override
	void setValue(int a, int b){super.a=a;super.b=b;}
	@Override
	double calculate(){return this.a / (double)this.b;}
}
