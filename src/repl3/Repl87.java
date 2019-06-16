package repl3;

import java.util.Scanner;

public class Repl87 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int count = 0 ;

	    for (int i = 0; i < word.length(); i++) {
	    	if (word.charAt(i) =='j') {
	    		if (word.charAt(i+1) =='a') {
	    			if (word.charAt(i+2) =='v') {
	    				if (word.charAt(i+3) =='a') {
						count++ ;
					}
			}
			
			}
		}
		
		}
		System.out.println(count);
	}

}

//Return the number of times that the string "java" appears anywhere in the given string word.
//
//Example:
//input: javaxjava
//output: 2
//
//Example:
//input: javaxjavaapplepearjavaegg
//output: 3

//String x="java" ;
//int javaNumber = 0 ;
//
//for(int h = 0; h < word.length()- 1; h++)
//{    
//    if(word.substring(h,h+1).contains("java"))
//
//        h++;
//}
//System.out.println(javaNumber);