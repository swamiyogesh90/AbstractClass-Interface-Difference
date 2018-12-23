package com.abstract1;

public abstract class Bank {
	
	public abstract void calculateInterest();
	
	public void deposit() {
		System.out.println("Inside Deposit");
	}
	
	public void withdraw() {
		System.out.println("Inside Withdraw");
	}

}
