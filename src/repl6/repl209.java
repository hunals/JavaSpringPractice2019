package repl6;

public class repl209 {

	public static void main(String[] args) {
	    System.out.println("Hello world!");
	  }
	
}

public class SavingsAccount extends BankAccount{
	  
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}
	
	public SavingsAccount(double num) {
		interestRate = num;
	}
	
}

public class BankAccount{
	  
}
/*
Assume the existence of a BankAccount class.
Define a subclass, SavingsAccount that contains the following:
A double instance variable, interestRate.
A method getInterestRate that returns a value of interestRate.
A constructor that accepts a parameter of type double which is used to initialize the instance variable.

*/