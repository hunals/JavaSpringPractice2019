package repl4;

import java.util.Scanner;

//public class Repl120 {

//	public static void main(String[] args) {
//		
//		Scanner input = new Scanner(System.in);
//	    String sentence = input.nextLine();
//		
//	    String[] newWord = sentence.split(" ");
//	    for (int i = newWord.length-1; i >=0 ; i--) {
//			
//	    	System.out.println(newWord[i]);
//	    
//	    }

	public class Pizza{
		  
		private String s1;
		private int cheTop;
		private int pepTop;
		private int hamTop;
		
		public Pizza(String s1, int cheTop, int pepTop, int hamTop) {
			super();
			this.s1 = s1;
			this.cheTop = cheTop;
			this.pepTop = pepTop;
			this.hamTop = hamTop;
		}

		public double calcCost() {
			double cost = 0.0;
			if(s1.equalsIgnoreCase("Small")) {
				cost = 10 + 2 * (cheTop + pepTop + hamTop);
			}else if(s1.equalsIgnoreCase("Medium")) {
				cost = 12 + 2 * (cheTop + pepTop + hamTop);
			}else if(s1.equalsIgnoreCase("Large")) {
				cost = 14 + 2 * (cheTop + pepTop + hamTop);
			}
			return cost;
		}
		
		public String getDescription() {
			String size = getS1().toLowerCase() 
				+ "Pizza with" + String.valueOf(cheTop) + " Cheese toppings, "
				+ String.valueOf(pepTop) + " Pepperoni toppings, and "
				+ String.valueOf(hamTop) + " Ham toppings."
				+"\n" + "Total Price: " + String.valueOf(calcCost());
			
			
			return size;
		}
		public String getS1() {
			return s1;
		}

		public void setS1(String s1) {
			this.s1 = s1;
		}

		public int getCheTop() {
			return cheTop;
		}

		public void setCheTop(int cheTop) {
			this.cheTop = cheTop;
		}

		public int getPepTop() {
			return pepTop;
		}

		public void setPepTop(int pepTop) {
			this.pepTop = pepTop;
		}

		public int getHamTop() {
			return hamTop;
		}

		public void setHamTop(int hamTop) {
			this.hamTop = hamTop;
		}
		
		
		
		


}

/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java

*/