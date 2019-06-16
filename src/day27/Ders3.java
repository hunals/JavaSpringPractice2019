package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		/*
		Afternoon warmup 

		create an array of int 
		ask user for 5 numbers 

		get the sum 
		get the max 
		get the min 

		specifically using for each loop
		*/
		
		Scanner scan = new Scanner(System.in);
//	    int num = scan.nextInt();
	    System.out.println("Enter 5 numbers");
	    int[] nums = new int[5];
//	    		{scan.nextInt(), scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()}
	    
	    for (int i = 0; i < 5; i++) {
			nums[i] = scan.nextInt();
		}
	    System.out.println(Arrays.toString(nums));
	    
	    int sum = 0 ;
	    
	    for (int eachNum : nums) {
			sum = sum + eachNum ;
			
		}
	    System.out.println("sum is : " + sum);
	    
	    
	    int max = nums[0] ;
	    
	    for(int eachNum : nums) {
	    	if (eachNum>max) {
	    		max = eachNum ;
	    	}
	    }
	    
	    System.out.println("max is :" + max);
	    
	    
	    int min = nums[0] ;
	    
	    for(int eachNum : nums) {
	    	if (eachNum<min) {
	    		min = eachNum ;
	    	}
	    }
	    
	    System.out.println("min is :" + min);
	    
	}

}
/*
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter 5 numbers ");
    int [] numbers = {scan.nextInt(),scan.nextInt()
            ,scan.nextInt(),scan.nextInt(),
            scan.nextInt()
            };
    System.out.println(Arrays.toString(numbers));
    int sum= 0;
    
    for( int each : numbers) {
      
      sum += each ; 
      
    }
    System.out.println("sum is : "+ sum);
    
    
    // assume first item is the max before comparing with all items 
    int max = numbers[0] ; 
    
    for(int eachNum : numbers) {
      
      if(eachNum > max) {
        max = eachNum ; 
      }
      
    }
    System.out.println("max is : "+ max);
    
    int min = numbers[0] ;
    
    for (int eachNumber : numbers) {
      if(eachNumber<min) {
        min = eachNumber ; 
      }
    }
    System.out.println("min is : "+ min);


*/
