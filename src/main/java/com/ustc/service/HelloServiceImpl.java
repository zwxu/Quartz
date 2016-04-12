package com.ustc.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.ustc.model.Person;  



@WebService(endpointInterface = "com.ustc.service.HelloService",serviceName="helloService")  
public class HelloServiceImpl implements HelloService{  
  
    public String sayHello(String name) {  
        
        return "hello"+name;  
    }  
  
}  
