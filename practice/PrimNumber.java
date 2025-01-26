package com.practice;

public class PrimNumber {
public static void main(String [] args) {
	int a=19;
	int flag=0;
	
	for(int i=2;i<=a/2;i++) {
		if(a%i==0) {
			flag=1;
			break;
		}
	}
		if(flag==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
}
}
