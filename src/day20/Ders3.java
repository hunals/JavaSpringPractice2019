package day20;

public class Ders3 {

	public static void main(String[] args) {
		
//		how many letter a showed up in this String
		String str = "jaaaaava" ;
		
//		go through each and every character
//		if i see a, i will increment my counter by 1
		
		int count = 0 ;
		int x = 0 ;
		do {
			char c = str.charAt(x) ;
			if(c=='a') {		// (c=='a' || c=='A' ) butun a lari bulur
				System.out.println("BINGO at " + x);
				++count	;
			}
//		System.out.println( str.charAt(x) + " ");
		x++ ;
		
		}while (x<str.length());
		
		System.out.println(count);

		
//		yaziyi yukaridan asagiya yazdirir
//		int count = 0 ;
//		int x = 0 ;
//		do {
//			char c = str.charAt(x) ;
//			System.out.println(c);
//		}
//		x++ ;
//		
//		}while (x<str.length());
	}

}
