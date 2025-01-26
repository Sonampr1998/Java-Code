package com.practice;

public class ReverseNumber {
public static void main(String []args) {
	int a = 23456;
	int rev =0;
	while(a>0) {
		int remendr = a%10;
		rev = rev*10+remendr;
		a= a/10;
	}
	System.out.println(rev);
}
}
