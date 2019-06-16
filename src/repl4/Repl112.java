package repl4;

import java.util.Scanner;

public class Repl112 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    for (int i=0; i<words.length; i++)
	    {
		System.out.println(words[i].substring(0, 1) + words[i].substring(words[i].length()- 1));
			
		
		
		
//		 int count = words.length-1;
//		 for(int i =0; i <= count; i++)
//		 {
//		 System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1)); 
		 }
	}

}

/*

Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print: 
       ho
       wy
       by
       ae
       ne
*/