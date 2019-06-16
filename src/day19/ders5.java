package day19;

public class ders5 {

	public static void main(String[] args) {
		
//		int x = 1 ;
//		while(x<6) {
//			System.out.println(x++);
//		}
		
//		int y = 1;
//		do {
//			System.out.println(y++);
//		} while (y<5);
//	
		
//		task 5 
//		count from 1 - 100 in same line
//		count from 100 - 1 in same line
		
//		
//		int h = 1;
//		do {
//			System.out.print(h++ + " ");
//		} while (h<=100);
//	
	
		

		int k = 100;
		do {
			System.out.print(k-- + " ");
		} while (k>0);
	}

}


//  
//  // while loop 
//  // do while 
//  // for loop  // for each loop 
//  
////  int x = 1 ; 
////  while(x<6) {
////    System.out.println( x++ );
////  }
//  /*
//   *do {
//     action to be repeated
//     } while (a condition is true );
//   * 
//   * COMPARE TO WHILE LOOP 
//   * Do while loop 
//   * check the condition after the first iteration 
//   * 
//   * */
//  Scanner scan = new Scanner(System.in);
//  System.out.println("what is the target");
//  int target = scan.nextInt();
//  
//  
//  
//  
//  /*  task 5 
//   * count from 1 - 100 in same line 
//   * */
//  /*  count from 100 - 1 in same line  
//   * 
//   * */
//  
//  int y = 1 ; 
//  do {
//    
//    System.out.print(y++  + " ");
//    
//  }while(y<= 5) ;
//  
//  System.out.println();
//  
//  System.out.println("y value: " + y);
//  do {
//    System.out.print( --y + " ");
//  } while ( y > 1);



//int y = 1 ; 
//do {
//  
//  System.out.print(y++  + " ");
//  
//}while(y<= 5) ;
///*        y     y after iteration   
// * iter 1  --   1       2               2<=5
// * iter 2  --   2       3               3<=5
// * iter 3  --   3       4               4<=5
// * iter 4  --   4       5               5<=5
// * iter 5  --   5       6               6<=5
// * */
//
//System.out.println();
//
//System.out.println("y value: " + y);  // 6 
//do {
//  System.out.print( --y + " ");
//} while ( y > 1);
//
///*        y     y after iteration   
// * iter 1  --   5      5>1             
// * iter 2  --   4      4>1       
// * iter 3  --   3      3>1       
// * iter 4  --   2      2>1       
// * iter 5  --   1      1>1       
// * */

//int y = 1 ; 
//int target = scan.nextInt();
//
//do {
//  
//  System.out.print(y  + " ");
//  y +=2 ; 
//  
//}while(y<= target) ;
///*        y     y after iteration   
// * iter 1  --   1       2               2<=5
// * iter 2  --   2       3               3<=5
// * iter 3  --   3       4               4<=5
// * iter 4  --   4       5               5<=5
// * iter 5  --   5       6               6<=5
// * */
//
//System.out.println();
//
//System.out.println("y value: " + y);  // 6 
//do {
//  y -= 2 ; 
//  System.out.print( y + " ");
//} while ( y > 1);