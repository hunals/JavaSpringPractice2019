package day29;

public class Spartan {
	
	// METHOD IS CREATED INSIDE CLASS
	//	IT SHOULD NOT BE INSIDE ANY METHOD (like main method)
	
	//method is a action --> always named like doSomething, as verb
	// method name just like variable name always start with
	// lowercase by convention , use camelCase for multiple words
	
	public static void releaseTheHorse() {
		System.out.println("RELEASE IT NOW PLEASE GO !!!");
		System.out.println("PLEASE GO !!!");
	}
	
	public static void holdYourHorse() {
		String owner ="hakan" ;
				System.out.println(owner +", hold your horse please!");
	}
	
	
	public static void main(String[] args) {
		
		
		
		Spartan.releaseTheHorse() ;
		Spartan.releaseTheHorse() ;
		// if you are in same class where the method is defined
		// classname. is optional
		releaseTheHorse() ;
		holdYourHorse() ;
		
		
		// release the horse
		
		// we will start with
		/*
		 * method that does not take external data
		 * method that does not return any value
		 * method that does not need an object to be called
		 
		 Arrays.toString(arr)
		 MethodIntro.releaseTheHorse() ;
		  
		  Spartan.releaseTheHorse() ;
		  
		 * public --- access modifier -- to define where it can be used
		 * static --- non-access modifier
		 * 			  if defined, it means no object needed to call this
		  
		  
		  
		 */
		
	}

	
	
}



/*
 
 package day29;

public class MethodWithParameter {

  public static void main(String[] args) {
    
  }
  
  
  public static void holdYourHorse() {
    
     String owner = "Anar" ;
     
     System.out.println(owner + ", hold your horse please!");       
    
  }
  

}
 
 
 
 

package day29;

public class Spartan {

  
  public static void releaseTheHorse() {
    System.out.println("RELEASE IT NOW PLEASE  GO !!!!");
  }
  
  public static void main(String[] args) {
    
    Spartan.releaseTheHorse();
    Spartan.releaseTheHorse();
    Spartan.releaseTheHorse();
    
    
  // release the horse   
  
    // we will start with 
    /*
     * method that does not take external data
       method that does not return any value 
       method that does not need an object to be called
    
      Arrays.toString(arr)
      
      Spartan.releaseTheHorse() ; 
    
  
     * public --- access modifier -- to define where it can be used
     * static --- non-access modifier
     *        if defined , it means no object needed to call this
       void  ---- it means this method only take action 
               and does not return any value 
     * * 










/ Method : 


// grouping things together 
/ breaking things apart 

Scenario : 

steps 
1, making internet connection 
2, navigate to the amazon 
3, search for items 
4, add to the cart 
5, fill up payment info and pay 
6, receive confirmation in email 


methods that we know so far : 

main method : 
	special method that start and run your program

Scanner class methods : 
	next()
	nextX()...

String class methods 
	strObject.length() 
	strObject.subString(1,4)
	strObject.charAt(0)

Arrays class methods 
	Arrays.toString(arrobject)
	Arrays.sort(arrobject)
	

method observed : 

1, method without return value 

	*some methods only take action without returning/generating a new value so we can store 
		example : Arrays.sort(arr)

2, method with return value 

	*some methods take action and return a value so we can store 
		example :strObject.length()

3, method that does not take external data when being called 

	 strObject.length(); 
	 strObject.toUpperCase(); 
	 strObject.toLowerCase(); 
	 strObject.trim(); 
	 scanObject.next();

4, method that take external data when being called 
	 
	 strObject.charAt(10); 
	 Arrays.sort(arr);
	 strObject.indexOf("horse"); 
	 strObject.subString(1,3);
	 Arrays.copyOfRange(arr,1,4);

5, some methods need an object so we can call using that object 

	strObject.charAt(10);
	String.charAt(10) WRONG !!
	scanobject.next() ; 

6, some methods DOES NOT need an object to be called 

	Arrays.sort(arr) ; 
	Arrays.equals(arr1,arr2); 

*/