package com.adobe.www.spring.jdbc;

import java.util.List;

public interface PersonDao {
	public void savePerson();
	
	public List<Person> getPersons();
}
