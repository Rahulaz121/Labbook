package com.cg;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,temp,sum=0;
		int n = 121;
		temp=n;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not a palindrome number");
	}
	}

//}
