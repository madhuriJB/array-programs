package com.arrayexample;

import java.util.Arrays;

public class Count_Of_Given_String {
	public static void main(String[] args) {
		int count_of_alphabet=0;
		int count_of_digit=0;
		int count_of_space=0;
		String str="ds  s@2";
		char[] c1=str.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<=c1.length-1;i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			boolean b3=Character.isWhitespace(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			if(b2==true)
			{
				count_of_digit++;
			}
			if(b3==true)
			{
				count_of_space++;
			}
		}
		int count_of_spcl_character=str.length()-(count_of_alphabet+count_of_digit+count_of_space);
		System.out.println("Special_Character:");
		System.out.println(count_of_spcl_character);
		
		System.out.println("Alphabets:");
		System.out.println(count_of_alphabet);
		
		System.out.println("Digits:");
		System.out.println(count_of_digit);
		
		System.out.println("Spaces:");
		System.out.println(count_of_space);

	}

}
