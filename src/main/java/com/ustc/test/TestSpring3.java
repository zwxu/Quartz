package com.ustc.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ustc.model.User;
import com.ustc.service.UserService;  
  
public class TestSpring3{  
  
    public static void main(String[] args){  
      /*  ApplicationContext ctx = new FileSystemXmlApplicationContext(  
                "classpath:applicationContext-server.xml");  */
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-server.xml");      
          
        UserService us = (UserService) ctx.getBean("userService");  
        User user=us.find(1);
        System.out.println(user.getUsername());
    }
}
