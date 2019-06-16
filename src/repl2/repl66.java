package repl2;

import java.util.Scanner;

public class repl66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int count = word.length();
		int midIndex = count / 2;

		if (count % 2 == 0 && count >= 4)  
			midIndex = count / 2;
			System.out.println(word.substring(0, midIndex).concat(word.substring(0, midIndex)));
		
	}

}


//Write a program that will print out first half of the word twice. 
//
//Example:
//
//input: Rabbit
//output: RabRab