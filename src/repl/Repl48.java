package repl;

import java.util.Scanner;

public class Repl48 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			int w ;
		
		
		w = (x > 5) ?  x : -x ;

		System.out.println( w );
	}

}
