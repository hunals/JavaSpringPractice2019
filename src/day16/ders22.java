package day16;

public class ders22 {

	public static void main(String[] args) {
		 			//01234567890123456789
		String str = "Ahmad Omar Al Alousi" ;
//		String str = "Elif Derya Unal" ;
		//give me part of string from location 6 till 10
		
		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ", space1 + 1) ;
//		int space3 = str.indexOf(" ", space2 + 1) ;
//		
		String word = str.substring(space1+1 , space2); 
		System.out.println( word ) ;
//		
//		String word2= str.substring(space2+1 , space3); 
//		System.out.println( word2 ) ;
		
//		System.out.println( str.indexOf("A")) ;// a harfinin yerini yazdirdi ilk harfde durdu
//		
//		System.out.println( str.indexOf("A",1)) ; // ilk harfden sonraki ilk a harfinin sirasini yazdirdi
//		
//		System.out.println( str.indexOf("A",10)) ;// onuncu siradan sonraki ilk a nin sirasi
//												  // 11. sirada a oldugu icin 11 sorulursa 11. siradaki a nin sirasini yazdirir
//		System.out.println( str.indexOf("A",12)) ;// 12 siradan sonraki ilk a harfinin sirasini yazdirdi
		
		// 2. kelime 1. bosluk ile 2. bosluk arasinda yer alir
		//3. kelime 2. bosluk ile 3. bosluk arasinda yer alir
		
		
	
		           // 0123456789012
//		String str = "Java is fun !";
		// give me part of string from location 6 till 10

		int index = str.lastIndexOf(" ");

		System.out.println("lastIndexOf : " + index);
		System.out.println("lastIndexOf : " + str.lastIndexOf("a"));
	}

}
