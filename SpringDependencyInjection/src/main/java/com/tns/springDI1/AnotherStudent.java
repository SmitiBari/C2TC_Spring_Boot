package com.tns.springDI1;

public class AnotherStudent
{

    private MathCheat chit;
	
	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	public void cheating()
	{
		chit.MathCheat();
	}
}
