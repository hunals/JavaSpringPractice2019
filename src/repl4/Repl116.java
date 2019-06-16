package repl4;

import java.util.Arrays;
import java.util.Scanner;

public class Repl116 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String[] newWord = sentence.split(" ");
		    for (int i = 0; i < newWord.length; i++) {
				
		    	System.out.println(newWord[i]);
			
			
		  

	}
		    
		    
		    
	}

}

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun

*/