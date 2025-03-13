package com.arrayexample;

public class ArrayIndex1 {
	
	    public static void main(String[] args) {
	        // Declare an array with 3 elements
	        int[] numbers = {10, 20, 30};
	        
	        try {
	            // Try to access an index that is out of bounds (index 5)
	            System.out.println(numbers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Catch and handle the exception
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }

	        System.out.println("Program continues after the exception handling.");
	    }
	
}
