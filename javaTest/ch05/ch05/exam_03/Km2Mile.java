package ch05.exam_03;

public class Km2Mile extends Converter
{
    
	public Km2Mile(double ratio)
	{
		super();
		this.ratio=ratio;
	}
	@Override
	protected double convert(double src){
		return src / this.ratio;
	}
	@Override
	protected String getSrcString(){
		return "Km";
	}
	@Override
	protected String getDestString(){
		return "mile";
	}

}
