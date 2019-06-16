package day19;

import java.util.Scanner;

public class Palindram {

	public static void main(String[] args) {
		
//		 USING ABOVE CODE --> CREATE A PROGRAM 
		//   TO CHECK WHETHER A WORD IS PALINDROM 
		//   ANA --> REVERSE -- ANA
		//   CIVIC --> REVERSE -- CIVIC
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		    String name = scan.nextLine() ;
		    
		 int count = name.length() ; 
		 String reversed = "" ;
		    while(count>0 ) {
		    	
		    	 count-- ;
		    	
			    reversed   = reversed + name.charAt(count) ;
//			    reversed += name.charAt(count) ;
			    System.out.println (  reversed );
		    }
		    System.out.println("PALINDROME " + name.equals(reversed));
	}

}

//Scanner scan = new Scanner(System.in);
//System.out.println("ENTER A name");
//// Ask user a name 
//// for example  Bilal ----> B-i-l-a-l-
//String name = scan.nextLine() ;
///// USING ABOVE CODE --> CREATE A PROGRAM 
//// TO CHECK WHETHER A WORD IS PALINDROM 
////    ANA --> REVERSE -- ANA
////    CIVIC --> REVERSE -- CIVIC
//
//
//// in order to reverse a String 
//// we can start getting the chars in reversed order 
//// by using charAt method 
//// since the order is decrementing , we use -- 
//// in order to save the reversed word, we need a container
//// before we reverse the word , just put empty value in container
//// while we looping through each chars , 
//// concatenate this character to the variable value 
//// after the loop we will have the word stored in reversed order
//
//int count = name.length() ;  // ABC 
//String reversed = ""; 
//
//while(count>0) {
//
//  count-- ; 
//  reversed  = reversed + name.charAt(count) ; 
//  //reversed += name.charAt(count)
//  System.out.println( reversed  );          
//}
//System.out.println( "PALINDROME " + name.equals(reversed) );


