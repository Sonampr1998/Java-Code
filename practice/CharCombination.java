package com.practice;

public class CharCombination {
	public static void main(String args[]) {
	String s= "abcde";
	int n = s.length();
	CharCombination permutation = new CharCombination();
	permutation.count(s,0,n-1);
}
private void count(String s,int a, int b) {
	if(a==b) {
		System.out.println(s);
	}
	else {
		for(int i =a;i<=b;i++) {
			s= swap(s,a,i);
			count(s,a+1,b);
			s = swap(s,a,i);
		}
	}
	
}
//public String swap(String l,int i,int j) {
	public String swap(String l,int i,int j) {
	char temp;
	char[] charArray = l.toCharArray();
	temp = charArray[i];
	charArray[i] = charArray[j];
	charArray[j] = temp;

	return String .valueOf(charArray);
	
	
	
}
}
