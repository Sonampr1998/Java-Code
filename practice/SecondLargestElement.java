package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {
public static void main(String [] args) {
	int []arr = {10,8,15,9,5,23,2,54};
	/*int max=0;
	int secondLargest=0;
	for(int i = 0;i<=arr.length-1;i++) {
		
		if(arr[i]>max) {
			secondLargest = max;
			max=arr[i];
		}
	}
	System.out.println(secondLargest);*/
	int max =0;
	int min =arr[0];
for(int i = 0;i<=arr.length-1;i++) {
		
		if(arr[i]>max) {
		 max= arr[i];
			
		}
		if(arr[i]<min) {
			min = arr[i];
		}
	}
	System.out.println(max+" "+min);
	int secondLargest1 =Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(secondLargest1);
}
}
