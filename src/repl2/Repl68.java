package repl2;

import java.util.Scanner;

public class Repl68 {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 
		 int count = word.length();
		  int lastCharIndex = count - 1;
		  int length = 0;
		  int midIndex = count / 2;
		  char a = word.charAt(0) ;
		  char b = word.charAt(1) ;
		  char c = word.charAt(midIndex);
		  char d = word.charAt(word.length()-2) ;
		  char e = word.charAt(word.length()-1) ;
		
		
		  System.out.println(d);
		  
		  if (count == 5 )
		    	System.out.println( e+""+d+""+c+""+b+""+a );
		  else if(count < 5) 
			  System.out.println("Too short!");
		  else if (count > 5)
			  System.out.println("Too long!");
	}

}
//Write a program that will reverse a string. Your program should reverse a string only 5 characters long. 
//If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". 
//Otherwise, reverse this word and print out result into the console. 
//
//Example:
//input: cat
//output: Too short!
//
//Example:
//input: singularity
//output: Too long!
//
//Example:
//input: apple
//output: elppa
