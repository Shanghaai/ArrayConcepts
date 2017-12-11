package com.sahil.arrays.concepts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import org.apache.commons.lang3.ArrayUtils;
import org.w3c.dom.ls.LSInput;

public class DecreasingIndex {

	
	
	
	public static int[] arrayRightRotation(int[] array,int n,int k)
	{
		int i=array.length-1;
		
		
		int count =1;
		while(count <= k )
		{
			int lastValue = array[array.length-1];
			for(i = array.length-1; i>=1 ;i--)
			{
				array[i] = array[(i-1)];
			}
			array[i] = lastValue;
			count++;
		}
		return array;
	}
    /**
     * @param a
     * @param n
     * @param k
     * @return
     */
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	int[] actualArray =  a;
    	int count= 0 ;
    	while(count != k)
    	{
    		int i = 0;
    		int temp = actualArray[0];
	    	for (i = 0; i < n-1 ; i++) 
	    		{
	    			actualArray[i] = actualArray[i+1];
	    		}
	    		actualArray[i] = temp;
	    		count++;
    	}
    	return actualArray;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5;
        //int n = in.nextInt();
        int k =2;
        //int k = in.nextInt();
        int a[] = new int[n];
        int x=1;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = x;
            x++;
        }
         int[] posNegArray = new int[]{1,-3,2,3,6,-1};
        a = pairWithPositiveNegative(posNegArray);
        //a = arrayLeftRotation(a,n,k);
        int[] rightArray = new int[n];
        rightArray = arrayRightRotation(a, n, k);
        
        System.out.println("\nRight shifting Array");
        for (int i = 0; i < rightArray.length; i++) {
			System.out.print(rightArray[i]+ " ");
        
        /*System.out.println("Left shifting Array ");
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("===================================="+" \n");*/
      
        
       
		}
    }
	
	/**
	 * @param arr
	 * @param d
	 * @param n
	 */
	static /* Function to left rotate arr[] by d of size n */
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotateArray(arr, n);
    }
 
    /**
     * @param arr
     * @param n
     */
    static void leftRotateArray(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
         for (i = 0; i < n - 1; i++)
         {
            arr[i] = arr[i + 1];
         }
            arr[i] = temp;
    }
    
    
    
    public static int[] pairWithPositiveNegative(int[] a)
    {
    	int[] reqArray = null;
    	System.out.println("Required Number :");
    	for (int i = 0; i < a.length; i++) 
    	{
    		for (int j = 0; j < a.length; j++) 
    		{
    			if((a[i] + a[j]) == 0 )
    			{
    				if(a[i] > a[j])
    				{
    					int temp = a[i];
    					a[i] = a[j];
    					a[j] = a[i+1];
    					a[i+1] = temp;
    				}
    				else
    				{
    					a[i+1] = a[j];
    				}
    				
    				reqArray = new int[a.length];
    				reqArray[i] = a[i];
    				reqArray[i+1] = a[i+1];
    				
					System.out.print(reqArray[i]+" "+reqArray[i+1]);
    				i++;
    			}
			}
    	}
		return a;
    }
    
}
