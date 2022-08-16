package com.hexaware.mavenspringapp2;

public class HelloWorld {
	
	private String userName = "";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void printHello() {
		System.out.println("Hello this is " + this.getUserName() + " spring app, welcome to spring world");
	}

}