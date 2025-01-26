package com.practice;

public class AddBinaryNumbers {
public static void main(String []args) {
	int b1 = 0b1010;
	int b2 = 0b1011;
	int sum = b1+b2;
	String bn = "111000";
	double decimal = 0;
	
	int num = 11001;
	System.out.println(Integer.toBinaryString(sum));
	System.out.println(sum);
	for(int i =bn.length()-1;i>=0;i--) {
		int digit = Character.getNumericValue(bn.charAt(i));
		int power = bn.length()-i-1;
		int decimalValue=digit*(int)Math.pow(2, power);
		decimal+=decimalValue;
	}
	
	System.out.println(bn+" -> "+decimal);
}
}
