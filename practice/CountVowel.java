package com.practice;

public class CountVowel {
public static void main(String []args) {
	String s = "eagle";
	int count =0;
	char ch[] =s.toCharArray();
	for(int i =0;i<=ch.length-1;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]== 'i'||ch[i]=='o'||ch[i]== 'u') {
			count++;
		}
		
		//System.out.println(ch[i]+" number of times:"+count);
	}
	

	System.out.println("total number of vowel in a given string is:"+count);
	
}
}
