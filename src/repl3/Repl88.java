package repl3;

import java.util.Scanner;

public class Repl88 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
		
	    int x = 0;
	    int h = word.length();

	    while(x < h - 2){

	      if(word.substring(x,x+3).equals("cat"))
	      countOfCats++;
	      else if(word.substring(x,x+3).equals("dog"))
	      countOfDogs++;

	      x++;

	    }

	    System.out.println(countOfDogs == countOfCats);
		
		
	}

}
		
//		Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
//		Example:
//		input: catdog
//		output: true
//
//		Example:
//		input: catcat
//		output: false
//		
