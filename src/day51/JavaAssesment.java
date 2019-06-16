package day51;

public class JavaAssesment extends Assesment{

	int level ;
//	int questionCount; // burada gorunmesine gerek yok
//	int score;
//	String type;
	
//	static int timeLimit;
	
	public static void main(String[] args) {
		
		// static way to access .timeLimit
		System.out.println(Assesment.timeLimit );
		// accessing inherited static field directly in static method
		System.out.println( timeLimit );
		timeLimit = 50;	// deger degisti bundan sonraki satrilar bu degerde yazacak
		// accessing inherited static field in static way
		// using this class name
		System.out.println( JavaAssesment.timeLimit);
		
		
		Assesment.printTimeLimit();
		printTimeLimit();
		JavaAssesment.printTimeLimit();
		
		
	}

//public static void printTimeLimit() {
//		
//		System.out.println("time Limit " + timeLimit);
//		
//	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Assesment [questionCount=" 
//			+ questionCount + ", score=" + score 
//			+ ", type=" + type + "]";
//	}


}

/*
package day51;

public class JavaAssesment extends Assesment{

  int level ; 
//  int questionCount; 
//  int score; 
//  String type; 
  
//   static int timeLimit;  
  
  
 public static void main(String[] args) {
    
    // static way to access .timeLimit
    System.out.println( Assesment.timeLimit  );
    //  accessing inherited static field directly in static method
    System.out.println(  timeLimit );
    // accessing inherited static filed in static way 
    // using this class name 
    System.out.println(  JavaAssesment.timeLimit   );
    
    
    Assesment.printTimelimit();
    printTimelimit();
    JavaAssesment.printTimelimit();
    
  }
  
//  // static method can only access static members 
//    public static void printTimelimit() {
//      
//      System.out.println("time Limit " + timeLimit);
//      
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//      return "Assesment [questionCount=" 
//          + questionCount + ", score=" + score 
//          + ", type=" + type + "]";
//    } 
  
  
  
  
  
  
}


*/