package com.ustc.service;

import javax.jws.WebService;

import com.ustc.model.Person;  


  
@WebService(endpointInterface = "com.ustc.service.HelloWorld",serviceName="HelloService")  
public class HelloWorldImpl implements HelloWorld{  
  
    public String sayHello(String name) {  
        
        return "hello"+name;  
    }  
  
}  
