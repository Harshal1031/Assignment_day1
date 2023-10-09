package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        toBinary(num);
    
	}

	private static void toBinary(int num) {
		System.out.println("Binary ::");
		StringBuilder binary=new StringBuilder();
         while(num>0) {
        	 if(num%2==0) {
        		 binary.append("0");
        		 }else{
            		 binary.append("1");
 
        	 }
        	 num=num/2;
         }
         System.out.println(binary.reverse());
         
	}

		
	}


