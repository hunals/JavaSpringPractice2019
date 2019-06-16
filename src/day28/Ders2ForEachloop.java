package day28;

import java.util.Arrays;

public class Ders2ForEachloop {

	public static void main(String[] args) {
		
		//for each loop should never to be used to modify array items
		
		int a = 10 ;
		int b = a ;
		b = 20 ;
		System.out.println(a);
		
		int[] arr = {1,2,4,6,3} ;
		for (int k = 0; k < arr.length; k++) {
			int eachItem = arr[k] ;
			eachItem= 20 ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		for (int eachItem : arr) {
			eachItem = 20 ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}

/*
  // for each loop should never to be used to modify array items
    
    int a = 10 ; 
    int b = a ; 
    b = 20; 
    
    System.out.println(a);
    
    int[] arr = {1,2,4,6,3} ; 
    
    for (int k = 0; k < arr.length; k++) {
      
      int eachItem = arr[k] ; 
      eachItem = 20 ; 
      
    }
    System.out.println(Arrays.toString(arr));
    
    for (int eachItem : arr) {
      eachItem = 20 ; 
    }
    System.out.println(Arrays.toString(arr));
 
 
 
 */
