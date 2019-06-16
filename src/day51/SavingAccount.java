package day51;

public class SavingAccount extends BankAccount{

	double returnRate;


	public SavingAccount(String accountname, long accountNumber, double balance, double returnRate) {
		super(accountname, accountNumber, balance);
		this.returnRate = returnRate;
	}


	@Override
	public String toString() {
		return "SavingAccount [returnRate=" 
				+ returnRate + ", accountname=" 
				+ accountname + ", accountNumber="
				+ accountNumber + ", balance=" 
				+ balance + "]";
	}

	@Override
	public void deposit(int money) {
		this.balance += money+100;
	}
	
	@Override
	public void withdraw(int money) {
		this.balance = this.balance - money-10;
	}
		
}

/*
Task 2 
	Create a BankAccount class 
		fields : 
			accountName as String
			accountNumber as long 
			balance as double 

		Constructor 
			3 args constructor to set all above value 

		methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
			withdraw accept one int as parameter
				and it changes the balance accordingly

	Create a sub class called SavingAccount 
		field : 
			double returnRate
		Constructor 
			4 args constructor to set all above value 

		overriden methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
				but you get 100$ for each deposit 
			withdraw accept one int as parameter
				and it changes the balance accordingly
				but you get 10$ penalty for each withdraw 




*/