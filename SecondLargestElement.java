package com.java;
import java.util.*;
public class SecondLargestElement {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int n; 
         System.out.println("Enter the size of the array");
         n=sc.nextInt(); 
         int arr[]=new int[n];    
         System.out.println("Enter the array");  
        for(int i=0;i<n;i++)  
        {
            arr[i]=sc.nextInt();
        }
          
    
    Arrays.sort(arr);

   
     System.out.println("Second Largest Number: "+arr[n-2]);

 }

}

