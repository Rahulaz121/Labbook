package com.cg;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ICICIBank icicibank = new ICICIBank();
			KotMBank kotMBank = new KotMBank();
			
			System.out.println("ICICI Bank SavingInterestRate is : " + icicibank.getSavingInterestRate());
			System.out.println("ICICI Bank FixedInterestRate is : " + icicibank.getFixedInterestRate());
			
			System.out.println("-------------------------------");
			
			System.out.println("KotmBank SavingInterestRate is : " + kotMBank.getSavingInterestRate());
			System.out.println("KotMBank Bank FixedInterestRate is : " + kotMBank.getFixedInterestRate());
			
			GeneralBank gb1 = new ICICIBank();
			GeneralBank gb2 = new KotMBank();
			
			System.out.println("-------------------------------");
			
			System.out.println("ICICI Bank SavingInterestRate is : "+ gb1.getSavingInterestRate());
			System.out.println("ICICI Bank FixedInterestRate is : " + gb1.getFixedInterestRate());
			
			System.out.println("-------------------------------");
			
			System.out.println("KotMBank SavingInterestRate is : " + gb2.getSavingInterestRate());
			System.out.println("KotMBank FixedInterestRate is : " + gb2.getFixedInterestRate());
	}

}
