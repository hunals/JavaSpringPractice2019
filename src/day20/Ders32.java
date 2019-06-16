package day20;

public class Ders32 {

	public static void main(String[] args) {
		
		
//		java20awesome ------> javaawesome   20
		
		String mix = "Aonline132x" ;
		
//		char c = mix.charAt(0) ;
////		check whether c is between 0 - 9
//		
//		if(c>= '0' && c<= '9') {
//		
//		System.out.println("NUMBER!!");
//		}else {
//			System.out.println("NOT NUMBER!!");
//		}
//		
//		if(c>= 'A' && c<= 'Z') {
//			
//			System.out.println("UPPERCASE!!");
//			}else {
//				System.out.println("NOT UPPERCASE!!");
//			}
		
		int i = 0 ;
//		
//		while(i<mix.length()) {
//			
//			char c = mix.charAt(i);
//			
//			if (c>='0' && c<= '9')		// bu satir icindeki rakamlari yazdirdi
//			System.out.println(c);
//			i++ ;
//		}
		
		String numberStr = "" ;
		
		while(i<mix.length()) {
			
			char c = mix.charAt(i);
			
			if (c>='0' && c<= '9')	{	
			System.out.println(c);
			numberStr = numberStr + c ;
		}
			i++ ;
	}
	System.out.println(numberStr);
	
	
	int y = 0 ;
	do {
		
		char c = mix.charAt(y);
		
		if (c >= 'a' && c <= 'z');{
		System.out.println(c);
	}
	y++	;	
	}while (y<mix.length());

System.out.println(numberStr);
	
	
	}

}


//int i = 0 ; 
//
//while(i< mix.length()) {
//  
//  char c = mix.charAt(i); 
//  
//  if( c>= '0' && c<= '9' ) {
//    System.out.println(c);
//    numberStr = numberStr + c ; 
//  }
//  
//  i++ ; 
//}
//System.out.println(  numberStr );
//




//// java20awesome---->> javaawesome    20  
//
//String mix = "Aonline132x";
//
//char c = mix.charAt(0); 
//
//// check whether c is between 0 - 9 
////if( c>= 32 && c<= 41 ) {
//  
//if( c>= '0' && c<= '9' ) {
//  System.out.println("NUMBER!!");
//}else {
//  System.out.println("NOT NUMBER!!");
//}
//
//if( c>= 'A' && c<= 'Z' ) {
//  System.out.println("UPPERCASE!!");
//}else {
//  System.out.println("NOT UPPERCASE!!");
//}

