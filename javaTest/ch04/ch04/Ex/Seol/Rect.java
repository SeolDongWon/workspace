package ch04.Ex.Seol;

class Rect
{
	protected int x = 5;

	public void f()
	{
		x++;
		System.out.print(x);
	}
}
class SpecialRect extends Rect {
	public void f() {
		System.out.print(super.x);
	}
}
