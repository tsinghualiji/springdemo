package com.adobe.www.spring.hibernate.transaction.annotation;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl  implements PersonDao{
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(person);
	}
}
