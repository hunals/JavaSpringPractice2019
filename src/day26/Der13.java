package day26;

import java.util.Arrays;

public class Der13 {

	public static void main(String[] args) {
		
		String str = "Spartan" ;
//		
//		int size = str.length() ;
//		char[] myChars = new char[ size ];
//		
//		for (int i = 0; i < size; i++) {
//			
//			myChars[i] = str.charAt(i) ;
//			
//		}
//		
//		System.out.println(Arrays.toString(myChars));
		
		// toCharArray method is a method form String class 
	    // and it will take no external data when being called 
	    // and it will return character array that have each char of String object
	    		
		char[] myChars = str.toCharArray();
		System.out.println(Arrays.toString(myChars));
		
	}

}

/*
    
    String str = "Spartan" ; 
    
    int size = str.length() ; 
    
    char[] myChars = new char[ size ]; 
    
    for(int i=0 ; i< myChars.length ; i++) {
      
      //myChars[0] = 'A' ; 
      myChars[i] = str.charAt(i) ; 
      
    }
    
    System.out.println(Arrays.toString(myChars)   );



//    // toCharArray method is a method form String class 
    // and it will take no external data when being called 
    // and it will return character array that have each char of String object
    
    char[] myChars = str.toCharArray(); 
    System.out.println(Arrays.toString(myChars)   );

*/