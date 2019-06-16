package repl2;

import java.util.Scanner;

public class Repl64 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	
		  int count = word.length();
		  int lastCharIndex = count - 1;
		  int length = 0;
		  char firstChar = word.charAt(0) ;
		  char lastChar = word.charAt(word.length()-1) ;
		  String middle = word.substring(1, word.length()-1) ;
//		  char middleChar = word.substring(1, length-1) ;
			System.out.println("" + firstChar + lastChar );
			System.out.println( "" +word.charAt(0) + word.charAt(word.length()-1));
			System.out.println(lastChar + middle + firstChar );
//
//			System.out.println(word.charAt(length-1) +  word.substring(1, length-1) +   word.charAt(0) );
//		  
//		System.out.println(word.charAt(length-1) +  word.substring(1, length-1) +   word.charAt(0) );
		
	}

}


//Instructions from your teacher:
//Write a program that will swap first and last characters in the string. 
//Use substring method to slice the string. Print out result into the console. 
//
//Example #1
//input: apple
//output: eppla
//
//Example #2
//input: pursuit
//output: tursuip