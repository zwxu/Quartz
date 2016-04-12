package com.ustc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustc.model.Person;
import com.ustc.service.HelloService;
import com.ustc.service.PersonServiceImpl;

@Controller
@RequestMapping(value = "/api/person")
public class PersonController {
	//注入webservice
	@Resource
	private HelloService helloServiceClient;
	
	PersonServiceImpl service=new PersonServiceImpl();
	/* 
	 * 1.@PathVariable
	 * 2.@RequestParam
	 * */
	
	@ResponseBody
	@RequestMapping(value="/index",method = RequestMethod.GET,produces="application/json")
	public Person show(@RequestParam String id ) {
		Person p=service.getPerson(id);
        System.out.println(id);
		return p;
	}
	
	@ResponseBody
	@RequestMapping(value="/test",method = RequestMethod.GET,produces="application/json")
	public String test() {
		
		return helloServiceClient.sayHello("china");
	}
}
