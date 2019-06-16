package repl4;

import java.util.Scanner;

public class Repl120 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
		
	    String[] newWord = sentence.split(" ");
	    for (int i = newWord.length-1; i >=0 ; i--) {
			
	    	System.out.println(newWord[i]);
	    
	    }
	}

}

/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java

*/