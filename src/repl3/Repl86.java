package repl3;

import java.util.Scanner;

public class Repl86 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
		
		
	    
//	    while (!(str.substring(n).contains(str))) {
//	    	if(true) {
//	    		System.out.print( "true");
//	    	}else 
//	    		System.out.println("false");
////	    }
	    System.out.println(str.substring(n).contains(str.substring(0, n)));
	}

}

//Given a string, consider the prefix string made of the first n chars of the string.
//Does that prefix string appear somewhere else in the string? 
//Assume that the string is not empty and that n is in the range from 1 till str.length().
//Example:
//input: abXYabc
//input: 1
//output: true
//
//Example:
//input: abXYabc
//input: 2
//output: true
//
//Example:
//input: abXYabc
//input: 3
//output: false