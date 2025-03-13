package com.stringexample;

public class StringFunctionEquals {
	public static void main(String[] args) {
		String in="madhuri";
		boolean b1=in.equals("Madhuri");
		System.out.println(b1);
		
		//String in1= in.toUpperCase();//MADHURI
		
		boolean b2=in.equalsIgnoreCase("madhuri");
		System.out.println(b2);
		//System.out.println(in1.equals("MADHURI")); //madhuri
		
	}

}
