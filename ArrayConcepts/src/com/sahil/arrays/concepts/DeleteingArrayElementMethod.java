package com.sahil.arrays.concepts;

import org.apache.commons.lang3.ArrayUtils;


public class DeleteingArrayElementMethod {
	
	
	public static void main(String[] args) {

		int[] arr = {0,2,3,1,1,6,3,4};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length-1; j++) {
			
				if(arr[i] == arr[j+1])
				{
					for (int j2 = i; j2 < arr.length-1; j2++) {
					
						arr[j2] = arr[j2+1];
					}
				}
			}
			
			/*if(arr[i] == arr[j+1])
			{
				arr = ArrayUtils.remove(arr, arr[i]);
			}
			*/
			//or we can use 
			
		}
		
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("array : "+arr[i]);	
		}
		
		
	}

}
