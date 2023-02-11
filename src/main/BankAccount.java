package main;

public class BankAccount {
	private double balance;
	
	
	public double getBalance() {
		return balance;
	}


	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void addmoney(int amount) {
		
	}
	
	public void withdrawMoney(int amount) {
		
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}

}
