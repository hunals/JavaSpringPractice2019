package repl3;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();

		    int count = sentence.length();
		    
		    int i = 0;
		    
		    while (count != i) {
		   
		   System.out.print(sentence.substring(count-1,count) );
		 --count;
		   }
	}
}
		    
////		    int n = sentence.nextInt;
//		    int n = sentence.length()-1;
//		    int x = n;
//		    while(x<=n) {
//		    	System.out.println(x);
//		    	x--;
//	}
	
	
	
//	}
//}
//		String sen = reverse(sentence);
//		System.out.println( sen );
//	}
//	public static String reverser(String sentence) {
////		
//		if(sentence.length()==0)
//			return "";
////		
//		return sentence.substring(sentence.length()-1) + reverser(sentence.substring(0,sentence.length()-1));
////		
	
//		    String sentence[]= scan.nextLine();
//		int last = sentence.length()-1;
//		String reverse = "";
//		for(int i=sentence.length()-1; i>=0;i--) {
//		      reverse = reverse + sentence.charAt(i);
//		System.out.print(reverse);
//		}
//	}
//}
		
//In this task, you need to write a program that will reverse a string. 
//Reverse a sentence variable and print the result.
//
//
//Example:
//input: red
//output: der