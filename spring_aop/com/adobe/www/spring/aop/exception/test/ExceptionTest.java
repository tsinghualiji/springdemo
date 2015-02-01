package com.adobe.www.spring.aop.exception.test;

import org.junit.Test;

import com.adobe.www.spring.aop.exception.action.PersonAction;
import com.adobe.www.spring.utils.SpringHelper;

public class ExceptionTest extends SpringHelper{
	static{
		path = "applicationContext-exception.xml";
	}
	@Test
	public void test() throws Exception{
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
