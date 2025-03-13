package com.stringexample;

public class Palindrome {
	public static void main(String[] args) {
		
	String str="level";
	String reverse="";
	
	for(int i=str.length()-1; i>=0;i--)
	{
		char c=str.charAt(i);
		//System.out.print(c);
		reverse = reverse+c;
	}
	System.out.println(reverse);
	if(str.equals(reverse))
	{
		System.out.println("It is Palindrome");
	}else
	{
		System.out.println("Not Palindrome");

	}
  }
}