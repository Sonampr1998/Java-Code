package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheNumber {
public static void main(String []args) {
	List<Integer> li = new ArrayList<Integer>();
	li.add(3);
	li.add(6);
	li.add(10);
	li.add(12);
	List<Double> l1 = li.stream().map(x->Math.pow(x, 2)).collect(Collectors.toList());
	List<Integer> l2 = li.stream().filter(x->x>=10).collect(Collectors.toList());
	System.out.println(l2);
	System.out.println(l1);
	
}
}
