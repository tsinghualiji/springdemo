package com.adobe.www.spring.extend;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/extend/applicationContext.xml";
	}
	
	@Test
	public void test(){
		Student student = (Student)context.getBean("student");
		student.say();
	}
}
