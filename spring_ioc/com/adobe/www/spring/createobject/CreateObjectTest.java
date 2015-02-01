package com.adobe.www.spring.createobject;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class CreateObjectTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/createobject/applicationContext.xml";
	}
	/**
	 * spring容器调用默认的构造函数来创建对象的
	 */
	@Test
	public void test(){
		HelloWorld world = (HelloWorld)context.getBean("helloWorld2");
		world.hello();
	}
}
