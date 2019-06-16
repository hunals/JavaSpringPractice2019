package repl6;

import java.util.*;
public class Replextra {

	  public static void main(String[] args) {
//	    double weight = 0;
//	    double cal = 0;
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("Enter weight in pounds:");
//	      weight = scan.nextDouble();
//	      
//	      cal = 0.0175 * 10 * 30 * weight /2.2 
//	    		  + 0.0175 * 8 * 30 * weight /2.2
//	    		  + 0.0175 * 1 * 6 * 60 * weight /2.2;
//	    
//	      System.out.println("Calories Burned: " + (int)cal);
//	      
//	      int k = 1;
//	      for (; k < 50; k++) {
//			System.out.print('#');
//		}
//	      System.out.print('#');
	      
	      
//	      import java.util.*;
//	      class Main {
//	        public static void main(String[] args) {
//	          Scanner s = new Scanner(System.in);
//	          int num1 = s.nextInt();
//	          int num2 = s.nextInt();
//	          int num3 = s.nextInt();
//	          //your code here
//	          
//	          if(num1>num2 && num1>num3) {
//	        	  System.out.println("n1 is bigger");
//	          }else if (num2>num1 && num2>num3) {
//	        	  System.out.println("n2 is bigger");
//	          }else
//	        	  System.out.println("n3 is bigger");
	          
		  Scanner input = new Scanner(System.in);
		    System.out.println("Enter a number:");
		    int num = input.nextInt();
		   
		    //CODE HERE 
		    
		    if(num %2==0) 
		    	System.out.println(num + " is even");
		    else
		    		System.out.println(num + " is od");
		    		
		    
		  
		  
	}
}
