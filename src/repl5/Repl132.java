package repl5;

import java.util.Arrays;

public class Repl132 {

	public static void main(String[] args) {
		
		 int [][] multiplicationTable = new int[10][10];
		    
		    //TODO: type your code below
		    
		 
		 
		 for (int row = 0; row <= multiplicationTable.length-1; row++) {
			
			 for (int col = 0; col <= multiplicationTable.length-1; col++) {
				
				 multiplicationTable[row][col]= (row+1) *(col+1) ;
			}
		}
		
		// System.out.println();
		    
		    //Do not modify below line it will be used to test your code. And 
		    //Can be used by you while developing your code
		 System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		 
		
		
		
	}

}


/*
Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], 
with two pairs of square brackets. The elements of a 2D array are arranged 
in rows and columns, and the new operator for 2D arrays specifies 
both the number of rows and the number of columns.

You have  2D array multiplicationTable declared with 10 rows and 10 columns.
Write java program to populate the array with multiplication table values like in the picture below:





*/