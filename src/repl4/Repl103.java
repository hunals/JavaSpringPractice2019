package repl4;

import java.util.Scanner;

public class Repl103 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String  str = scan.nextLine();
	    int count = 0;
		
		
	  
	  for (int i = 0; (i+3) < str.length(); i++) {
	  
	    
	    if (str.charAt(i)=='c' && str.charAt(i+1)=='o'&& str.charAt(i+3)=='e') {
	      count++ ;
	    }
	  }
	    System.out.println(count);

	  }
}
//	    String word = str.substring(i, i + pass.length() );
//for(int i = 0;(i+3)<str.length();i++){
//if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e') {
//count+=1;
/*



Print out the number of times that the string "code" appears anywhere in the given string. 
We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
Example:
input: aaacodebbb
output: 1

Example:
input: codexxcode
output: 2

Example:
input: cozexxcore
output: 2

*/