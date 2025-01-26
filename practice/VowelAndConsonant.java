package com.practice;

import java.util.Map;
import java.util.TreeMap;

public class VowelAndConsonant {
public static void main(String [] args) {
	String st = "ranjeetsonam";
	int vowel =0;
	//int consonant=0;
	Map<Character, Integer> m = new TreeMap<>();
	
	char ch[] = st.toCharArray();
	for(int i=0;i<ch.length;i++) {			
			if(m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i])+1);
			}
			else {
				m.put(ch[i],1);
			}
			
		}
	
	for(Map.Entry<Character,Integer> entry:m.entrySet()) {
		if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u') {
		 vowel++;
	 System.out.println(entry.getKey()+" - "+entry.getValue());
		
	}
		 
		
}
	System.out.println(vowel);
}
}
