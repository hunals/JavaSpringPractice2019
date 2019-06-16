package day38;

import java.util.ArrayList;

public class Ders3 {

	public static void main(String[] args) {

		/*
		 * TASK 1:
		 * create an ArrayList of integer from 1-100
		 * 
		 * get the sum of the each items
		 * get the average
		 * 
		 * create another list that contain items from 100-1
		 * get the count of numbers divisible by 3 and 5
		 * 
		 * OPTIONAL
		 * Combine above 2 lists -- add everything from 2nd list to first one
		 * */
	    
		ArrayList<Integer> nums = new ArrayList<>();
		
//		for (int i = 0; i < 100; i++) {
//			nums.add(i) ;
//		}
//		System.out.println(nums);
//	
//		
//		int sum = 0 ;
//		
//		for (int i = 0; i < nums.size(); i++) {
//			sum+= nums.get(i);
//		}
//		int average = sum/nums.size();
//		 System.out.println( "the average is : " + average);
//		
//		 
		 for (int j = 100 ; j >0 ; j--) {
			nums.add(j);
		}
		 System.out.println(nums);
	
		 int count = 0;
		 for (Integer each : nums) {
			
			 if(each%3==0 && each%5==0)
			        count++ ; 
			      
			    }
			    System.out.println("The target count is : " + count);
		
	
	}

}

/*
package day38;

import java.util.ArrayList;

public class ArrayListTasks {

  public static void main(String[] args) {
    /*
     * TASK 1 : 
     * Create an ArrayList of integer from 1-100
     * 
     * get the sum of the each items 
     * get the average
     * 
     * Create another list that contain items from 100- 1 
     * get the count of numbers divisible by 3 and 5 
     * 
     * OPTIONAL 
     * Combine above 2 lists -- add everything from 2nd list to first one
     * 
     * Update every odd items to 0 ; 
     * 
     * *
    ArrayList<Integer> lst = new ArrayList<>();
    // adding 1-100 to the list 
    for(int i=1; i<=100; i++) {
      lst.add(i);
    }
    System.out.println(  lst  );
    
    
    int sum = 0;
    for (int i = 0; i < lst.size(); i++)
    {
      sum+= lst.get(i);
    }
    int average = sum/ lst.size(); 
    System.out.println( "the average is : " + average);
    
   
      ArrayList<Integer> lst = new ArrayList<>();
    // adding 1-100 to the list 
    
    for (int i = 100; i > 0; i--) {

      lst.add(i);

    }
    System.out.println(lst);
    
    int count = 0 ; 
    for(Integer each: lst) {
      
      if(each%3==0 && each%5==0)
        count++ ; 
        //System.out.println("target number : " + each);
      
    }
    System.out.println("The target count is : " + count);
    
    
    
  }

}
    

*/