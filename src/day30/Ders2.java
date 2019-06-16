package day30;

public class Ders2 {

	public static void main(String[] args) {
		
		printTheDoubledNumber(5);
		printTheDoubledNumber(8);
		
		checkForAge(21);
		
		int i=21;
		checkForAge(i);
		checkForAge(17);
		
	    // Task 2 
	    /* 2.1
	     * create a static method with no return type
	     * called printTheDoubledNumber
	     * it takes 1 int as parameter
	     * and it will print out doubled number on the console
	     * 
	     * 2.2 
	     * create another static method with no return type
	     * called checkForAge 
	     * it takes 1 int age as parameter
	     * inside body , check whether the age is more than 18 
	     * if the age is more than 18 --> print adult 
	     * if not print not an adult  
	     * 
	     * */
		
	}
	public static void printTheDoubledNumber(int num) {
		int doubledNum=num*2;
		System.out.println(num + " was doubled ---> "+ doubledNum);
	}
	public static void checkForAge(int age) {

		
		if (age>18) {
			System.out.println("Your age : "+ age + " adult");
		}else {
			System.out.println("Your age : "+ age +" not a adult");
		}
	}
	
}


/*
package day30;

public class NumberGame {

  
  public static void main(String[] args) {
  
//    printTheDoubledNumber(10) ; //--> 20
//    printTheDoubledNumber(3) ; 
    
    // when calling a method that take parameter 
    // we can either directly pass data of that type like 21
    // or pass a variable with same type that has that data like i
    checkForAge(21) ; // ---> adult 
    
    int i = 21 ; 
    checkForAge(i);
    
    checkForAge(17);
    
  }
  
  public static void checkForAge(int age) {
    
  
    if(age >18) {
      System.out.println("adult ");
    }else {
      System.out.println("not a adult");
    }
    
  }
  
    
  // int num is called method parameters
  public static void printTheDoubledNumber(int num) {
    // body goes here 
    
    int doubledNum = num * 2 ; 
    System.out.println(num+" was doubled --> "+ doubledNum);
    
  }
  
  



*/