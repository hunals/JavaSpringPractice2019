package day19;

import java.util.Scanner;

public class Ders2loopp {

	public static void main(String[] args) {
		
//		task3: referring above code --> reverse your name
//		optional: check how many a do you have in your name
		
		

	    Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER A name");
	    String name = scan.nextLine() ;
	    
	    int count = name.length() ; 
	    while(count>0 ) {
	    	
	    	 count-- ;
	    	System.out.print (  name.charAt(count)  + " ");
		       
	      
//	      System.out.print (  name.charAt(count-1)  + " ");
//	      count-- ;   
	    }
	    
	    
	    
	    
	    
	}

}


//
//  Scanner scan = new Scanner(System.in);
//  System.out.println("ENTER A name");
//  // Ask user a name 
//  // for example  Bilal ----> B-i-l-a-l-
//  String name = scan.nextLine() ;
//  
////  int x = 0 ; 
////  while(x< name.length() ) {
////    
////    System.out.print (  name.charAt(x)  + "-");
////    ++x ;   //x++ ; 
////  }
//  // TASK 3 : referring above code --> reverse your name 
//  // OPTIONAL : Check how many a do you have in your name
//  int count = name.length() ;  // ABC 
//  while(count>0) {
//
//    count-- ; 
//    System.out.print( name.charAt(count) + " "   );      
//    
////    System.out.print( name.charAt(count-1) + " "   );
////    count-- ; 
//  }
//  /// USING ABOVE CODE --> CREATE A PROGRAM 
//  // TO CHECK WHETHER A WORD IS PALINDROM 
//  //    ANA --> REVERSE -- ANA
//  //    CIVIC --> REVERSE -- CIVIC
