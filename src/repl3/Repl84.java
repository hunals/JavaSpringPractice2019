package repl3;

import java.util.Scanner;

public class Repl84 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long sum = 1 ;
		
		int h = 1 ;
		
		while(h<=num ) {
//		System.out.println(sum = (h * sum));
			sum = (h * sum);
			h++;
		}

		System.out.print(sum );
		
		
		
	}

}
//In mathematics, the factorial of a positive integer n, denoted by n!, 
//is the product of all positive integers less than or equal to n. 
//Calculate factorial and output result to the console. 
//Example:
//input: 5
//output: 120



