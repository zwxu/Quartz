package com.ustc.common;

import org.apache.cxf.frontend.ServerFactoryBean;

import com.ustc.service.HelloService;
import com.ustc.service.HelloServiceImpl;

public class Server {
	 
    public Server() throws Exception{
        HelloServiceImpl hw = new HelloServiceImpl();
        ServerFactoryBean sfb = new ServerFactoryBean();
        sfb.setServiceClass(HelloService.class);
        sfb.setServiceBean(hw);
        sfb.setAddress("http://localhost:9000/Hello");
        sfb.create();
    }
     
    public static void main(String[] args) throws Exception{
        new Server();
        System.out.println("server start ...");
        Thread.sleep(5*60*1000);
        System.out.println("server exit ...");
        System.exit(0);
    }
 
}
