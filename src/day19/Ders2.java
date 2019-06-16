package day19;

import java.util.Scanner;

public class Ders2 {

	public static void main(String[] args) {
		
//		creat a program like above
//		to check whether user input first character
//		1, started with number
//		2, end with uppercase	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER A WORD");
		String str = scan.nextLine();
		char firstChar = str.charAt(0) ;
		if (firstChar >= '0' && firstChar <= '9') {
			System.out.println("number");
		} else {
			System.out.println("NOT number");
		}
		char lastChar = str.charAt(str.length()-1);
		if (lastChar >= 'A' && lastChar <= 'Z') {
			System.out.println("UPPER CASE");
		} else {
			System.out.println("NOT UPPERCASE");
		}
	
	
	
	}

}


//Scanner scan = new Scanner(System.in);
//System.out.println("ENTER A WORD");
//String str = scan.next();
//// how to check whether string start with a-z
//
//char firstChar = str.charAt(0);
//
//// CREATE A PROGRAM LIKE ABOVE 
//    // to check whether user input first character
//    // 1 , started with number
//    // 2 , end with uppercase
//    
//    
//if (firstChar >= '0' && firstChar <= '9') {
//
//  System.out.println(" number ");
//
//} else {
//
//  System.out.println("NOT number ");
//}
//
//// 2 , end with uppercase
//char lastChar = str.charAt(  str.length()-1  ) ; 
//
//if (lastChar >= 'A' && lastChar <= 'Z') {
//
//  System.out.println(" UPPER CASE ");
//
//} else {
//
//  System.out.println("NOT UPPERCASE ");
//}

