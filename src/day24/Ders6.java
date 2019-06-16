package day24;

import java.util.Scanner;

public class Ders6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3] ;
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.println("enter number" + (i+1));
//			arr[i] = scan.nextInt();
//			System.out.println(arr[i]);
//		}
		
		int min = arr[0] ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter number" + (i+1));
			arr[i] = scan.nextInt();
			
			if (arr[i]<min) {
				min = arr[i] ;
			}
		}
		System.out.println("min value is : " + min);
		
		
//		max bulunurken butun rakamlar negatif girilirse 
//		int i =0 dedigimiz icin sonuc 0 olarak cikar  
	}

}

/*
 
    Scanner scan = new Scanner(System.in) ; 
    int[] arr = new int[3] ; 

    for (int i = 0; i < arr.length; i++) {
      
      System.out.println("enter number " + (i+1) );
      arr[i] = scan.nextInt();
      System.out.println( arr[i] );
    
    }
    
    
    // BAD WAY TO GET THE MAX 
    // INITIAL VALUE PREFERRABLY THE FIRST ITEM 
//    int max = 0 ; 
//    for (int i = 0; i < arr.length; i++) {
//      
//      if(arr[i]> max  ) {
//        max = arr[i] ; 
//      }
//      
//    }
//    System.out.println(max);
    
    int min = arr[0] ; 
    for (int i = 1; i < arr.length; i++) {
      
      if(arr[i]< min  ) {
        min = arr[i] ; 
      }
      
    }
    System.out.println("min value is : "+ min);
 
 
 */
