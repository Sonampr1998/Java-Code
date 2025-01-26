package com.practice;

import java.util.Arrays;

public class Anagram {
public static void main(String []args) {
	String str = "silent";
	String str1 ="listen";
	int count = 0;
	char [] str2 = str.toCharArray();
	char [] str3 = str1.toCharArray();
	Arrays.sort(str2);
	Arrays.sort(str3);
	for(int i =0;i<=str.length()-1;i++) {
		if(str2[i]==str3[i]) {
			count++;
		}
	}
	/*for(int i=0; i<=str.length()-1; i++) {
		for(int j=0;j<=str1.length()-1;j++) {
			if(str2[i]==str3[j]) {
				count++;
			}
		}
	}*/
	if(count==str.length()) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not a anagram");
	}
}
}
