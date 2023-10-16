package com.cg;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		String numberAsString = Integer.toString(n);
		System.out.println("Digits of the numbers:");
		for(int i=0;i<numberAsString.length();i++) {
			char digit = numberAsString.charAt(i);
			System.out.println(digit);
			
		}
		
		int digitCount = numberAsString.length();
		System.out.println("Number of digits: " + digitCount);
	}

}
