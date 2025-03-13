package com.stringexample;

public class ReverseString1 {
public static void main(String[] args) {
	String str="Apple";
	String reverse="";
	for(int i=str.length()-1; i>=0;i--)
	{
		char c=str.charAt(i);
		//System.out.print(c);
		reverse = reverse+c;
	}
	System.out.println(reverse);
}
}










/* i=4
 * char c=str.charAt(i);
 *reverse = reverse+c;
 *c=e
 *reverse=e
 *
 *i=3
 *c=l
 *reverse=e+l=el
 *
 *i=2
 *c=p
 *reverse=el+p=elp
 *
 *i=1
 *c=p
 *reverse=elp+p=elpp
 *
 *i=0
 *c=A
 *reverse=elpp+A=elppA
*/