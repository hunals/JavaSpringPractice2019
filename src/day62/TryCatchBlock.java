package day62;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code ");
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter num1 : ");
			int num1 = scanner.nextInt();
			System.out.println("Enter num2 : ");
			int num2 = scanner.nextInt();
			
			System.out.println("Division result is " + num1/num2);
		// we are specifically trying catch ArithmeticException if it happen
		} catch (ArithmeticException e ) {	// new ArithmeticException();
			
			System.out.println(" You INPUT 0 for second number ");
			
		}
		System.out.println("Ending of the code ");
		
	
//				throw  --> shut down the program
//				catch   --> don't allow program to shut down
		
		
		
		
	}

}
