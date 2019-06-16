package day38;

public class Ders1 {

	public static void main(String[] args) {
	    
//		    doSomething();
		    doSomething(100);
		   // int x = 100L ;  //bu komut calismaz
		    doSomething(100L);
		    
		    ///long myLong = 100; bu komut calismiyor
		    
		    doSomething(123d);
		    
		  }
		  
//		  public static void doSomething() {
//		    System.out.println( "doSomething()" );
//		  }
		  
//		  public static void doSomething(int x) {
//		    System.out.println( "doSomething(int x)" );
//		  }
		  
		  public static void doSomething(long x) {
		    System.out.println( "doSomething(long x)" );
		  }
		  
		  public static void doSomething(double x) {
			    System.out.println( "doSomething(double x)" );
			  }
			  
	

}

/*
package day38;

public class MethodOverloading {

  public static void main(String[] args) {
    // TODO Auto-generated method stub  
    doSomething(100);
    //int x = 100L ; 
    doSomething(100L);    
    //long mylong = 100 ; 
    doSomething(123d);

  }
//  public static void doSomething(int x) {
//    System.out.println( "doSomething(int x)" );
//  }
  
  public static void doSomething(long x) {
    System.out.println( "doSomething(long x)" );
  }
  
  public static void doSomething(double x) {
    System.out.println( "doSomething(double x)" );
  }
  
  
  
  
  
  
  public static void doSomething() {
    System.out.println( "doSomething()" );
  }

}

*/