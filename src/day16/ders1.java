package day16;

public class ders1 {

	public static void main(String[] args) {
	
		//String str = "Sunday is Java Day" ;
		String str = new String("Sunday is Java Day");
		str.toUpperCase();
		//System.out.println( str );  // hicbirsey degismedi
		
		String up = str.toUpperCase();
		//System.out.println( up );  // hepsi buyuk oldu
		
		int count = str.length();
		//System.out.println(count);
		
		char last = str.charAt(count-1);
		char beforeLast = str.charAt(count-2);
		
		//System.out.println( beforeLast + last); //ascii kod toplamini yazdirdi
		//System.out.println( beforeLast +"" +last);  ///son 2 harf yazdirdi
		
		//System.out.println( str.substring(count-2,count)); //son 2 harf yazdirdi
		//System.out.println( str.substring(16,18));//16-18 arasindaki harfleri yazdirir
		
		int positionOfIs = str.indexOf("is");
		System.out.println( "position Of Is : " + positionOfIs); // is hangi karakterde yer aldigi ilk harfin rakami yazilir
		
//		int x = str.indexOf(97);
//		System.out.println( x );// ascii kodu 97 olan harfin kacinci sirada (sira 0 dan baslar)yer aldigini yazdirdi
	
		System.out.println( str.contains("Java"));// icerisinde java varmi
		System.out.println( str.indexOf("Java")>-1); // java sondan 1. kelimemi
		System.out.println( str.indexOf("Java")); // javanin baslangic karakteri sira numarasi yazdirdi
		
		//str.toLowerCase().contains("Java");
		// SUNDAY IS JAVA DAY
		String low = str.toLowerCase();
		System.out.println( low.contains("java"));
		
		// CUMLEDEKI 2. KELIME YAZDIRILACAK
		
		int indexOfFirstSpace = str.indexOf(" ") ;
		System.out.println( indexOfFirstSpace ) ; // cumledeki 1. bosluk yeri
		
		//String word2 = str.substring(indexOfFirstSpace+1, indexOfFirstSpace+3);
		
		
		//System.out.println( word2 ) ; //cumledeki iki bosluk arasindaji kelime
		
		int index = str.indexOf(" ") ;//indexOfFirstSpace yeniden isimlerdi
		String word2 = str.substring(index+1, index+3);
		System.out.println( word2 ) ;
		
		
///hocanin notlari
	
//		/*
//		 * create a String variable str
//		 * 
//		 * assign value of -> Sunday is Java Day
//		 * 
//		 * 1, make it all upper case 2, get last two characters 3, get the position of
//		 * is 4, check whether word Java exists in this Str OPTIONAL : 5, get the index
//		 * of 3rd word(without knowing)
//		 */
//		// string literal
//		// String str = "Sunday is Java Day" ;
//		String str = new String("Sunday is Java Day");
//		String up = str.toUpperCase();
//		System.out.println(up);
//
//		int count = str.length();
//		// using charAt
//		System.out.println(count);
//
//		char last = str.charAt(count - 1);
//		char beforeLast = str.charAt(count - 2);
//
//		System.out.println(beforeLast + "" + last);
//		System.out.println(str.substring(count - 2, count));
//		// System.out.println( str.substring(count-2) );
//		System.out.println(str.substring(16, 18));
//
//		int positionOfIs = str.indexOf("is");
//		System.out.println("position Of Is : " + positionOfIs);
//
////				int x = str.indexOf(97) ; 
////				System.out.println( x );
//
//		System.out.println(str.contains("Java"));
//
//		System.out.println(str.indexOf("Java"));
//		System.out.println(str.indexOf("Java") > -1);
				
				
				
				
		
		
		
		
		
		
		
		
	}

}
