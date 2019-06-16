package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl137 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    
	    int sumLr= 0, sumRl = 0 ;
	    for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i==j) {
					sumLr = sumLr + matrix[i][j];
				}
				if(i+j == matrix.length-1) {
					sumRl  = sumRl + matrix[i][j];
				}
			}
	    
	    }
	    result = sumLr-sumRl;

	    
	   System.out.println(Math.abs(result));
		
		
	}

} 

/*

Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17. 
Their absolute difference is |15-17| = 2.



*/