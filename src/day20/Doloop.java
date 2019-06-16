package day20;

import java.util.Scanner;

public class Doloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		String name = scan.next() ;
//		
////		char c = name.charAt(0);
//		
//		String fUp = name.substring(0,1).toUpperCase();
//		String expected =fUp + name.substring(1);
//		
//		System.out.println(expected);
		
		String name = "hakan" ;
		
		int x = 0 ;
//		do {
//			System.out.print(name.charAt(x)+ " ");
//			x++;
//		} while (x < name.length()); 
		
	
		
		while (x < name.length()) {
			System.out.print(name.charAt(x)+ " ");
			x++;	
		}
	}

}
//Scanner scan = new Scanner(System.in); 
//String name = scan.next(); 

// Task 1 :

// print our name char by char using do while loop 
// Hurma --> H u r m a 
// use do while loop 



//String fUp = name.substring(0,1).toUpperCase(); 
//String expected = fUp + name.substring(1); 
//
//System.out.println( expected);
//char c = name.charAt(0); 

//System.out.println(name.charAt(0)+""+name.substring(1));