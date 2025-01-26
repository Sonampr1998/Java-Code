package com.practice;

public class CountEvenOddNumber {
public static void main(String[] args) {
	int counteven = 0,countodd=0, num = 467229;
	
	while(num>0) {
		int remd = num%10;
		if(remd%2==0) {
			counteven++;
		}
		else{
			countodd++;
		}
		num=num/10;
	}
	
	System.out.println("evencount"+counteven+" "+"oddcount"+countodd);
}
}
