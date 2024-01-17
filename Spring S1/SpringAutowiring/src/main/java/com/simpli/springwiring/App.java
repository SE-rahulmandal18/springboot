package com.simpli.springwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      
      Employee emp = context.getBean("emp", Employee.class);
      emp.setId(12);
      emp.setName("Rahul");
      
      System.out.println(emp);
      
    }
}