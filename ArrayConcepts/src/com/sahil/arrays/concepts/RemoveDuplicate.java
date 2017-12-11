package com.sahil.arrays.concepts;
/* Java Program Example - delete Element from Array */
	
import java.util.Scanner;

public class RemoveDuplicate
{
   public static void main(String args[])
   {
	   int[] arr = {0,2,3,1,1,6,3,4};
	   
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i] == 3)
           {
               for(int j=i; j<(arr.length-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               break;
           }
       }
           System.out.print("Element Deleted Successfully..!!");
           System.out.print("\nNow the New Array is :\n");
           for(int i=0; i<(arr.length); i++)
           {
               System.out.print(arr[i]+ " ");
           }
   }
}