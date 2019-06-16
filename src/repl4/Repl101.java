package repl4;

import java.util.Scanner;

public class Repl101 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		
		String next = "" ;
		
		int i = 0;
		
		for (int j = 0; j < n; j++) {
			
		
		for (i=0; i < str.length(); i++) {
			
			 next = str.substring(str.length()-n, str.length() ) ;
		}
			System.out.print(next);
		}
		System.out.println();
	}

}

//
//while (i < n) {
//  i++;
//	System.out.print(str.substring(str.length() - n));
//}


/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.
Example:
input: Hello
input: 3
output: llollollo

Example:
input: Hello
input: 2
output: lolo
*/