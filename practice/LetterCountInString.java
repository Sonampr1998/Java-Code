package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LetterCountInString {
public static void main(String[] args) {
	String str = "Ranjeet Sonam";
	Map<Character,Integer> mp = new HashMap<>();
	for(int i=0;i<str.length();i++) {
	char[] ch = str.toCharArray();
	if(mp.containsKey(ch[i])) {
		mp.put(ch[i],mp.get(ch[i])+1);
	}
	else {
		mp.put(ch[i], 1);
	}
	}
	for(Map.Entry<Character,Integer> entry:mp.entrySet()) {
	System.out.println(entry.getKey()+" - "+entry.getValue());
	}
}
}