package com.practice;

import java.util.Arrays;

public class ForTest {
	
public static void fetchLongestElement(String[] strings) {
	int maxLength = Arrays.stream(strings).mapToInt(string->string.length()).max().orElse(0);
			
    System.out.println(maxLength);
}
public static void main(String [] args) {
	String [] string = {"Apple","Banana","Apricote","Grapes"};
	fetchLongestElement(string);
}
}
