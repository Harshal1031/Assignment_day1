package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
            int arr[]= {1,2,3,4,5,6,7};
            insertion(arr);
            delete(arr);
            
	}

	private static void delete(int[] arr) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Entre the position");
        int pos=sc.nextInt();
        int arr2[]=new int[arr.length-1];
        for(int i=0;i<arr2.length;i++) {
        	if(i>=pos) {
        		arr2[i]=arr[i+1];
        	}else {
        		arr2[i]=arr[i];
        	}
        }
        System.out.println(Arrays.toString(arr2));


	}

	private static void insertion(int[] arr) {
		Scanner sc=new Scanner(System.in);
           System.out.println("Entre the key and position");
           int key=sc.nextInt();
           int pos=sc.nextInt();
           int arr2[]=new int[arr.length+1];
           for(int i=0;i<arr.length;i++) {
        	   arr2[pos]=key;
        	   if(i<pos) {
        		   arr2[i]=arr[i];
        	   }else {
        		   arr2[i+1]=arr[i];
        	   }
           }
           System.out.println(Arrays.toString(arr2));

	}

}
