package com.arrayexample;

public class ArrayExample1 {
	public static void main(String[] args) {
		int rollno[]=new int[3];
		rollno[0]=60;
		rollno[1]=23;
		rollno[2]=43;
		
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Shaym";
		name[2]="Umesh";
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(rollno[i]);
			System.out.println(name[i]);
		}
		
		/*System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);*/
	}

}
