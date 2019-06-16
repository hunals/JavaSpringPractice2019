package day27;

public class Ders2 {

	public static void main(String[] args) {
		
		int[] nums = {1,33,567,11,22} ;
		
		for (int i = 0; i < nums.length; i++) {
			
			int eachItem = nums[i] ;
			System.out.println(eachItem);
		}
		
//		for each loop sytax
		/*
		 * for (eachItemDataType variable name: collectionVariable/Array Variable) {
		 * your action in here
		 * }
		 * for each loop or enhanced for loop
		 * 
		 * for each loop can only bu used for looping through collection type
		 * in this particular example it's an array
		 * 
		 */
		
		for ( int eachItem :nums) {
			System.out.println(eachItem);
		}
		/*
		 * create an arrays of string and use for each loop to iterate over them
		 *  create an arrays of double and use for each loop to iterate over them
		 */
		String [] name = {"Hakan", "Derya", "Kubra", "Gulay"} ;
		
		for(String eachItem : name) {
			System.out.println(eachItem);
		}
		
		
		 double[] dbl = { 12.3, 15.8, 20 };
		    for (double eachDbl : dbl) {
		      System.out.println(eachDbl);
		
		    }
	}

}

/*
    int[] nums = {1,33,567,11,22} ; 
    
    for (int i = 0; i < nums.length; i++) {
      
      int eachItem = nums[i] ; 
      System.out.println(eachItem);
      
    }
    
    // for each loop sytax 
    /*
     * for ( eachItemDataType variable name : collectionVariable ) {
     *     your action in here
     * }
     * for each loop  or enhanced for loop  
     * 
     * for each loop can only be used for looping through collection type
     * *
    for( int eachItem  : nums ) {
      System.out.println(eachItem);
    }
    
    
    
    
    
    
       int[] nums = {1,33,567,11,22} ; 
    
    for (int i = 0; i < nums.length; i++) {
      
      int eachItem = nums[i] ; 
      System.out.println(eachItem);
      
    }
    
    // for each loop sytax 
    /*
     * for ( eachItemDataType variable name : collectionVariable/Array Variable ) {
     *     your action in here
     * }
     * for each loop  or enhanced for loop  
     * 
     * for each loop can only be used for looping through collection type
     *  in this particular example it's an array  
     * *
    for( int eachItem  : nums ) {
      System.out.println(eachItem);
    }
    
    /*
     * create an arrays of String and use for each loop to iterate over them 
     * create an arrays of double and use for each loop to iterate over them 
     * 
     * *
    
    String[] names = {"Aliya", "Rayan", "Ainur", "Halida", "Aidar"};
        for (String eachStr: names)
        {
            System.out.println(eachStr);
        }
        
        
        double[] dbl = { 12.3, 15.8, 20 };
    for (double eachDbl : dbl) {
      System.out.println(eachDbl);

*/