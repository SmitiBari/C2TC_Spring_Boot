package com.tns.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args)
	{
		
	    ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
	    Student s1 = c.getBean("s1",Student.class);
	    s1.disp();
//	    
//	    Student s2 = c.getBean("s2",Student.class);
//	    s2.disp();
//		
//		Student s1 = new Student("Smiti",86);
//		s1.disp();
	}
}