package day30;

import java.util.Scanner;

public class Ders1Utility {

	public static void main(String[] args) {
	
		 printUsersName() ; 
		 printUsersName() ;
		
		
	}
	public static void printUsersName() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please");
		
		String name = scan.next();
		System.out.println("you entered : " + name);
		
	}
	
	
	
	
}

/*
package day30;

import java.util.Scanner;

public class Utility {

  public static void main(String[] args) {
    
    
    printUsersName() ; 
    printUsersName() ; 
  

  }
  
  public static void printUsersName() {
  
    Scanner scan = new Scanner(System.in) ; 
    System.out.println("Enter your name please");
    
    String name = scan.next(); 
    System.out.println("You entered : " + name);    
    
  }






package day30;

import java.util.Scanner;

import day29.Spartan;

public class Utility {

  public static void printUsersName() {
    
    Scanner scan = new Scanner(System.in) ; 
    System.out.println("Enter your name please");
    
    String name = scan.next(); 
    System.out.println("You entered : " + name);    
    
  }
  
  public static void main(String[] args) {  
//    // calling the method
    printUsersName() ; 
//    // calling the method
//    Utility.printUsersName() ; 
    
    // Arrays.sort(arrObject) ; 
    
    
    // We can call methods coming from 
    // different classes 
    // if the class is under same package no import needed
    // if the class is under different package import is mandatory
    Spartan.releaseTheHorse();
    
    
    
    
    
    import day29.Spartan;

public class Utility {

  public static void printUsersName() {
    
    Scanner scan = new Scanner(System.in) ; 
    System.out.println("Enter your name please");
    
    String name = scan.next(); 
    System.out.println("You entered : " + name);    
    
  }
  
  public static void main(String[] args) {  
//    // calling the method
    printUsersName() ; 
//    // calling the method
//    Utility.printUsersName() ; 
    
    // Arrays.sort(arrObject) ; 
    
    
    // We can call methods coming from 
    // different classes 
    // if the class is under same package no import needed
    // if the class is under different package import is mandatory
    Spartan.releaseTheHorse();
  

  }

*/