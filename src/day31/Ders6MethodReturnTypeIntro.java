package day31;

import java.util.Arrays;

public class Ders6MethodReturnTypeIntro {

	public static void main(String[] args) {
		
		
		String str = "You know nothing about Java Jon snow" ;
		
		int count = str.length();
		
		System.out.println(count);
		System.out.println( str.length() );

//		String arrStr = Arrays.toString(str.toCharArray());
		
		int five = giveMeFive();
		System.out.println(five);
		System.out.println( giveMeFive() );
		
		String name = giveMeMyName();
		System.out.println(name);
		
		System.out.println(name.substring(0,2));
	}
	
	public static String giveMeMyName() {
		
		return "Hakan" ;
	}
	
	public static int giveMeFive() {
		
		return 5 ;
	}
}

/*
public class MethodReturnTypeIntro {

  public static void main(String[] args) {
  
    String str = "You know nothing about Java Jon Snow" ; 
    
    int count = str.length() ; 
    
    System.out.println( count );
    System.out.println( str.length() );
    
    
    //String arrStr = Arrays.toString(str.toCharArray()) ; 
    
    int five = giveMeFive() ; 
    System.out.println(  five );
    System.out.println( giveMeFive()  );
    
    
    String name = giveMeMyName(); 
    System.out.println( name );
    
    System.out.println(  name.substring(0,2)   );
    
    
  }
    
  public static String giveMeMyName() {
    
    return "Akbar" ; 
    
  }
  
  
  public static int giveMeFive() {
    
    return 5 ; 
    
  }

*/