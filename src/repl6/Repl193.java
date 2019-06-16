package repl6;

public class Repl193 {
	public static void main(String[] args) {
		
	}
	 public static boolean isPalindrome(String check) {
		    
			
		 check = check.toLowerCase().replace(" ", "");
		 String reversed = "" ;
		    
		 for (int i = check.length()-1 ; i >=0 ; i--) {
			
			 reversed += check.charAt(i) ;
		}
		 if(check.equals(reversed)) {
			 return true;
		 }else
			 return false;
	  }
	}

/*
Palindrome is a word, phrase, or sequence that reads the 
same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if 
check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and 
civic are both palindromes
- make your conditions space insensitive.  Race car 
is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true


*/