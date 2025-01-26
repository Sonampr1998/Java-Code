package com.practice;

public class Palindrom {
public static void main(String [] args) {
	int n = 12321;
	int count =0;
	int m = n;
	while(n>0) {
		int rem = n%10;
		count = count*10+rem;
		n=n/10;
	}
	if(m==count) {
	System.out.println("Palindrom");
	}
	else {
		System.out.println("not a palindrom");
	}
}
}
