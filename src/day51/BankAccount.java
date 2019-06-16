package day51;

public class BankAccount {

	String accountname;
	long accountNumber;
	double balance;
	
	
	
	


	public BankAccount(String accountname, long accountNumber, double balance) {
		super();
		this.accountname = accountname;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	public void deposit(int many) {
		
		this.balance += many;
	}
	
	public void withdraw(int money) {
		
		this.balance -= money;
	}
	

	@Override
	public String toString() {
		return "BankAccount [accountname=" 
				+ accountname + ", accountNumber=" 
				+ accountNumber + ", balance=" 
				+ balance + "]";
	}
	
	
	
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
