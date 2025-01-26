package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionRevision {
public static void main(String []args) {
	/*List<Integer> li = new ArrayList<Integer>();
	li.add(10);
	li.add(15);
	li.add(24);
	li.add(54);
	li.add(33);
	System.out.println(li); 
	Collections.sort(li);
	System.out.println(li);
	li.remove(2);
	System.out.println(li);
	li.set(3,99);
	System.out.println(li);
	//Set<Integer> s = new HashSet<Integer>();
	Set<Integer> s = new TreeSet<Integer>();
	s.add(10);
	s.add(15);
	s.add(24);
	s.add(54);
	s.add(33);
	s.add(10);
	s.add(54);
	Iterator<Integer> itr = s.iterator();
	while(itr.hasNext()) {
		int i = itr.next();
		System.out.println(i);
	}
	System.out.println(s);*/
	//Map<Integer,String> mp = new HashMap<Integer,String>();
	Map<Integer,String> mp = new TreeMap<Integer,String>();
	mp.put(4,"sonam");
	mp.put(2, "nazia");
	mp.put(1, "ranjeet");
	mp.put(3, "hardik");
	mp.put(7, "ranjeet");
	for(Map.Entry<Integer,String> entry:mp.entrySet()) {
	System.out.println(entry.getKey()+" = "+entry.getValue());
	}
}
}
