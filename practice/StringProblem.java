package com.practice;

public class StringProblem {
 public static void main (String []args) {
	 String str ="s o n a m p r a w e e n";
	int count =0;
	/*char[] ch = str.toCharArray();
	for(int i = 0;i<=ch.length-1;i++) {
	if(ch[i]==' ') { 
		count++;
	}
	}
	System.out.println(count);*/
	for(char ch: str.toCharArray()) {
		if(ch==' ') {
			count++;
		}
		}
		System.out.println(count);
		}
	
	
	 }

