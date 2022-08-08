package com.qa.exercises;

public class Calculator {
	
	public static void main(String[] args) {
		Summing Sum = new Summing();
		
		System.out.println(Sum.sum(10, 2));
		System.out.println(Sum.mult(10, 2));
		System.out.println(Sum.sub(10, 2));
		System.out.println(Sum.div(11, 2));
		
	}

}
