package day51;

public class Assesment {

	int questionCount;
	int score;
	String type;
	
	static int timeLimit = 45;

	// static method can only access static members
	public static void printTimeLimit() {
		
		System.out.println("time Limit " + timeLimit);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Assesment [questionCount=" 
			+ questionCount + ", score=" + score 
			+ ", type=" + type + "]";
	}
	
	
	
	
}


/*
 package day51;

public class Assesment {


  int questionCount; 
  int score; 
  String type; 
  
  // in our application all assesment has one shared timeLimit 
  static int timeLimit = 45;

  // static method can only access static members 
  public static void printTimelimit() {
    
    System.out.println("time Limit " + timeLimit);
    
  }
  
  
  
  @Override
  public String toString() {
    return "Assesment [questionCount=" 
        + questionCount + ", score=" + score 
        + ", type=" + type + "]";
  } 
  
  
  
  
}
 
 
 */