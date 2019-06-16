package day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		// step 1
		methodA();
		// step 7
	}
	
	public static void methodA() {
		
		//step 2
		methodB();
		// step 6
		System.out.println(" A called ");
	}

	public static void methodB() {
		//step 3
		System.out.println("B called ");
		// step 4
		methodC();
	}
	public static void methodC() {
		//step 5
		System.out.println("C called ");
	}
	
}

/*
package day50;

public class MethodChaining {

  public static void main(String[] args) {
    
    //  STEP1 
      methodA();
    // STEP  7 --->>> END OF EXECUTION

  }

  public static void methodA() {  
    // STEP 2 
    methodB();
    // STEP 6
    System.out.println("A called  ");
  }

  public static void methodB() {  
    // STEP 3
    System.out.println("B called  ");
    // STEP 4
    methodC();  
  }
  
  
  public static void methodC() {
    
    // STEP 5
    System.out.println("C called  ");
  }
  
  
  
  
  
}


*/