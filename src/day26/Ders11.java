package day26;

import java.util.Arrays;

public class Ders11 {

	public static void main(String[] args) {
		
		int[] numbers = {11,2,39,7,4,15};
		
		int count = numbers.length ;
		int lastIndex = count-1 ;
		
		for (int i = 0; i < count/2; i++) {
			
			int temp = numbers[i]; 
			numbers[i]= numbers[lastIndex-i] ;
			numbers[lastIndex-i] = temp;
			
		}
		
		/*
		numbers[i] = numbers[i]+numbers[j];         //x=x+y;
       numbers[j]=numbers[i]-numbers[j];           //y=x-y;
       numbers[i] = numbers[i]-numbers[j];         //x=x-y;
				
				
				x=x+y;
				y=x-y;
				x=x-y;
			swapp yontemlerinden birisi	
		*/		
//		int temp = numbers[0]; 
//		numbers[0]= numbers[5] ;
//		numbers[5] = temp;
//		
//		temp = numbers[1]; 
//		numbers[1]= numbers[5-1] ;
//		numbers[5-1] = temp;
//		
//		temp = numbers[2]; 
//		numbers[2]= numbers[5-2] ;
//		numbers[5-2] = temp;
		
		System.out.println(Arrays.toString(numbers));
		
	}

}


/*
    /// reverse this array so the value of numbers array    
    //  will be in reverse order
    
    int[] numbers = { 11,2,39,18,7,4,15};
    System.out.println( Arrays.toString(numbers) );
     
    int count = numbers.length ; 
    int lastIndex = count -1 ; 
    
    for (int i = 0; i < count/2; i++) {
      
       int temp = numbers[i] ; 
       numbers[i] =  numbers[lastIndex - i] ; 
       numbers[lastIndex-i] = temp ;  
      
    }
    
//    int temp ; 
//     temp = numbers[0] ; 
//     numbers[0] =  numbers[5] ; 
//     numbers[5] = temp ;  
//    
//     temp = numbers[1] ; 
//     numbers[1] =  numbers[5-1] ; 
//     numbers[5-1] = temp ;  
//    
//     temp = numbers[2] ; 
//     numbers[2] =  numbers[5-2] ; 
//     numbers[5-2] = temp ;  
//    
//     
//     
     
     
     System.out.println( Arrays.toString(numbers) );
     


*/