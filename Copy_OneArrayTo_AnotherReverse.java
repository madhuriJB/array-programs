package com.arrayexample;

import java.util.Arrays;

public class Copy_OneArrayTo_AnotherReverse {
	public static void main(String[] args) {
		int numb1[]=new int[4];
		numb1[0]=23;
		numb1[1]=43;
		numb1[2]=54;
		numb1[3]=54;
		
		int numb2[]=new int[numb1.length];
		for(int i=0,j=3;i<numb1.length;i++,j--)
		{
			numb2[j]=numb1[i];
			//j--;
		}
		System.out.println("Input Array:"+Arrays.toString(numb1));
		System.out.println("Input Array:"+Arrays.toString(numb2));
	} 
	/*Arrays.toString() is used to convert both numb1 and numb2 
	  arrays into a string representation to print them.*/
	
	//0 1 2 3
	//3 2 1 0

}
