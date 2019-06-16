package repl4;

import java.util.Arrays;
import java.util.Scanner;

public class Repl113 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    int count = words.length ;
//	    String word = words[0];
	    for (int i=0; i<count; i++)
	    {
	    	words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length()- 1);
	    }
	    System.out.println(Arrays.toString(words) );
		
	    
	}

}

/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne] 

*/