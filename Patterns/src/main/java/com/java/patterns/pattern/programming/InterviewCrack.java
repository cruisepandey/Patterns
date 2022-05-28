package com.java.patterns.pattern.programming;

import java.util.stream.Stream;

public class InterviewCrack {
	
	public static void main(String[] args) {
		String numberString = "Delta Air";
		int firstNumber = 10;
		int secondNumber = 20;
		//reverseString(numberString);
		swapNumbers(firstNumber, secondNumber);
	}
	
	public static void reverseString(String str){
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Please pass the valid string");
		}
		String[] strArray = str.split(" ");
		for (String st : strArray) {
			System.out.print(new StringBuilder(st).reverse());
			System.out.print(" ");
		}
	}
	
	public static void swapNumbers(int firstNumber, int secondNumber) {
		int a = firstNumber + secondNumber;
		int b = a - firstNumber;
		int c = a - secondNumber;
		System.out.println("Before swap first number is : " +firstNumber + " and second number is : "+secondNumber);
		System.out.println("After swap first number is : " +b + " and second number is : "+c);
	}
}
