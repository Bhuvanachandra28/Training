package com.hexaware.mavenspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args) {
		System.out.println("Maven spring app... started");
		/*spring context*/
		ApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml");
		
		/*Read helloWorld bean by its id*/
		HelloWorldSpring hwsObject = (HelloWorldSpring) springContext.getBean("helloWorldBean");
		
		/*call the beans method*/
		hwsObject.printHello();
		
		/*Read helloWorld bean by its id*/
		Quotation qObject = (Quotation) springContext.getBean("quotationBean");
		
		/*call the beans method*/
		qObject.displayQuote();
	}

}
