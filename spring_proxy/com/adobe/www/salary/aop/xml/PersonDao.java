package com.adobe.www.salary.aop.xml;

import java.util.List;

import com.adobe.www.spring.aop.xml.Person;

/**
 * 目标接口
 * @author Administrator
 *
 */
public interface PersonDao {
	public void savePerson();
	public void updatePerson();
	public void deletePerson();
	public List<Person> getPerson();
}
