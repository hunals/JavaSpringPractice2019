package day62;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXCEPTION ARE OBJECT
		
		//ArrayIndexOutOfBoundException
		int[] nums = {1,5,6};
		//System.out.println(nums[99]);
		
//		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException();
//		System.out.println(aib);
		
		// throw keyword --->> is used to throw exception manually 
//	     throw aib ; 
	       
	       
	  // TASK 1  
	       
		// try to devide a number by 0 to see ArithmaticException 
		// and comment out that code and generate same exception using throw keyword 
	
		
		//System.out.println(10/0);
		// there is another constructor in every exception that accept String
		// you can use it to provide more information about the couse
		
//		ArithmeticException ax = new ArithmeticException("DO NOT DIVIDE BY 0");
//		throw ax;
	
		throw new ArithmeticException("BLA BLA ");
		
		// OPTIONALLY TRY NULL POINTER EXCEPTION
		
		
		
	}

}

/*
package day62;

public class ExceptionIntro {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // EXCEPTIONS ARE OBJECTS
    
    // ArrayIndexOutOfBoundException
     int[] nums = {1,5,6} ; 
//       System.out.println( nums[99] );
    
//     ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException(); 
//     System.out.println(aib);
//    
//     // throw keyword --->> is used to throw exception manually 
//     throw aib ; 
       
       
       // TASK 1  
       
       // try to divide a number by 0 to see ArithmaticException 
       // and comment out that code and generate same exception using throw keyword 
     
     //System.out.println(  6/0 );
     // There is another constructor in every exception that accept String 
     // you can use it to provide more information about the cause 
     
//     ArithmeticException ar = new ArithmeticException("DO NOT DIVIDE BY 0"); 
//     throw ar ; 
     
     throw new ArithmeticException("BLA BLA "); 
     
       
       // OPTIONALLY TRY NULL POINTER EXCEPTION 
     
     
     
    
  }

}

*/