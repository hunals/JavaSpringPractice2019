package day30;

public class Ders3 {

	public static void main(String[] args) {
		
//		String s = "abc" ;
//		System.out.println(s.substring(1,3));
		
		printTheSum(10.5, 20.9) ;
		printTheSum(123.9, 200.1) ;
		printTheSum(11.33, 44.1) ;
		reportName("Hakan", "Unal");
//		reportName("Gulay", "Unal");
//		reportName("Derya", "Unal");
//		reportName("Kubra", "Unal");
		reverseString("abcdef") ;
		reverseString("WestWorld") ;
		
	}

	public static void printTheSum(double a, double b) {
		
		double sum = a+b ;
		System.out.println("the sum of numbers is " + sum);
	}
	
	// create a method called reportName
	// this method take 2 String parameters as firstName, lastName
	// return nothing
	// in the body --->
	// print the length of first and lastName with nice message
	// print the first initial of first and lastName together
	
	public static void reportName(String firstName, String lastName) {
		
		
		System.out.println( "firstName " + firstName+ " the length is: " + firstName.length() );
		System.out.println("lastName " + lastName+ " the length is: " + lastName.length());
		System.out.println("Your intial is " + firstName.charAt(0)+ " " + lastName.charAt(0));
		
	}
	
	public static void reverseString(String str) {
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
}


/*

public class MethodWithParameters {

  public static void main(String[] args) {
    
//    String s = "abc" ; 
//    System.out.println(s.substring(1,3));
    
    printTheSum(10.5, 20.9);
    printTheSum(123.9, 200.1);
    printTheSum(11.33, 44.1);
    printTheSum(11, 5);
    
  }
  
  public static void printTheSum(double a, double b) {
    
    double sum = a + b ; 
    System.out.println("the sum of numbers is " + sum);
    
  }
 
  
  public static void reportName(String firstName,String lastName) {
  
  System.out.println("firstName " +firstName + " length is: " 
      + firstName.length() );
  
  System.out.println("lastName " +lastName + " length is: " 
      + lastName.length() );
  
  System.out.println("Your intial is " + firstName.charAt(0) +
      " "+ lastName.charAt(0));
  
}





  

*/