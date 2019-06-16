package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl128 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
//		for (int i = 0; i < 2*nums[i]; i++) {
//			if(i<nums.length-1) {
//				nums[i]=0 ;
//			}
//		}
		System.out.println(Arrays.toString(nums));
	}

}

/*
Given an int array, print a new array with double the length where its 
last element is the same as the original array, and all the other elements are 0. 
The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

Example:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]

Example:
input: 0
output: [0, 0]

Example:
input: 1 2 3 4
output: [0, 0, 0, 0, 0, 0, 0, 4]






Scanner inp = new Scanner(System.in);
            int size = inp.nextInt(),n = inp.nextInt();  //arrayin kac sayi iceriyor ve n degerin ne
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {
                arr[i]=inp.nextInt(); // array degerlerini aliyoruz.
                
            }
            
             add_to_r(arr, n);
          
        
    }
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] new_r= new int [r.length+1];
         new_r =Arrays.copyOf(r, r.length+1);// 
        
         new_r[new_r.length-1]=n;
        System.out.println(Arrays.toString(new_r));
    }
    
    
}



//create new array with one more position.
        int[] new_r=Arrays.copyOf(r,r.length+1);
        int lastInd=new_r.length-1;
      new_r[lastInd]=n;
      for(int i=0; i<=lastInd;i++) {
      System.out.println(new_r[i]);}
    }
    
    
    
    
    
    
    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    
	    //int nums1[] = new int [size];
		int count = 0;
	    int temp = 0;
		for (int j = 0; i < nums.length-1; i++) {
			
			temp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = temp;
		}
	    }
		System.out.println(Arrays.toString(nums));
*/