package model;

public class Account {

	// Attributes
	private int number;
	private String holder;
	private double balance;
	
	// Constructors
	public Account(int number, String holder, double amount) {
		this.number = number;
		this.holder = holder;
		deposit(amount);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	// Getters & Setters
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	
	// Methods
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// ToString
	public String toString() {
		return "Account " +
				this.number +
				", Holder: " +
				this.holder +
				", Balance: $ " +
				String.format("%.2f", this.balance);
	}
}
