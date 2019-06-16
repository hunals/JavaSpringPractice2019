package repl;

import java.util.Scanner;

public class If31 {

	public static void main(String[] args) {
		
		System.out.println("Enter number of milligrams in drink:");
		
		Scanner input = new Scanner(System.in);
	    int kafein = input.nextInt();
	
		String result ;
	
	    int drinks = 10000 / kafein ;
		
		
		if (drinks>1) {
			result = "drink" ;
		}else 
			result = "stop";
		
		System.out.println("It would take about " + drinks + " drinks for a lethal overdose.");
		

	}

}

