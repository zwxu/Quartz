package com.ustc.common;

import javax.annotation.Resource;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustc.service.HelloService;

public class Client {
	/* Autowired byType Service byName*/
	
	 //此时可不启动web项目，直接测试
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");
        //HelloWorld helloService = (HelloWorld) context.getBean("helloService");
        HelloService helloService = (HelloService) context.getBean(HelloService.class);
        String response = helloService.sayHello("Peter");
        System.out.println(response);
    }
 
}
