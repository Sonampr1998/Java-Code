package com.practice;

import java.io.Console;

public class TestConsole {
public static void main(String [] args) {
	Console c = System.console();
	System.out.println("enter your name:");
	String name = c.readLine();
	System.out.println("welcome to ="+name);
	System.out.println("enter password");
	char[] ch =c.readPassword();
	System.out.println(ch);
	String pwd = String.valueOf(ch);
	System.out.println(pwd);
}
}
