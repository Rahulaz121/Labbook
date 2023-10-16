package com.cg;

class TaxiCab implements PublicTransport {
	
	@Override
	public double calculateFare(int d) {
		double fare = Rate * d;
		return Math.max(fare, MIN_AMOUNT);
	}
}

public class InterfaceTester {
	public static void main(String[]args) {
		TaxiCab olaCar = new Taxicab();
		int d = 5;
		double fare = taxicab.calculateFare(distance);
		System.out.println("Your bill Amount is: Rs " + olaCar.calculateFare(5));
	}
}
