package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> ls = new ArrayList<Integer>();
    ls.add(20);
    ls.add(30);
    ls.add(10);
    ls.add(15);
    ls.add(10);
    
   List<Integer> ls1 = ls.parallelStream().filter(a->a>10).collect(Collectors.toList());
   List<Integer> ls2 = ls.stream().map(a->a*2).collect(Collectors.toList());
   Integer ls3 = ls.stream().min(Integer::compare).get();
   Integer ls4= ls.stream().max(Integer::compare).get();
   System.out.println(ls1);
   System.out.println(ls2);
   System.out.println(ls3);
   System.out.println(ls4);
	}

}
