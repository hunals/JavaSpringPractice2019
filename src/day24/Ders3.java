package day24;

public class Ders3 {

	public static void main(String[] args) {
		
//		creat an array 5 int and assign values 
//		{1,4,6,8,9}
//		double the value of 3rd item : for example 6 --->12
//		update the value of 4th item to sum of 1st and 2nd items 8-->1+4
//		print them out using the loop
//		OPTIONALLY SWAP THE VALUE OF first and last items --->{9,....1}
//		get the sum of all numbers
//		get the max number
		
		int [] num = {2,4,6,8,9};
		
		System.out.println(num);
		
		num[2]*=2 ;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		num[3] = num[0] + num[1] ;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
}
		System.out.println();
		
		
		
		
		
		int nums [] = {1,4,6,8,9} ;
		for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i] + " ");	
		}
		System.out.println();
		
		
		int temp = nums[nums.length-1] ;
		nums[nums.length-1] = nums[0] ;
		nums[0] = temp ;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
	}

}

/*
        int nums[]= {1,4,6,8,9};
        nums[2]=nums[2]*2;
        nums[3]=nums[0]+nums[1];
        for(int i=0;i<=4;i++) {
            System.out.print(nums[i]+" ");
        }
        int temp=nums[0];
        nums[0]=nums[4];
        nums[4]=temp;
        System.out.println();
        System.out.println(nums[0]);
        System.out.println(nums[4]);
        for(int i=0;i<=4;i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        
        System.out.println(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]);
     
     
     
     
     
         int nums []= {1,4,6,8,9};
    for (int i = 0; i < nums.length; i++) {
      System.out.print( nums[i] + " ");
    }
    System.out.println();
    
    int temp = nums[nums.length-1]; 
    nums[nums.length-1] = nums[0] ; 
    nums[0] = temp ; 
    
    for (int i = 0; i < nums.length; i++) {
      System.out.print( nums[i] + " ");
    }
 
 */

