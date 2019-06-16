package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class Ders11 {

	public static void main(String[] args) {

		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15));
		
		
		int i = 10 ;
		int j = i ; 
		j = 100 ;
		
		System.out.println(i);  /// sonuc i = 10 dur degismez
		
		for (Integer each : list4) {
			each = 100 ; 
//			System.out.println( "Item : " + each);
		}
		
		for (int x = 0; x < list4.size(); x++) {
			// copying value of item
			Integer each = list4.get(x);
			// changing the value of copy not original
		      each = 100 ; 
//			System.out.println("Item : " + each);
		}
		
		System.out.println(list4);
	}

}


/*

package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {

  public static void main(String[] args) {
    
    ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
    
    
    int i = 10 ; 
    int j = i ;
    j = 100 ; 
    
    System.out.println(i);
    
    for (Integer each : list4) {
      each = 100 ; 
      System.out.println("Item : " + each);
    }
    
    for (int x = 0; x < list4.size(); x++) {
      // copying value of item
      Integer each = list4.get(x); 
      // changing the value of copy not original
      each = 100 ; 
      System.out.println("Item : " + each);
      
    }
    
    
    
    
    
//    for (int x = 0; x <list4.size(); x++) {
//  
//      System.out.println();
//
//    }
    
    
    
    
    package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachWithArray {

  public static void main(String[] args) {
    
    
    int[] nums = {1,4,6,7,2} ; 
    // updating using for each loop  will not work 
    for (int each : nums) {
      each = 100 ; 
    }
    
    // because for each loop get the copy of value inside collection
    // rather than original value 
    for (int i = 0; i < nums.length; i++) {
      int each = nums[i];
      each = 100; 
    }
    
    System.out.println(Arrays.toString(nums));

*/