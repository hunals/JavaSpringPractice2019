package day24;

public class Ders4 {

	public static void main(String[] args) {
		
		int nums [] = {1,4,6,8,9} ;
		for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i] + " ");	
		}
		System.out.println();
		
//		
		int sum = 0 ;
//		for (int i = 0; i < nums.length; i++) {
//			sum= sum + nums[i] ;
//		}
//		System.out.println(sum);
		
		
//		int j = 0;
//		do {
//			sum= sum+nums[j];
//			j++;
//		} while (j<nums.length);
//		
//		System.out.println(sum);
		
//		int z = 0 ;
//	    while (z<nums.length) {
//	      sum = sum + nums[z];
//	      z++ ; 
//	    }
//	    
//	    System.out.println(sum);
		
		
		int max = nums[0];
		
//		for (int i = 1; i < nums.length; i++) {
//			
//			if(nums[i]>max) {
//				max = nums[i] ;
//			}
//		}
//		System.out.println(max);
		
		
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i]<max) {
				max = nums[i] ;
			}
		}
		System.out.println(max);
	}

}

/*
  // print them out using the loop 
      // get the sum of all numbers 
      // get the max number 
      
  public static void main(String[] args) {
    
    int nums []= {1,4,6,8,9,5};
    
    int max = nums[0] ;
    
    
    for (int i = 1; i < nums.length; i++) {
      
      if( nums[i] > max ) {
        max =  nums[i] ; 
      }
      
    }
     we assume the first item is the max 
     * then compare the first item to the rest of them 
     * and replace the value of max with actual max number
     * in each iteration 
     * max 1 
     * iteration 1 ---> 4>1  ----> max 4
     * iteration 2 ---> 6>4  ----> max 6
     * iteration 3 ---> 8>6  ----> max 8
     * iteration 4 ---> 9>8  ----> max 9
     * iteration 5 ---> 5>9 false ----> max 9
     * 
     *  
     * 
    
    System.out.println(max);

*/