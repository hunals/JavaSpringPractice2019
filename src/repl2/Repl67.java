package repl2;

import java.util.Scanner;

public class Repl67 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	      int count1 = word1.length();
		  int lastCharIndex = count1 - 1;
		  int length = 0;
		  int midIndex = count1 / 2;
		  char a1 = word1.charAt(0) ;
		  char c1 = word1.charAt(word1.length()-1) ;
		  char b1= word1.charAt(midIndex);
		  
		  int count2 = word2.length();
		  int lastCharIndex2 = count2 - 1;
		  int length2 = 0;
		  int midIndex2 = count2 / 2;
		  char a2 = word2.charAt(0) ;
		  char c2 = word2.charAt(word2.length()-1) ;
		  char b2 = word2.charAt(midIndex);
			
			
	    if ((count1 == 3) && (count2 == 3))
	    	System.out.println( a1+""+a2+""+b1+""+b2+""+c1+""+c2 );
	    else if((count1 != 3) || (count2 != 3))
	    	System.out.println("cannot merge");
	    
	    
		
	}

}
//You have 2 words, both of them have 3 characters.
//If either of them does not have exactly 3 characters, print "cannot merge"
//Merge their characters one by one and print together like below:
//
//aok
//lol
//alookl
//
//ear
//pie
//epaire
//
//java
//wow
//cannot merge
//
//hint:
//by inserting +""+ (empty string) between chars, you can concatenate char values.