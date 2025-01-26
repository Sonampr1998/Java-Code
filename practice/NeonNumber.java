package com.practice;

public class NeonNumber {
public static void main(String [] args) {
	int n = 9;
	int sum = 0;
	int m =n*n;
	while(m>0) {
		int r=m%10;
		sum= sum+r;
		m=m/10;
	}
	if(sum==n) {
		System.out.println("Neon Number");
	}
	else {
		System.out.println("not a Neon Number");
	}
}
}
