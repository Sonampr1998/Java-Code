package com.practice;

public class ReverseWordInString {
public static void main (String []args) {
	String str = "ranjeet is bad boy";
	String []s1 =str.split(" ");
	String  revString = "";
	for(int i =0;i<s1.length;i++) {
		String word = s1[i];
		String rev ="";
		for(int j =word.length()-1;j>=0;j--) {
			rev= rev+word.charAt(j);
		}
		revString = revString+rev+" ";
	}
	System.out.println(str);
	System.out.println(revString);
}
}
