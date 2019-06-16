package repl2;

import java.util.Scanner;

public class Repl70 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
	    char first = word.charAt(0) ;
		char last = word.charAt(word.length()-1) ;
		
		if (((first == 'x' ) ||(first == 'X')) && ((last == 'x' ) || (last == 'X'))){
			System.out.println( word.substring(1,word.length()-1));
		}else 
			System.out.println(word);
		
//		
//		if (((word.charAt(0)).equalsIgnoreCase("x")) || ((word.charAt(word.length()-1)).equalsIgnoreCase("X")) ){
//			System.out.println( word.substring(1,word.length()));
//		}else 
//			System.out.println(word);
//		
	}

}
//Given a string, if the first or last chars are 'x' or 'X', return the string without those 'x' or 'X' chars,  otherwise return the string unchanged. 
//
//Example: 
//input: xHiX 
//output: Hi
//
//Example:
//input: apple 
//output: apple