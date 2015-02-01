package com.adobe.www.spring.hibernate.transaction.annotation;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/hibernate/transaction/annotation/applicationContext.xml";
	}
	
	@Test
	public void test(){
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setPname("干露露");
		person.setPsex("aaa");
		personService.savePerson(person);
	}
}
