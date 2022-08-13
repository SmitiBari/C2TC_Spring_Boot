package com.tns.springAW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;
	
	public Human()
	{
		this.heart = heart;
	}
	
	//DI using constructor
	public Human(Heart heart) {
		
		this.heart = heart;
	}

	//DI using setter method
    @Autowired
    @Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void startPumping()
	{
		heart.pump();
		System.out.println("name of the animal is : " +heart.getNameOfAnimal() + " no of heart present is : " +heart.getNoOfHeart());
	}
}
