package com.hexaware.mavenspringapp;

public class HelloWorldSpring {
	
	private String userName = " ";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void printHello() {
		System.out.println("Hello.." + this.getUserName() + " welcome to spring world ");
}
}
