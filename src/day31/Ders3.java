package day31;

import java.util.Arrays;

public class Ders3 {

	public static void main(String[] args) {
		
		/*
		 * methods :
		 * 	reusable code, maintainable code, write once and use it whenever needed
		 * 
		 * 3 questions to ask while creating a method :
		 * 
		 * 		does this method needs an object or not when being called
		 * 		----->> if not we use static keyword
		 * 		does this method take external data or not
		 * 		---->> if it doesn't we just end method name with empty ()
		 * 		---->> if yes put data type and name : parameters seperated by coma
		 * 		does this method return a value after being called
		 * 		--- if not use void
		 * 		--- if yes the data type of variable it return 
		 *  
		 * */
		
		String s = "abc" ;
		//System.out.println(   s.charAt(0));
		
		int[] arrObject = {1,2,5,6};
		//Arrays.sort(arr);
		
		// create a static method with no return type
		// take one int array as parameter and print them out in one line
		// with - in between
		
		arrayPrinterWithDash(new int[] {1,2,3,6,5,5,65}) ;
		
		arrayPrinterWithDash(arrObject);
		
		
	}
	
	public static void arrayPrinterWithDash(int[] manyItems) {
		
		for (int each:manyItems) {
			System.out.print(each + "-");
		}
		System.out.println();
	}

}

/*

  public static void main(String[] args) {
    
    /*
     * methods : 
     *   reusable code, maintainable code , write once and use it whenever needed
     * 
     * 3 questions to ask while creating a method : 
     *    
     *     does this method needs an object or not when being called 
     *       -->> if not we use static keyword 
     *    does this method take external data or not 
     *        -->> if it doesn't we just end method name with empty ()
     *        -->> if yes put data type and name : parameters seperated by comma
     *    does this method return a value after being called 
     *        --if not use void  
     *        --if yes put the data type of the variable it return 
     * 
     * 
    
    String s = "abc" ; 
    //System.out.println(  s.charAt(0)  );
    
    int[] arrObject = {1,2,5,6};
    //Arrays.sort(arr);
    
    // create a static method with no return type
    // take one int array as parameter and print them out in one line 
    // with - in between
    
    arrayPrinterWithDash( new int[] {1,2,3,6,5,5,65});
    
    arrayPrinterWithDash(arrObject );
    
    //arrayPrinterWithDash(arrObject) ; 
    

  }

  public static void arrayPrinterWithDash( int[] manyItems) {
    
    for(int each: manyItems) {
      System.out.print(each + "-");
    }
    System.out.println();


*/
