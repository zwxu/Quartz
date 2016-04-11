package com.ustc.service;

import com.ustc.model.Person;
import javax.jws.WebService;  

@WebService  
public interface HelloWorld {  
      
    public String sayHello(String name);  
      
} 
