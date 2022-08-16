package com.hexaware.mavenspringapp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.mavenspringapp2.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mavin Spring App2 started...." );
        // Spring Context
        ApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml");
        
        //Read helloWorld bean by its id
        
        HelloWorld hwObject = (HelloWorld) springContext.getBean("helloBean");
        
        //calls the bean's method
        hwObject.printHello();
    }
}