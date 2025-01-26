package com.practice;

public class SumOfSries {
public static void main(String []args) {
	int a=0,b=1;
	int sum = 0;
	for(int i=0;i<=20;i++) {
		System.out.print(a+",");
		int c = a+b;
		a=b;
		b=c;
		if(a%2==0) {
			sum=sum+a;
		}
	}
	
	System.out.println();
	System.out.println("sum of even number:"+sum);
}
}
