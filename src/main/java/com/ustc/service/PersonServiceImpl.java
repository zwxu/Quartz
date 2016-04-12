package com.ustc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.ustc.model.Person;  



public class PersonServiceImpl implements PersonService {
    private static final long serialVersionUID = 1L;
    private static Map<String, Person> ps = new HashMap<String, Person>();
    static {
        Person p1 = new Person();
        p1.setId("1");
        p1.setUsername("zhangsan");
        p1.setDescription("hello");

        Person p2 = new Person();
        p2.setId("2");
        p2.setUsername("lisi");
        p2.setDescription("lisi hehe");

        ps.put(p1.getId(), p1);
        ps.put(p2.getId(), p2);
    }

    public Person getPerson(String id) {
        return ps.get(id);
    }

    public List<Person> getPersons() {
        return new ArrayList(ps.values());
    }

	public Person findPersonById(String id) {
		// TODO Auto-generated method stub
		return ps.get(id);
	}
}  
