package com.simpli.storeapp;

import java.time.LocalDate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simpli.storeapp.dao.ProductDao;
import com.simpli.storeapp.domain.Product;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("storeapp-module.xml");
        
        ProductDao productDao  = context.getBean("productDao", ProductDao.class);
       
        System.out.println(productDao.insert(new Product("LG",45000, LocalDate.now() )));
        System.out.println(productDao.insert(new Product("Sony",35000, LocalDate.now() )));
        System.out.println(productDao.insert(new Product("Samsung",25000, LocalDate.now() )));
        System.out.println(productDao.insert(new Product("Dell",27000, LocalDate.now() )));
        
        System.out.println(productDao.update(new Product(3,"Samsung",25500, LocalDate.now() )));
        
        System.out.println(productDao.getAllProducts());
        
        System.out.println(productDao.getProductById(2));
        
        System.out.println(productDao.delete(2));
        
        context.registerShutdownHook();
        context.close();
    }
}
