package day38;

public class Ders12 {

	public static void main(String[] args) {
		
//		Integer num = new Integer(100) ;
//		doSomething(num) ;
		
		doSomething(100) ;
		
		doSomething(Integer.valueOf(100)) ;
		
		doSomething(Integer.parseInt("100")) ;
		
		int val = Integer.parseInt("100") ;
		doSomething(val) ;
		
		// can we set a Integer variable value to null ?
		// ANSWER YES !!!
		//int x= null ; //BAD IDEA
		
//		Integer b = null ;
//		doSomething(b) ;		// Integer yazdirir
//		
//		doSomething(null) ;
//		Integer x = 100 ;
//		doSomething(x) ;
		
		
		
	}

	public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	
	public static void doSomething(Integer x) {
	    System.out.println( "doSomething(Integer x)" );
	  }
}

/*
package day38;

public class MethodOverloading2 {

  public static void main(String[] args) {

//    Integer num = new Integer(100) ; 
//    doSomething( num );
    
    doSomething( 100 );
    doSomething( Integer.valueOf(100) );
    doSomething( Integer.parseInt("100") );// 100
    
    int val = Integer.parseInt("100");
    doSomething(val);
    
    
    // can we set a Integer variable value to null ? 
    // ANSWER YES !!! 
    // int x= null ; BAD IDEA
//    Integer b = null ; 
//    doSomething(b);
//    doSomething( null );
//    
    //Integer x = 100 ; 
    //doSomething( x );

  }
  public static void doSomething(int x) {
    System.out.println( "doSomething(int x)" );
  }
  
  
  public static void doSomething(Integer x) {
    System.out.println( "doSomething(Integer x)" );
  }
  



*/