package day39;

public class Horse {

	
	
	
	String breed ;
	int age ;
	String color ;
	double height ;
	
	/*
	 * breed as String
	 * age as int
	 * color as String
	 * Height as double
	 * 
	 * */
	public static void main(String[] args) {
	
	Horse hrs = new Horse();
	
	hrs.breed = "Eagle" ;
	hrs.age = 4 ;
	hrs.color = "Black" ;
	hrs.height = 1.9 ;
	
	System.out.println(hrs.breed);
	System.out.println(hrs.age);
	System.out.println(hrs.color);
	System.out.println(hrs.height);
	
	
	System.out.println(hrs);    // hascii kod yazdirir

	System.out.println(hrs.breed +"\n"+ hrs.age+"\n"+ hrs.color+"\n"+hrs.height);

	Horse spartan = new Horse();
	
	spartan.breed = "Mustang";
	spartan.age = 10 ;
	spartan.color = "White" ;
	spartan.height = 10 ;
	
	System.out.println(spartan.breed +"\n"+ spartan.age+"\n"+ spartan.color+"\n"+spartan.height);

	
	}	
	
}


/*
package day39;

public class Horse {

  // instance field/variable 
  // to define properties/ attributes of objects 
  // that being created out of this class
  String breed;
  int age;
  String color;
  double height;
  
  
  
  public static void main(String[] args) {
    
    // each objects attribues 
    // are completely independent from
    // any other objects that created 
    // from same class 
    
    Horse h1 = new Horse(); 
    h1.age = 4;
    h1.breed= "Mongolian horse";
    h1.color ="black";
    h1.height= 5.10;
    
    Horse h2 = new Horse();
        // Setting attributes of object
        h2.breed = "Arabian" ;
        h2.age = 5 ;
        h2.color = "black";
        h2.height = 5.5;
        
        System.out.println( h1.color );
        System.out.println( h2.height);
        // reassigned to new value 
        h1.color = "brown"; 
        
        System.out.println(h1.color);
        System.out.println(h2.color);
        
        
        
    
    
    
    
  }
  
  
}

*/