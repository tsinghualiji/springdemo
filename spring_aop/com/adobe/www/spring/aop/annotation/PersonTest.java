package com.adobe.www.spring.aop.annotation;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

/**
 * 
 * @author Administrator
 *
 */
public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/aop/annotation/applicationContext.xml";
	}
	
	@Test
	public void test(){
		PersonDaoImpl personDao = (PersonDaoImpl)context.getBean("personDao");
		personDao.getPerson();
	}
}
