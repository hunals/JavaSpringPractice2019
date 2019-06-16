package day16;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		
//		String str1 = "" ;
//		
//		System.out.println( str1.isEmpty() ) ; // bosmu komutu cevap true false olarak verir
//				
//		String str2 = "xx" ;
//		
//		System.out.println( str2.isEmpty() ) ;
//		
//		String str3 = " " ;
//		
//		System.out.println( str3.isEmpty() ) ;
//		
//		String actualResult = "Amazon.com" + "" ;

//////////////////////////////////////////////////////
		
		String str = "Busra" ;
		System.out.println( str.startsWith("B")) ;
		
		boolean b = str.startsWith("Bu") ;
		
		if (b== true) {
			System.out.println("Succesiful");
		}else {
			System.out.println("Not a Bu");
		
		
			// Task :
			// ask for user to enter a name
			// 1, check whether the name started with A
			// and ended with x
			// 2, get the last index of letter a

			// OPTIONAL :
			// 3,
			// if the name has more than 2 character do these
			// get the middle letter
			// if the name has odd length get single char
			// if the name has even length get both chars

			// Adam ---> da
			// Johny ---> h
			

			
				//String str = "Odiljan";

				boolean yesOrNo = str.endsWith("no");

				//System.out.println(yesOrNo);

				// Task :
				// ask for user to enter a name
				// 1, check whether the name started with A
				// and ended with x
				// 2, get the last index of letter a

				Scanner s = new Scanner(System.in);

				System.out.println("Enter your name:");
				String name = s.nextLine();
				
				boolean bool1 = name.startsWith("A");
				boolean bool2 = name.endsWith("x");
				
				//if(bool1) {    }
				//if(bool1==true) {    }
				if( bool1 && bool2   ) {
					System.out.println("the name matches");
				} else {
					System.out.println("no macth");
				}
				
				System.out.println(   name.lastIndexOf("a")      );
				

				// OPTIONAL :
				// 3,
				// if the name has more than 2 character do these
				// get the middle letter
				// if the name has odd length get single char
				// if the name has even length get both chars

				// Adam ---> da
				// Johny ---> h
				
				int count = name.length() ; 
				
				if(count>2) {
					
					
					if(count % 2==1) {
						 //01234   5 character      a
						// Adaam   5/2=2 
						
						int midIndex = count/2 ; 
						System.out.println(  name.charAt(midIndex)  );
						
					}else {
						// 012345  6 chars   hm
						// mehmet  6/2 -->  3   
						int midIndex = count/2 ; 
						char midR = name.charAt(midIndex);
						char midL = name.charAt(midIndex-1);

						System.out.println(""+midL + midR );
						
					}
				}
		}
	}
}
					
					
					
				

