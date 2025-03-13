package com.arrayexample;

import java.util.Arrays;

public class ToStringArray1_ArrayEquals {
	public static void main(String[] args) {
		int rollno1[]=new int[3];
		rollno1[0]=11;
		rollno1[1]=66;
		rollno1[2]=43;
		
		int rollno2[]=new int[3];
		rollno2[0]=22;
		rollno2[1]=26;
		rollno2[2]=43;
		
		//Arrays.sort(rollno1);
		boolean b1=Arrays.equals(rollno1, rollno2);	
		System.out.println(b1);
	}

}
