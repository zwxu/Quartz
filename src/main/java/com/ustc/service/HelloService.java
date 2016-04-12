package com.ustc.service;

import com.ustc.model.Person;
import javax.jws.WebService;  

@WebService  
public interface HelloService {  
      
    public String sayHello(String name);  
      
} 
