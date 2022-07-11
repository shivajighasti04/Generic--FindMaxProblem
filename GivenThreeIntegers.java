package com.bridgelabz.generictask;

/**
 * Given 3 Integers find the maximum number use generic class
 * 
 * @author Shivaji Ghasti
 *
 */
public class GivenThreeIntegers {
	
	public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println("The maximum number is: " + maximumNumber);
	}
	
	public static void main(String[] args) {

		System.out.println("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

		Integer firstNumber = 15, secondNumber = 50, thirdNumber = 25;
		findMaximum(firstNumber, secondNumber, thirdNumber);
	}
}
