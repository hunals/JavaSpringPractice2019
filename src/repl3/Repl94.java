package repl3;

import java.util.Scanner;

public class Repl94 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
		
	    int count = 0 ;
		int countOfChars = str.length() ;
		String target = "hi" ;
		
		for (int i = 0; i < str.length()-1; i++) {
					
			String twoChar = str.substring(i, i+ target.length()) ;
			
			if (twoChar.equals("hi")) {
				count++ ;
			}				
	}
		System.out.println(count);
	    	
	    	
	    	
		}
	    
	}



//Print out the number of times that the string "hi" appears anywhere in the given string.
//Example:
//input: abc hi how hi
//output: 2
//
//Example:
//input: hi code java please
//output: 1