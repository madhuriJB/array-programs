package com.arrayexample;

public class ArrayIndexException_Program {
	public static void main(String[] args) {

		try {
			int rollno[] = new int[4];
			rollno[0] = 32;
			rollno[1] = 76;
			rollno[2] = 12;
			rollno[3] = 21;
			rollno[4] = 77;

			for (int i = 0; i < rollno.length; i++) 
			{
				System.out.println("Roll_no:");
				System.out.println(rollno[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e1) 
		{
			System.out.println("Exception Handled");
		}

	}
}