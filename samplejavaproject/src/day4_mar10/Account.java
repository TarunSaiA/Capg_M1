package day4_mar10;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;
	public Account(int accountNumber, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	};
	
}