package com.adobe.www.spring.aop.xml.salary;

import org.junit.Test;

import com.adobe.www.spring.utils.SpringHelper;

public class SalaryTest extends SpringHelper{
	static{
		path = "cn/itcast/spring0909/aop/xml/salary/applicationContext.xml";
	}
	@Test
	public void test(){
		SalaryManager salaryManager = (SalaryManager)context.getBean("salaryManager");
		salaryManager.showSalary();
	}
}
