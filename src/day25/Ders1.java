package day25;

import java.util.Arrays;

public class Ders1 {

	public static void main(String[] args) {
		
//		create an array of int with capacity of 50
//		store even numbers from 0-100 inside
//		print them out
		
		
//		1-50'ye kadar sayilar
		int[] num =new int[50];
		
		for (int i = 0; i < 50; i++) {
			num [i]=i+1 ;
			
		
		}
		System.out.println(Arrays.toString(num));
		
//		1-100 e kadar cift sayilar
		
		int[] evenNumbers = new int[51] ;
		for (int j = 0; j <= 50; j++) {
			evenNumbers[j]= j*2;
		}
		System.out.println(Arrays.toString(evenNumbers));
		
		
		
	}

}

/*

//create an array of int with capacity of 50 
// store 1-50 inside 
// print them out 
int[] nums = new int [50];

//nums[0] = 1; 
//nums[1] = 2; 
//nums[2] = 3; 
//nums[3] = 4; 
//nums[4] = 5;
//.....
//nums[49] = 50;

for (int i = 0; i <= 49; i++) {
  nums[i] = i+1; 
}
System.out.println( Arrays.toString(nums)  ); 

//nums[0] = 0; 
//nums[1] = 2; 
//nums[2] = 4; 
//nums[3] = 6; 
//nums[4] = 8;
//.....
//nums[50] = 100;


// create another array of int with capacity of 50 
// store even numbers from 0-100 inside
// print them out 

 int[] evenNumbers = new int[51] ; 
    for (int i = 0; i <=50 ; i++) {
      evenNumbers[i] = i * 2 ; 
    }
    System.out.println( Arrays.toString(evenNumbers)  );

    

*/