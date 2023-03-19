package com;

public class BankImp implements Bank {

	private int balance;

	BankImp(int balance){
		this.balance=balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");		
	}
	@Override
	public void withdraw(int amount) {
		if(amount <=balance) {
		System.out.println("Depositing Rs."+amount);
		balance=balance-amount;
		System.out.println("Amount Withdrawn Successfully");
	}
	else {
		// Invoke an Exception and handle it using try and catch block
		// Create class of InsufficientBalanceException

		try {
			throw new InsufficientBalanceException("Insuffient Balance");
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	}

	@Override
	public int getBalance() {
		return this.balance=balance;
	}

	@Override
	public String displayErrorMessage() {
		
		return "Invlid Choice,Kindly Enter Valid Choice!" ;
	}

}
