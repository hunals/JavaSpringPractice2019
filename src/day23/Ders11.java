package day23;

public class Ders11 {

	public static void main(String[] args) {
					//01234
//		String str = "Hakan" ;
//		String reversed = "" ;
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			reversed += str.substring(i, i+1) ;
////			System.out.print(str.substring(i, i+1));
//							
//		}
//		System.out.println(reversed);
//		iki yazilim seklide ayni sonucu verdiyor yaziyi tersden yazdiriyor
		
		
		String str = "5 Little Monkey Jumping on The Bed" ;
		
//		char eachChar = 'h' ;
//		System.out.println( eachChar>= 'a' );
//		System.out.println( eachChar<= 'z' );
//		
//		if (eachChar >= 'a' && eachChar <= 'z') {
//			System.out.println("IT'S lowecase");
//		}
//		
//		System.out.println("THE END");
		
		
		String allLowercaseStr = "" ;
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i) ;
			if (each >= 'a' && each <= 'z') {
				allLowercaseStr += each ;
//				System.out.println("IT'S lowecase : " + each);
		}
	}
		System.out.println(allLowercaseStr);
}
}
/*
//012345
String str = "Goksel" ; 
String reversed = "" ; 

for (int i = str.length()-1 ; i>=0  ; i--) {

reversed += str.substring(i,i+1) ; 
//System.out.print( str.substring(i,i+1)   );

}
System.out.println(reversed);

//reversed += str.substring(0,0+1) ; 
//reversed += str.substring(1,1+1) ; 
//reversed += str.substring(2,2+1) ; 
//reversed += str.substring(3,3+1) ; 
//reversed += str.substring(4,4+1) ; 




    String str = "5 Little Monkey Jumping on The Bed"; 
    
//    char eachChar = 'H' ; 
//    System.out.println( eachChar >= 'a' );
//    System.out.println( eachChar <= 'z' );
//    
//    if( eachChar >= 'a' && eachChar <= 'z')  {
//      System.out.println("IT'S lowercase");
//    }
//    System.out.println("THE END");
    
    String allLowercaseStr = ""; 
    for (int i = 0; i < str.length(); i++) {
      /// storing each character inside variable each
      // each iteration it will store that char 
      char each = str.charAt(i); 
      // checking whether this character at this iteration 
      // is within the range of a-z
      if( each >= 'a' && each <= 'z')  {
        allLowercaseStr += each ;  // add on top of each other
        //System.out.println("IT'S lowercase : " + each );
      }
    }
    System.out.println( allLowercaseStr);
*/