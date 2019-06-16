package day20;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		String name = "abc" ;
		String pass = "123" ;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter username : ");
			name = scan.next();
			System.out.println("Enter Pasword");
			pass = scan.next();
		}while( !(name.equals("abc")&& pass.contentEquals("123")));
		
		System.out.println("END");
		
		while( !(name.equals("abc")&& pass.contentEquals("123"))) {
			
		System.out.println("Enter username : ");
		name = scan.next();
		System.out.println("Enter Pasword");
		pass = scan.next();
	
		System.out.println("END");
		}
		
		}

}




  /*
   * while( some condition is true){
   *     action to be repeated
   * }
   * 
   * do{
   *     action to be repeated
   * }while(some condition is true); 
   * 
   * */
  
//  String name = ""; 
//  String pass = "";
//  Scanner scan = new Scanner(System.in); 
//  
//
//  while(  !( name.equals("abc")&& pass.equals("123") ) ) {
//    
//    System.out.println("Enter username : ");
//    name = scan.next(); 
//    System.out.println("Enter Password : ");
//    pass = scan.next(); 
//    
//  }
  
  
//  do {
//    
//    System.out.println("Enter username : ");
//    name = scan.next(); 
//    System.out.println("Enter Password : ");
//    pass = scan.next(); 
//
//  }while(  !( name.equals("abc")&& pass.equals("123") ) ) ; 
  
//  System.out.println("END");