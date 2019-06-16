package repl4;

import java.util.Scanner;

public class Repl121 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    
	    String[] newWord = sentence.split(" ");
	    for (int i = newWord.length-1; i >=0 ; i--) {
			
	   	
	    	reversed += newWord[i] +((i!= 0)? " " : "") ;   
	    }
	    System.out.println(reversed);
//	    }
	}

}

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"

*/