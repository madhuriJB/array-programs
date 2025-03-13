package com.arrayexample;

import java.util.Scanner;

public class ArrayValue_Runtime {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int age[]=new int[sc.nextInt()];
			
		for(int i=0;i<age.length;i++) 
		{
			System.out.println("Enter the value of i:"+i);
			age[i]=sc.nextInt();
		}
		
	}

}
