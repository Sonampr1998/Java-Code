package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String []args) {
	List<Integer> ls = new ArrayList<Integer>();
	ls.add(10);
	ls.add(15);
	ls.add(23);
	ls.add(10);
	ls.add(23);
	ls.add(10);
   System.out.println(ls);
	Set<Integer> s = new HashSet<Integer>(ls);
	System.out.println(s);
	
}
}
