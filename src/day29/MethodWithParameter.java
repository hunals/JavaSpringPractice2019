package day29;

import java.util.Scanner;

public class MethodWithParameter {

	  public static void main(String[] args) {
	    
	    // Arrays.sort(arr) ;     
	    holdYourHorse("Anar"); 
	    //holdYourHorse(12321);  // does not compile if datatype not match
	    holdYourHorse("David"); 
	    holdYourHorse("Fatma"); 
	    holdYourHorse("Sumeyye"); 
	    
	    Scanner scan = new Scanner(System.in) ;
	    String name = scan.next();
	    System.out.println("HOLD WHOESE HORSE?");
	    holdYourHorse(name) ;
	    
	  }
	                  // parameter 
	  public static void holdYourHorse(String owner) {  
	     //String owner = "Anar" ;
	     System.out.println(owner + ", hold your horse please!"); 

		
		
		
		
		
	}

}
/*
package day29;

public class MethodWithParameter {

  public static void main(String[] args) {
    
    // Arrays.sort(arr) ;     
    holdYourHorse("Anar"); 
    //holdYourHorse(12321);  // does not compile if datatype not match
    holdYourHorse("David"); 
    holdYourHorse("Fatma"); 
    holdYourHorse("Sumeyye"); 
    
      Scanner scan = new Scanner(System.in); 
    String name = scan.next(); 
    System.out.println("HOLD WHOESE HORSE?");
    holdYourHorse(name); 
    
    
  }
                  // parameter 
  public static void holdYourHorse(String owner) {  
     //String owner = "Anar" ;
     System.out.println(owner + ", hold your horse please!"); 










 holdYourHorse("ASCII is a 7-bit character set containing 128 characters."
         		+ " It contains the numbers from 0-9, the upper and lower case "
         		+ "English letters from A to Z, and some special characters. "
         		+ "The character sets used in modern computers, "
         		+ "in HTML, and on the Internet, are all based on ASCII.");
	}
 
	
	
	public static void  holdYourHorse(String owner) {
		
		
		System.out.println(owner+", hold your horse please!");
	}

*/