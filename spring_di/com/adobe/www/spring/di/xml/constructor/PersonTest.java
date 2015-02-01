package com.adobe.www.spring.di.xml.constructor;

import java.util.List;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/di/xml/constructor/applicationContext.xml";
	}
	
	@Test
	public void test(){
		Person person = (Person)context.getBean("person");
		person.getStudent().say();
	}
}
