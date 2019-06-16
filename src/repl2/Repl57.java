package repl2;

import java.util.Scanner;

public class Repl57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		

	    int count = word.length();
	    int lastCharIndex = count - 1;
		char lastChar = word.charAt(lastCharIndex);
		
		System.out.println( word.charAt(lastCharIndex));



	}
}
//Write a program that will print out last letter of the word (string).