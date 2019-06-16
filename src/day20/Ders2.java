package day20;

public class Ders2 {

	public static void main(String[] args) {
		
//		int x = 100 ;
		
//		do {
//			System.out.println("action repeated");
//		}while (x>200) ;
		
//		ikiside ayni sonuc verir tek fark do birdefa action yazdirir
//		
//		while (x>200) {
//			System.out.println("action repeated");
//		
//		}	
//		System.out.println("END");
		
		
//		
//		int x = 10 ;
//		
//		do {
//			System.out.println(x);
//			x++ ;
//			if (x>50) {
//				break;
//			}
//		}while (x<100) ;
//		
//	tas 3 
//	use do while loop to get the sum of
//	1 till 10 
//	optional : if the sum is more than break out of the loop
	
//		alt tusu basili tutularak satir 
//		asagi yukari yon tuslariyla kaydirilabilir
		int x =1 ;
		int sum = 0 ;
		do {
			sum += x ;
			System.out.println("x : " + x + " sum : " + sum);
			x++ ;
			
			if (sum >40) 
				break;
			
		}while (x<=10) ;
		
	
	}

}


// break statement is used to break out of switch statement
// and loops 

//int x = 10 ; 
//do {
//  
//  System.out.println( x );
//  x++ ;   // x = x+ 1 ;  
//  if(x>50) {
//    break; 
//  }
//  
//} while (x<100);