package com.ustc.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UserInterceptor implements MethodInterceptor  
//AOP方法拦截器  
{  

 public Object invoke(MethodInvocation arg0) throws Throwable{  

     try {  

         if (arg0.getMethod().getName().equals("printUser"))  
         // 拦截方法是否是UserService接口的printUser方法  
         {  
             Object[] args = arg0.getArguments();// 被拦截的参数  
             System.out.println("interceptor start");  
             System.out.println("user:" + args[0]); 
             System.out.println("interceptor end");  
             arg0.getArguments()[0] = "hello!";// 修改被拦截的参数  

         }  

         //System.out.println(arg0.getMethod().getName() + "---!");  
         return arg0.proceed();// 运行UserService接口的printUser方法  

     } catch (Exception e){  
         throw e;  
     }  
 }  
}  
