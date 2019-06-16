package day34;

import java.util.Arrays;

public class Ders2 {

	public static void main(String[] args) {
		
		/*
		 * create static a method called 
		 * getArrayFrom1toX
		 * it takes one parameter
		 * and return array starting from 1 to the number specified
		 * 
		 * getArrayFrom1toX(5) --> {1,2,3,4,5}
		 * */
		
		int x = 15 ;
		
		int[] resultArr = getArrayFrom1toX(x);
		System.out.println(Arrays.toString(resultArr));
		
		// turn this result into String outside
		String arrInString = Arrays.toString( getArrayFrom1toX(7) ) ;
		System.out.println(arrInString);
		
		System.out.println(Arrays.toString( getArrayFrom1toX(17)) );
		
	}

	public static int[] getArrayFrom1toX(int x) {
		
		int[] arr = new int[x] ;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1 ;
			
		}
		
		return arr ;
		
		
	}
	
}

/*

import java.util.Arrays;

public class ArrayMethods {

  public static void main(String[] args) {
    
    /*
     * Create static a method called
     *  
     *  getArrayFrom1toX
     *  it takes one parameter 
     *  and return array starting from 1 to the number specified
     *  
     *   getArrayFrom1toX(5) --> {1,2,3,4,5}
     * *
    int x = 15 ; 
  
    int[] resultArr = getArrayFrom1toX(x) ; 
    System.out.println(Arrays.toString(resultArr));

    /// turn this result into String outside 
    String arrInString = Arrays.toString( getArrayFrom1toX(7) ); 
    System.out.println(arrInString);
    
    System.out.println( Arrays.toString(getArrayFrom1toX(17)) );
    
    
    
    //System.out.println(Arrays.toString(arr));

  }
  
  public static int[] getArrayFrom1toX(int x) {
    
    int[] arr = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+1 ; 
      //System.out.println( i+1  );
    }
    
    return arr ; 
  }

*/