package repl6;

import java.util.ArrayList;

public class Repl211 {

	public static void main(String[] args) {
	    
	    String result = Utils.reverseLetters("..zxcv..d");
	    System.out.println(result.equals("..dvcx..z")); //true
	    
	    String result2 = Utils.reverseLetters("---abmkl.o-");
	    System.out.println(result2.equals("---olkmb.a-")); //true
	    
	    String result3 = Utils.reverseLetters("---abmkl.o-");
	    System.out.println(result3.equals("-o.lkmba---")); //false
	  }
}

public class Utils{
	  public static String reverseLetters(String word){
			//TODO 
			
		  ArrayList<Character> reverse = new ArrayList<>();
		  
		  for (int i = word.length()-1; i >= 0 ; i--) {
			 if((word.charAt(i)>='A' && word.charAt(i)<='Z')
			  ||(word.charAt(i)>='a' && word.charAt(i)<='z')) {
				 	reverse.add(word.charAt(i));
			 }
		  
		  }
		  for (int j = 0; j < word.length(); j++) {
			  if(!(word.charAt(j)>='A' && word.charAt(j)<='Z')
				&!(word.charAt(j)>='a' && word.charAt(j)<='z')) {
						 reverse.add(j, word.charAt(j));
					 }
		  } 
			String words = "";	  
			for (Character each : reverse) {
				words +=each ;
			
		}
			return words;
		}
	}

/*
Reverse a string without affecting special characters
Given a string, that contains special character 
together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), 
reverse the string in a way that special characters 
are not affected.

 
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---" 
Output:  str = "----dgf--y--tre...wq.---" 

*/