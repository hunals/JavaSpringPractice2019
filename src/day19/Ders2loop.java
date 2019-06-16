package day19;

import java.util.Scanner;

public class Ders2loop {

	public static void main(String[] args) {
		
//		ask user a word
//		for example Bilal -----> B-i-l-a-l-
		
		String name = "Bilal" ;
		
//		System.out.print(name.charAt(0)+ "-" );
//		System.out.print(name.charAt(1)+ "-" );
//		System.out.print(name.charAt(2)+ "-" );
//		System.out.print(name.charAt(3)+ "-" );
//		System.out.print(name.charAt(4)+ "-" );
		
		
		System.out.println();
		int x = 0;
		while (x<5) {
//			System.out.print(x + "-");			// sayilari yazdirir
			System.out.print( name.charAt(x)+ "-"); // yukarida tanimli karaktei yazdirir
			x++ ;
		}
	}
//		
//		Scanner scan = new Scanner(System.in);
////		System.out.println("ENTER A NAME");
//		String name = scan.nextLine();
//		
////		int x = 0 ;
//		
//		while (x<name.length()-1) {
//			System.out.print( name.charAt(x)+ "-"); // yukarida tanimli karaktei yazdirir
//			x++ ;
//	}
//	}
}
//

//Scanner scan = new Scanner(System.in);
//System.out.println("ENTER A name");
//String name = scan.nextLine() ;
//
//int x = 0 ; 
//while(x< name.length() ) {
//  
//  System.out.print (  name.charAt(x)  + "-");
//  ++x ;   //x++ ; 