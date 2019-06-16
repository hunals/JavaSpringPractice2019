package repl4;

import java.util.Scanner;

public class Repl115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
	
		int index = 0 ;
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
			int max = words[0].length();
					
			if( words[i].length() >max) {
					max = words[i].length();
					index = i ;
				}
		}
		System.out.println(words[index]);
	}

}

/*
Given the array words, it will print the word with the largest length. 
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

*/