package com.practice;

public class ReverseString {
 public static void main(String []args) {
	 String str = "sonam is good girl";
	 String rev="";
		/*
		 * char []str1=str.toCharArray(); int len = str.length()-1; while(len >=0) {
		 * rev= rev+str1[len]; len= len-1; }
		 */
	 for(int i=str.length()-1;i>=0;i--) {
		 rev = rev +str.charAt(i);
	 }
	 System.out.println(rev);
	 StringBuffer sb = new StringBuffer(str);
	  System.out.println(sb.reverse());
	  StringBuilder st = new StringBuilder(str);
	  System.out.println(st.reverse());
 }
}
