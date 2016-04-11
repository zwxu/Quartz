package com.ustc.common;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustc.service.HelloWorld;

public class Client {
	 
    public static void main(String[] args) {
       /* ClientProxyFactoryBean clientFactory = new ClientProxyFactoryBean();
        clientFactory.setAddress("http://localhost:9000/Hello");
        HelloWorld hw = clientFactory.create(HelloWorld.class);
        System.out.println(hw.sayHello("yaokj"));*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");
        //HelloWorld helloService = (HelloWorld) context.getBean("client");
        HelloWorld helloService = (HelloWorld) context.getBean(HelloWorld.class);
        String response = helloService.sayHello("Peter");
        System.out.println(response);
    }
 
}
