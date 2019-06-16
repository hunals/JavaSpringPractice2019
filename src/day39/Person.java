package day39;

import java.util.Scanner;

public class Person {

	//properties of the object are defined by instance variable
	// by instance variable/field
	String name ;
	int age ;
	char gender ;
	
	//public static void eat() {
	// any non-static method is called instance method
	public void eat() {
		
		System.out.println(" eating ");
	}
	
	public void tellMeYourName() {
		System.out.println("My Name is " + name);
	}
	
	
	public void printPersonInfo() {
		System.out.println("My Name is : " + name 
				+ "| my age is : " + age 
				+ "| my gender is : " + gender);
	}
	
	// Create a custom class called horse
	// any object created out of this class
	// should have 4 attribute as below
	/*
	 * breed as String
	 * age as int
	 * color as String
	 * Height as double
	 * 
	 * */
	
	
	
//	public static void main(String[] args) {
//		
		/*
		 * Horse :
		 * 		properties : color , age, breed
		 * 		behaviors : jump , eat , run , kick
		 * 
		 * Person : 
		 * 		properties : name , age , gender
		 * 		behaviors : eat , study , laugh , sleep
		 * 
		 * */
		
		
		
		
//		String str = new String("abc");
//		Scanner scan = new Scanner(System.in);
//		Random ran = new Random();
//		
//		
//	}

}

/*

package day39;


public class Person {

  // properties| attributes of 
  // the object are defined
  // by instance variable/field
  String name;
  int age;
  char gender;
  
  //public static void eat() {
  // any non-static method is called instance method 
  public void eat() {
    
    System.out.println(" eating ");
    
  }
  
  public void tellMeYourName() {
    System.out.println("My Name is " + name);
  }
  
  
  
}

*/