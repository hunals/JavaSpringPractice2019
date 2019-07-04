package repl6;

import java.util.Scanner;

public class extra_23_haziran {

	public static void main(String[] args) {
		
//		 Scanner inp = new Scanner(System.in);
//		    System.out.print("In:");
//		    String word = inp.nextLine();
//		    //write your code below
//		    
//		    String words = "";
//		    for (int j = 0;  j < word.length()-1 ; j++) {
//				
//		    if(word.contains("a")) {
//		    	words = "a";
//		    }else if(word.contains("e")) {
//		    	words = "e";
//		    }else if(word.contains("i")) {
//		    	words = "i";
//		    }else if(word.contains("o")) {
//		    	words = "o";
//		    }else if(word.contains("u")) {
//		    	words = "u";
//		    }
//		    
//		    }
//		    System.out.println(words);
		    
		   
		    
		   
		        Scanner s = new Scanner(System.in);
		        System.out.print("#1: ");
		        int num1 = s.nextInt();
		        System.out.print("#2: ");
		        int num2 = s.nextInt();
		        //start on line 11
		           
		        if(num2>num1) {
		        	for (int i = num1; i < num2; i++) {
				}
		        System.out.println( s + " " );
		        }
}

}

class Stock{
	
	private String tickerSymbol ;
	private String companyName ;
	private int price ;
	private double percentChange ;
	private int totalShares ;
	private long marketCap ;
	
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
	
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
	}

	


	public Stock(int price, int totalShares, long marketCap) {
	
		marketCap = price * totalShares;
	}


	public void adjustPrice (int value) {
		
	}





	@Override
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\n" 
				+ "Company Name: " + companyName + "\n"
				+ " Current Price=" + price + "\n"
				+"Market Cap: " + marketCap ;
				
	}
	
	
	
	
}