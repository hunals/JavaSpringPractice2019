package repl2;

import java.util.Scanner;

public class Repl63 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
	    int count;
		  count = word.length();
		
		if (count%2==1 && count>=5) {
			   int midIndex = count/2;
			   char a = word.charAt(midIndex);
			   char b = word.charAt(midIndex-1);
			   char c = word.charAt(1+midIndex);
			    System.out.print("" + b + a + c);
		}else
			System.out.println("invalid");
		}

}
	
//	You have a word, do the following:
//
//If the word has odd number of characters and has 5 or more characters, print the middle three 
//characters of the word. 
//
//		Otherwise print "invalid".
//
//		fifteen ==> fte
//		apple ==> ppl
//		hey ==> invalid
//		java ==> invalid
//		whatsup ==> ats
//		$ ==> invalid