package day21;

public class Ders2 {

	public static void main(String[] args) {
		
//		for (int i = 1; i <=10 ; i++) {
//			System.out.println("Got MILK " + i);
//			continue;
//		}
//		
//		for (int i = 1; i <=10; i++) {
//		      
//		      if (i==5) {
//		        continue; 
//		      }
//		    break ;
//		      System.out.println("GOT SMART WATER? "+ i);
//		       break burada kullanilinca alttaki
//		       println olu kod uyarisi veriyor
//		}      
		
		
//		1-50 arasi tek sayilar
//		for (int j = 1; j <=50; j+=2) {
//			System.out.print(j + " ");
//		}      
//		System.out.println();
//		
//		for (int j = 1; j <=50; j+=2) {
//			if(j%2==1) {
//				
//			System.out.print(j + " ");
//		}    
//		}
//		System.out.println();
		
		
//		1-50 arasi 4 e bolunen kac sayi var
		int count = 0;
//		for (int i = 1; i<50; i++) {
//			if (i%4==0) {
//			count = count + 1;
//			}
//		}
//			System.out.print("count is : " + count);
		  
//		
//		for (int i = 1; i < 50; i++) {
//			if(i%4 !=0) {
//				continue;
//			}
//			count = count + 1 ;
//		}      
//		System.out.print("count is : " + count);    
//	}
//
//	}
//		1-50 arasi hem 3 e hem 5 e bolunen sayilar haric hepsini yazdirdi
		int sum = 0 ;
		for (int i = 1; i < 50; i++) {
			
			if(i%5==0 && i%3==0) {
				continue;
						
		}      
		System.out.print(i + " ");  
		sum = sum +i ;
		}
		System.out.println(sum);
	}
}
//// TASK 2.1 
///*
// * USING FOR LOOP 
// * 
// * from 1 to 50 
// * 
// * 1, print out all the odd numbers
// * 
// * TASK 2.2
// * 
// * 2, count all the number divisible by 4
// * 
// * TASK 2.3
// * OPTIONALLY : 
// * 3, skip all numbers divisible by 3 and 5
// *    at the same time 
// * 4, get the sum of above numbers 
// * 
// * */
//
//
//// TASK 2.2
//int count = 0 ; 
////for (int i = 1; i < 50; i++) {
////  
////  if(i%4==0) {
////    count = count + 1 ; // count ++ ; 
////  }
////  
////}
//for (int i = 1; i <50; i++) {
//  
//  if( i%4 != 0) {
//    continue ; 
//  }
//  
//  count = count + 1 ; // count++ ; 
//}
//
//System.out.println("count is : "+ count);
//
//}
