package day23;

public class Ders5array{

	public static void main(String[] args) {
		
		int [] numbers = new int [2] ;

		numbers[0] = 10;
		numbers[1] = 15;
//		numbers[2] = 28;		//kapasite [2] oldugundan 2 den sonra hata veriyor
//		numbers[3] = 20;
		
		numbers[0] = 100;
		
		System.out.println(numbers[0]);	// en son verilen degeri yazdirir
		System.out.println(numbers[1]);
		
		numbers = new int[4];
		System.out.println(numbers[0]);
		
//		2nd way to create an array with predefined items
		
//		dataType [] variableName =  new dataType[]{item1, item2, item3....}
		
		int[] nums = new int[] {1,3,4,5,8,9,0,4,-2} ;
		
//		getting the size of an array
		
		int size = nums.length ;
		System.out.println( size );
		
		nums[0] = 100 ;
		System.out.println( nums[0]);
		System.out.println( nums[size-1]);
		
//		final way to create an array
		
		int[] nums2 = {1,2,3,4,5,6,7,8,9,89,19,92,18} ;
		System.out.println( nums2.length);
		
		
		
		
		
		
	}

}


/*
    
    // once array is created with a given size 
	    // it can not be changed 
	    int[] numbers = new int[2]; 
	    // ASSIGNING VALUE to array
	    
	    // 2nd way to create an array with predefined items 
	    
	    // dataType [] variableName = new dataType[]{item1, item2 , item3....}
	    int[] nums = new int[] {1,3,4,5,8,9,0,4,-2} ;
	    
	    // getting the size of an array 
	    
	    int size = nums.length ; 
	    System.out.println(size);
	    
	    nums[0] = 100 ;
	    System.out.println(nums[0]);
	    System.out.println(nums[size-1]);
	    
	    //final way to create an array
	    //declaring and assigning value like this
	    //can only happen in one statement
	    int [] nums2 = {1,2,3,4,5,6,7,8,9,45,99,92,84,56};
	    System.out.println( nums2.length   );
	    
	    
	    //this will not compile
//	    int[]num3;
//	         num3 = {1,2,3,4};
    
    
    
    
    
    // once array is created with a given size 
    // it can not be changed 
    int[] numbers = new int[2]; 
    // ASSIGNING VALUE to array
    
    // 2nd way to create an array with predefined items 
    
    // dataType [] variableName = new dataType[]{item1, item2 , item3....}
    int[] nums = new int[] {1,3,4,5,8,9,0,4,-2} ;
    
    // getting the size of an array 
    
    int size = nums.length ; 
    System.out.println( size);
    
    



*/