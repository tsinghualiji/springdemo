package com.adobe.www.exception.test;

import org.junit.Test;

import com.adobe.www.exception.ServiceInvocation;
import com.adobe.www.exception.ServiceMapping;

public class ExceptionTest {
	@Test
	public void test(){
		ServiceMapping serviceMapping = new ServiceMapping();
		serviceMapping.setServiceClass("cn.itcast.exception.service.StudentServiceImpl");
		serviceMapping.setMethod("savePerson");
		ServiceInvocation.execution(serviceMapping);
	}
}
