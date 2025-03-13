package com.stringexample;

public class StringConcept1 {
public static void main(String[] args) {
	String str= "This is My Village and ";
	System.out.println(str.concat("it is beautiful"));
	
	String str1 ="Automation";
	String str2 ="Testing";
	String result = str1+" "+str2;
	System.out.println(result);
	
	
	String i2="do";
	String i1="Always";
	String i3="good";
	System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
	
	
	String s1="Today is Wednesday";
	boolean b= s1.contains("is");
	System.out.println(b);
}
}
