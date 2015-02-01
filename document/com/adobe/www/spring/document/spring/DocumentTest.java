package com.adobe.www.spring.document.spring;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class DocumentTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/document/spring/applicationContext.xml";
	}
	@Test
	public void test(){
		DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
		documentManager.read();
	}
}
