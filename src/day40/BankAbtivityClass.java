package day40;

public class BankAbtivityClass {

	public static void main(String[] args) {
		
		BankAccount costumer1 = new BankAccount();
		costumer1.accountHolder = "Ashaf" ;
		costumer1.balance = 2935.6 ;
		
		costumer1.showAccountHolder();
		costumer1.showBalance();
//		costumer1.add100Dollar();
//		costumer1.showBalance();
		
		// int am = scan.nextInt() ;
		costumer1.addDollar(5) ;
		
		costumer1.showBalance();
		
		
		BankAccount costumer2 = new BankAccount();
		
		costumer2.accountHolder = "Shahriyor Ortikov" ;
		costumer2.balance = 2500 ;
		
		costumer2.showAccountHolder();
		costumer2.showBalance();
		costumer2.add100Dollar();
		costumer2.showBalance();
		costumer2.addDollar(200) ;
		costumer2.showBalance();
	}

}


/*
package day40;

public class BankActivityClass {

  public static void main(String[] args) {
    
    
    BankAccount costumer1= new BankAccount();
    costumer1.accountHolder="Ashraf";
    costumer1.balance=2935.6;
    
    costumer1.showAccountHolder();
    costumer1.showBalance();
    
    // int am = scan.nextInt(); 
    costumer1.addDollar(-500);
    
    costumer1.showBalance();
    
    System.out.println("------------");
    
    BankAccount costumer2 = new BankAccount ();
    
    costumer2.accountHolder = "Shahriyor Ortikov";
    costumer2.balance = 2500;
    
    costumer2.showAccountHolder();
    costumer2.showBalance();
    costumer2.add100Dollar();
    costumer2.showBalance();
    costumer2.addDollar(200);
    costumer2.showBalance();
    

  }

}

*/