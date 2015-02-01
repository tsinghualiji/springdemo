package cn.itcast.spring0909.mvc.spring.annotation;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/mvc/spring/annotation/applicationContext.xml";
	}
	
	@Test
	public void test(){
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
