package day31;

import java.util.Scanner;

public class Ders2MethodWithMultipleParameter {

	public static void main(String[] args) {
		
		repeat("java", 5);
		repeat("spartan", 10);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me word to repeat");
		
		String str = scan.next();
		System.out.println("Give me number of time to repeat");
		int i = scan.nextInt();
		
		repeat(str, i);
		
		// bu sekilde yazilan komutlar calismiyor
//		repeat();			
//		repeat("abc");
//		repeat("abc", 123, 7262, true);
		
	}

	public static void repeat(String word, int num) {
		
		for (int i = 1; i <= num ; i++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	
	
}

/*

  public static void main(String[] args) {
    
    
    

    repeat("java" , 5); 
    repeat("spartan", 300);
    
    Scanner scan = new Scanner(System.in); 
    System.out.println("Give me word to repeat");
    
    String str = scan.next();
    System.out.println("Give me number of time to repeat");
    int i = scan.nextInt(); 
    
    repeat(str, i);
    
    
//    repeat();
//    repeat("abc");
//    repeat("abc",123,7262,true);
    
    

  }
  public static void repeat(String word, int num) {
    
    for (int i = 1; i <= num; i++) {
      System.out.print(word + " "   );
    }
    System.out.println();


*/
