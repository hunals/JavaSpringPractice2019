package day24;

import java.util.Arrays;
import java.util.Random;

public class Ders8random {

	public static void main(String[] args) {
		
		Random rand = new Random() ;
		int[] nums = new int [10] ;
		
//		int i = rand.nextInt(100) ;		//random: program her seferinde farkli rakam atiyor 
//		System.out.println(i);
		
//		for (int j = 0; j < 10; j++) {
//			int i = rand.nextInt(100) ;
//			System.out.print(i + " ");
//		}
		for (int x = 0; x < 10; x++) {
			nums[x] = rand.nextInt(100) ;
			
		}
		System.out.println(Arrays.toString(nums));
		
	}

}

/*

Random rand = new Random() ; 
    int[] nums = new int[10] ; 
    
    for (int x = 0; x < 10; x++) {
      // 0- 100-1
      nums[x] = rand.nextInt(100);
      
    }
    
    System.out.println( Arrays.toString(nums) );


*/