package repl2;

import java.util.Scanner;

public class Repl65 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		
		    char first = word2.charAt(0) ;
		    char last = word1.charAt(word1.length()-1) ;
		    int count = word2.length();
		    
		    if (first == last) {
		    	System.out.println(word1.concat(word2.substring(1, count)));
		    }else
		    	System.out.println(word1.concat(word2));
	}

}

//Write a program that will append two strings (word1 and word2) together 
//(known as "concatenation") and print the result. 
//However, if the concatenation creates a double-char, 
//then omit one of the chars, so "abc" and "cat" yields "abcat".