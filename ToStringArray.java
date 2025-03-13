package com.arrayexample;

import java.util.Arrays;

public class ToStringArray {
public static void main(String[] args) {
	int age[]=new int[3];
	age[0]=22;
	age[1]=33;
	age[2]=23;
	
	Arrays.sort(age);
	System.out.println(Arrays.toString(age));
}
}
