package com.interface1;

public class Main implements Bank {

	@Override
	public void calculateInterest() {
		System.out.println("Inside calculateInterest");
		
	}

	@Override
	public void deposit() {
		System.out.println("Inside Deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Inside Withdraw");
		
	}
	
	public static void main(String[] args) {
		
		Main bank = new Main();
		bank.deposit();
		bank.withdraw();
		bank.calculateInterest();
		
	}

}
