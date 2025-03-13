package com.arrayexample;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array:");

		int age1[] = new int[sc.nextInt()];
		for (int i = 0; i < age1.length; i++) 
		{
			System.out.println("Enter the index value of Array:" + i);
			age1[i] = sc.nextInt();

		}

		System.out.println("Enter the size of the second array:");
		int age2[] = new int[sc.nextInt()];

		for (int i = 0; i < age2.length; i++) 
		{
			System.out.println("Enter the index value of Array:" + i);
			age2[i] = sc.nextInt();
		}

		if (Arrays.equals(age1, age2)) 
		{
			System.out.println("They are Equals");
		} else {
			System.out.println("They are Not Equals");
		}
	}
}

