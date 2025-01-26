package com.practice;

import java.util.HashMap;
import java.util.Map;


public class WordCountInString {
public static void main(String args[]) {
	String s = "My name is Sonam and My husband name is Ranjeet";
	Map<String,Integer> m = new HashMap<>();
	String[] s1 = s.split(" ");
	for(int i=0;i<s1.length;i++) {
		if(m.containsKey(s1[i])) {
			m.put(s1[i],m.get(s1[i])+1);
		}
		else {
			m.put(s1[i],1);
		}
	}
		for(Map.Entry<String,Integer>entry:m.entrySet()) {
			System.out.println(entry.getKey()+" is occur "+ entry.getValue()+" times in the string");
		}
	
}
}
