package com.abstract1;

public class Main extends Bank {


	@Override
	public void calculateInterest() {
		System.out.println("Inside calculateInterest");
		
	}
	
	public static void main(String[] args) {
		
		Main bank = new Main();
		bank.deposit();
		bank.withdraw();
		bank.calculateInterest();
		
	}

}
