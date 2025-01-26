package com.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n = 153;
     String str = String.valueOf(n);
     int digit =n;
     double sum =0;
     int m = str.length();
    while(n!=0) {
    	int  remdr =n%10;
    	sum = sum+Math.pow(remdr,m);
    	n=n/10;
     }
    System.out.println(sum);
    	if(digit==sum)	{
    		System.out.println("Armstrong Number");
    	}
    	else {
    		System.out.println("not a asrmstrong number");
    	}
	}

}
