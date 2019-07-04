package day63;

import java.io.FileNotFoundException;
import java.io.IOException;

// WE CAN DECLARE MULTIPLE EXCEPTION TYPE IN METHOD SIGNATURE BY SEPARATING BY COMA

public class MethodThatMightThrowCheckedException2 {

  public static void main(String[] args) {   // throws InterruptedException { // throws IOException {
    
    // handle or declare  
    System.out.println("Beginning");
    
    try {
		doSomethingDangerous();
	
//	} catch (InterruptedException |FileNotFoundException e) {
//		System.out.println("same exact action");
	}catch (Exception e) {
		System.out.println("caught");
	}
 
    System.out.println("Ending");

  }
  
  public static void doSomethingDangerous() throws InterruptedException, FileNotFoundException{
	  
	  System.out.println("some dangerous action with multiple consequences");
	  throw new InterruptedException();
	  
	  
  }

}

/*

package day63;

import java.io.FileNotFoundException;
import java.io.IOException;

// WE CAN DECLARE MULTIPLE EXCEPTION TYPE IN METHOD SIGNATURE BY SEPARATING BY COMA 

public class MethodThatMightThrowCheckedException2 {

  public static void main(String[] args) {   
    
    System.out.println("Beginning");
    
    // handle or declare  
    try {
      doSomethingDangerous();
//    } catch (InterruptedException|FileNotFoundException e ) {
//      System.out.println("same exact action");
    } catch (Exception e ) {
      System.out.println("cautght");
    } 
    
    System.out.println("Ending");

  }
  
  public static void doSomethingDangerous() throws InterruptedException, FileNotFoundException{
    
    System.out.println("some dangerous action with multiple consequences");
    throw new InterruptedException();
  }
  


}


*/