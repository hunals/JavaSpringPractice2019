package repl3;

import java.util.Scanner;

public class Repl89 {

	public static void main(String[] args) {

		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	        

		int i = 0 ;
	    
	    for (i = 0; i < 1; i++) {
			if (word.length() > 3 && word.charAt(i) == 'j' && word.charAt(i + 1) == 'a' && word.charAt(i + 2) == 'v'
					&& word.charAt(i + 3) == 'a') {
				System.out.println(!exists);

			} else if (word.length() > 3 && word.charAt(i + 1) == 'j' && word.charAt(i + 2) == 'a'
					&& word.charAt(i + 3) == 'v' && word.charAt(i + 4) == 'a') {
				System.out.println(!exists);
			} else {
				System.out.println(exists);
	    
	    
//				if(word.length() > 3 && indexOf==0 )  
//					System.out.println(!exists);
//				else if (word.length() > 3 && indexOf==1)
//					System.out.println(!exists);
//				else if(word.length()<4 || indexOf !=0 || indexOf !=1)
//						System.out.println(exists);
					
					
//	    String first=word.substring(0,4);
//	    String second=word.substring(1,5);
//	  if(first.equals("java") || second.equals("java")){
//	 	  System.out.println(!exists);
//	  }else{
//	  		System.out.println(exists);
			} 
	    }
	}
}
//Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
//such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
//Example:
//input: javapython
//output: true
//
//Example:
//input: cjavac++
//output: true
//
//
//Example:
//input: c#javaruby
//output: false