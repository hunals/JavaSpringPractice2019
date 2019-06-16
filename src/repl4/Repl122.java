package repl4;

import java.util.Arrays;
import java.util.Scanner;

public class Repl122 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	   
	    
	    int max=arr[0][0] ;
	    
	      for(int i=0 ;i<=arr.length-1;i++)
		    {
		      for(int j=0 ;j<=arr[i].length-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		       
		        if(arr[i][j]>max) {
		        	max=arr[i][j] ;
		        
		      }
		    }
		    }  
	    System.out.println(max);
//	    System.out.println(Arrays.deepToString(arr));
	    	
	}

}

/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
*/