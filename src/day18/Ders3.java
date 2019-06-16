package day18;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int x = 0 ;
//		while(x != 5) {
//			
//			System.out.println("Give me 5");
//			x = scan.nextInt();
//		}
//		
//		System.out.println( "YAY GOOD JOB" );
		
		
//		ask user to enter 5 $ bill or 10 $ bill
//		if user enter something else keep asking
		
//		AS LONG AS i dont get 5 or 10 bill keep asking
		
//		while(x!=5 && x!=10)  ayni cevabi verir
//		while( ! (x == 5 || x == 10)  ) {
//			
//			System.out.println(" Enter 5$ or 10$ ");
//			x = scan.nextInt();
//		}
//		
//		System.out.println( "END OF LOOP" );
		
//		String theAnswer = "";
//		
//		while( !theAnswer.equalsIgnoreCase("yes")) {
//			
//			System.out.println("DO YOU LOVE JAVA ?");
//			theAnswer = scan.next();
//		}
//		System.out.println("FINALLY , CORRECT ANSWER");
		
		
		int sum = 0;
		
		int count = 1;
		while(count <=5) {
			sum = sum + count ;
			System.out.println("current sum :" + sum + " count is " + count);
			System.out.println(count);
			count++;
		}
		System.out.println(sum);
	}

}
