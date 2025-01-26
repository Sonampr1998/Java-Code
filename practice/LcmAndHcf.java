package com.practice;

public class LcmAndHcf {
public static void main(String [] args) {
	int a =10,b=20,c=5,i;
	int hcf=1;
	int greater = a>b && a>c?a:b>c?b:c;
	int product = a*b*c;
	for( i = greater; i<=product;i++) {
	   if(i%a==0&&i%b==0&&i%c==0) {
			break;
		}
	}
	for(int j =1;j<100;j++) {
		if(a%j==0&&b%j==0&&c%j==0) {
			hcf=hcf*j;
		}
	}
	System.out.println("LCM of 3 numbers is:"+i);
	System.out.println("HCF of 3 numbers is:"+hcf);
}
}
