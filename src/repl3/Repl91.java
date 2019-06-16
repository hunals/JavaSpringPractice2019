package repl3;

import java.util.Scanner;

public class Repl91 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
		
		 int count = word.length() ; 
		 String reversed = "" ;
		    while(count>0 ) {
		    	
		    	 count-- ;
		    	 reversed   = reversed + word.charAt(count) ;
		    }
		    System.out.println( word.equals(reversed));
		
	}

}
//A palindrome is a word, number, phrase, or other sequence of characters 
//which reads the same backward as forward, such as madam or racecar or the number 10801. 
//Write a program that will verify if word is palindrome. 
//Example:
//input: racecar
//output: true