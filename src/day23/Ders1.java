package day23;

public class Ders1 {

	public static void main(String[] args) {
		
		
		/*
Early warm up tasks from what we already learned in class---
1, write a program to reverse a string
2, write a program to find all occurrence of certain 
character or word
3, write a program to count all occurrence of certain 
character or word
4, write a program to get the sum of numbers from 1 to a 
number user specified
5, write a program to extract lowercase letter from a 
given String � a1b2c3 --> abc
6, write a program to get unique characters from a 
string  : aaabbccc �> abc
		 */
		
		String str = "aaabbccc" ;
		String uniqueStr = "" ;
		
		for (int i = 0; i < str.length(); i++) {
		
			String eachChar = str.substring(i, i+1) ;
			
			if(! uniqueStr.contains(eachChar)) {
				uniqueStr += eachChar ;
			
//			System.out.println(eachChar);
			}
		}
		System.out.println(uniqueStr);
//		her karakterden 1 adet yazdiriyor
	}
}
		
		
		/*
	     * write a program to get unique characters from a string  
	     * : aaabbccc �> abc
	     * */
		/*
	    String str = "aaabbccc" ; 
	    String uniqueStr = "" ; 
	    
	    for (int i = 0; i < str.length(); i++) {
	      
	      String eachChar = str.substring(i, i+1) ; 
	      
	      if(! uniqueStr.contains(eachChar) ) {
	        uniqueStr += eachChar ; 
	        System.out.println(eachChar);
	      }
		
		
	}

}
*/