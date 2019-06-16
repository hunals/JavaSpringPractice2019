package day32;

public class Ders32 {

	public static void main(String[] args) {
		
		String name = "aliya" ;
		
		// name.charAt(0) actually return a value so println can print out 
		System.out.println( name.charAt(0) );
		
		//printSomething() does not return a value when being run
		// but prinln method is expecting a value so it does not compile
//		System.out.println( printSomething() );
		
		
	}

	public static void printSomething() {
		System.out.println("CLASS IS OVER");
	}
	
}

/*
 package day32;

public class MethidWIthNoReturnTypeWithPrint {

  public static void main(String[] args) {
    
    String name = "Aliya" ;
    
    // name.charAt(0) actually return a value so println can print out 
    System.out.println( name.charAt(0) );

    //  printSomething() does not return a value when being run 
    // but println method is expecting a value so it does not compile
    System.out.println(  printSomething()  );
    
    
  }
  
  public static void printSomething() {
    System.out.println("CLASS IS OVER");
  }

}
 
 */
