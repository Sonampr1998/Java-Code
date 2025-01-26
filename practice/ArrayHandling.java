package com.practice;

import java.util.Arrays;

public class ArrayHandling {

	public static void main(String []args) {
		int[] arr = {1,0,3,0,5};
		int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            if(arr[i]==0){
                boolean count  = true;
                
                System.out.println(i);
                arr[1] = 5;
               
	 }
           
        }
        System.out.println(Arrays.toString(arr));

}
}