package com.arrayexample;

import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String s1="save"; //[s,a,v,e]
		String s2="vase"; //[v,a,s,e]
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}else
		{
			System.out.println("Are they Anagram?");
			char[] c1 =s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting c1");
			System.out.println(c1);
			System.out.println("After sorting c2");
			System.out.println(c2);
			boolean b1=Arrays.equals(c1, c2);
			System.out.println(b1);
			if(b1==true)
			{
				System.out.println("They are Anagram");
			}else
			{
				System.out.println("They are not Anagram");
			}
		}
		
	}

}
