package com.arrayexample;

import java.util.Arrays;
import java.util.Scanner;
//Need to resolve
public class Copy_OneArray_to_Another1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your Array:");
		int rollno[]=new int[sc.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the Array Element:"+i);
			rollno[i]=sc.nextInt();		
			
		}
		System.out.println("Enter the Number of Array you want to copy:");
		int numb1[]=new int[sc.nextInt()];
		
		int numb2[]=new int[numb1.length];
		System.out.println("");
		
		for(int i=0;i<numb1.length;i++)
		{
			numb2[i]=numb1[i];
		}
		//System.out.println("Input Array:"+Arrays.toString(numb1));
		//System.out.println("Copied Array"+Arrays.toString(numb2));
	}

}
