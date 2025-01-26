package com.practice;

public class CountTheNumber {
public static void main(String args[]) {
	/*String a = "234567";
	System.out.println(a.length());*/
	int a=0,n = 564327;
	while(n!=0) {
		n=n/10;
		++a;
		
	}
	System.out.println(a);
	
	
}
}
