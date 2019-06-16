package day29;

import java.util.Arrays;

public class Ders1MultiDArrayreviev {

	public static void main(String[] args) {
		
		/*
		 * Array:
		 * is an object to store multiple element of same type 
		 * 
		 * Multi D Array :
		 * Array object that store multiple array object
		 of same type
		 */
		
		int[] nums1 = {1,45,32,10} ;
		int[] nums2 = {2,5,31} ;
		
		int[] numsOfNum[] =new int[2][] ;
		System.out.println( Arrays.deepToString(numsOfNum) );
		
		numsOfNum[0] =nums1 ;
		numsOfNum[1] =nums2 ;
		
		System.out.println( Arrays.deepToString(numsOfNum) );
		
	}

}


/*
 * Array : 
 *   is an object to store multiple element of same type
 * 
 * Multi D Array: 
 * Array object that store multiple array object 
 *  of same type 
 *   

int[] numbers = new int[2] ; 

int[] nums1 = {1,45,32,10} ; 
int[] nums2 = {2,5,31} ; 

int[] numsOfNum[]  = new int[2][];
System.out.println( Arrays.deepToString(numsOfNum)  );

numsOfNum[0] = nums1 ; 
numsOfNum[1] = nums2 ; 

System.out.println( Arrays.deepToString(numsOfNum)  );


*/