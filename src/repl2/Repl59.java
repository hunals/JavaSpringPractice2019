package repl2;

import java.util.Scanner;

public class Repl59 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		int count = word.length();
	    int lastCharIndex = count - 1;
	    
	    //int lastIndex	= word.length()-1 ;
		char lastChar = word.charAt(word.length()-1);
		char firstChar = word.charAt(0); 
		System.out.println("" + firstChar + lastChar );
		System.out.println( "" +word.charAt(0) + word.charAt(word.length()-1));
		
		System.out.println( word.charAt(0));
		System.out.println( word.charAt(lastCharIndex));
	}

}
//Write a program that will print out first and last letters together.