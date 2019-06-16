package repl4;

import java.util.Scanner;

public class Repl111 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int num = nums[0] ;
	    
		int h = 0;
        for (int i=0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (nums[i] == nums[j] && i!=j) {
                    h++;
                }
            }
            if(h==0)
                    System.out.println(nums[i]);
            h=0;
        
                
        }
		
	}

}

/*
 
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2


*/