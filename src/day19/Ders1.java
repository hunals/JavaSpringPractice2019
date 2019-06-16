package day19;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter your sentence");
//		String sentence = scan.nextLine();
//		while (! sentence.contains("java")){			//uzun cumlelerde calismayabilir
//		while (!(sentence.equalsIgnoreCase("java"))){	//java farkli yazilinca calismadi
//			
//			System.out.println("Enter your sentence");
//			sentence = scan.nextLine();
//		}
//		
//		while (! sentence.toLowerCase().contains("java")){
//		while (! sentence.toUpperCase().contains("JAVA")){		//*bu iki yazi daha kullanisli
//			System.out.println("Enter your sentence");
//			sentence = scan.nextLine();
//		
//		}
//			System.out.println("END");				
//	}
		
//		String str = "While Loop" ;
//		System.out.println(str.equalsIgnoreCase("while loop"));	//true
//		System.out.println(str.equalsIgnoreCase("while"));		//false
//		System.out.println(str.contains("While"));				//true
//		System.out.println(str.contains("while"));				//false
	
	Scanner scan = new Scanner(System.in);
		
		String str = "abc2" ;
		
//		how to check whether string start with a-z
		
		char firstChar = str.charAt(0) ;
//		System.out.println('a' > 'b');		//false ascii kod a<b
		
		if (firstChar >= 'a' && firstChar < 'z') {
			System.out.println("lower case letter");
		}else {
			System.out.println("NOT a-z");
		}
		
}
}
//Scanner scan = new Scanner(System.in);
//
//String str = scan.next();
//// how to check whether string start with a-z
//char firstChar = str.charAt(0);
//
////System.out.println('a' > 'b');
//
//if (firstChar >= 'a' && firstChar <= 'z') {
//
//  System.out.println(" lower case letter");
//
//} else {
//
//  System.out.println("NOT a-z");
//}
