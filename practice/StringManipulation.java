package com.practice;

import java.util.StringTokenizer;

public class StringManipulation {
	public static void main(String[] args) {
String s1 = "how are you ranjeet";
System.out.println(s1);
System.out.println(s1.substring(2,12));
System.out.println(s1.replace("ranjeet","sonam"));
StringTokenizer s2 = new StringTokenizer(s1);
while(s2.hasMoreElements()) {
	System.out.println(s2.nextElement());
}
StringBuilder s3 = new StringBuilder(s1);
System .out.println(s3);
}
}