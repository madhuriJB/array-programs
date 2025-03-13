package com.arrayexample;

import java.util.Arrays;

public class Copy_OneArray_to_Another {
public static void main(String[] args) {
	int numb1[]=new int[3];
	numb1[0]=32;
	numb1[1]=43;
	numb1[2]=20;
	
	int numb2[]=new int[numb1.length];
	for(int i=0;i<numb1.length;i++)
	{
		numb2[i]=numb1[i];
	}
		System.out.println("Input Array:"+Arrays.toString(numb1));
		System.out.println("Copied Array"+Arrays.toString(numb2));
  }
}
