package com.simpli.springzeroxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      
      Instructor instructor= context.getBean("instr", Instructor.class);
      
      System.out.println(instructor);
    }
}
