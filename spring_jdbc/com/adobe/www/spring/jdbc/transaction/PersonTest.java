package com.adobe.www.spring.jdbc.transaction;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/jdbc/transaction/applicationContext.xml";
	}

	@Test
	public void test(){
		PersonService personService = (PersonService)context.getBean("personService");
		System.out.println(personService);
		personService.savePerson();
	}
}

