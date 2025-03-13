package com.arrayexample;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String emp_name[]=new String[2];
		int emp_id[]=new int[2];
		double emp_salary[]=new double[2];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<2;i++)
		{
			System.out.println("Enter Employee Name:");
			emp_name[i]=sc.next();
			
			System.out.println("Enter Employee Id:");
			emp_id[i]=sc.nextInt();
			
			System.out.println("Enter Employee Salary:");
			emp_salary[i]=sc.nextDouble();

		}
		
		sc.close();
	}

}
