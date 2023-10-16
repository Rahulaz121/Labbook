package com.cg;

public class SumofDigits {
	public static void main(String[]args) { 
		String str = "1234";
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{
			int digit = Character.getNumericValue(c);
				sum = sum+digit;
			}
			
		}
		System.out.println("The Sum of digits is " + sum);
	}		
}
