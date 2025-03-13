package com.arrayexample;

import java.util.Scanner;

public class ArrayValue_AtRuntime {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your Array:");
		int rollno[]=new int[sc.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the index value of Array:"+i);
			rollno[i]=sc.nextInt();		
			
		}
	}

}
