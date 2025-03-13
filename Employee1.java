package com.arrayexample;
import java.util.Scanner;
public class Employee1 {
	
	    public static void main(String[] args) {
	        String emp_name[] = new String[5];
	        int emp_id[] = new int[5];
	        double emp_salary[] = new double[5];
	        
	        Scanner sc = new Scanner(System.in);
	        
	        // Loop to input employee details for each employee
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter Employee " + (i + 1) + " Name:");
	            emp_name[i] = sc.next();  // Store input in the i-th index of the emp_name array
	            
	            System.out.println("Enter Employee " + (i + 1) + " ID:");
	            emp_id[i] = sc.nextInt();  // Store input in the i-th index of the emp_id array
	            
	            System.out.println("Enter Employee " + (i + 1) + " Salary:");
	            emp_salary[i] = sc.nextDouble();  // Store input in the i-th index of the emp_salary array
	        }
	        
	        // Display employee details (optional)
	       /* for (int i = 0; i < 5; i++) {
	            System.out.println("Employee " + (i + 1) + ":");
	            System.out.println("Name: " + emp_name[i]);
	            System.out.println("ID: " + emp_id[i]);
	            System.out.println("Salary: " + emp_salary[i]);
	            System.out.println();
	        }*/
	    }
	}

