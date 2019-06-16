package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl134 {

	public static void main(String[] args) {

		//WRITE YOUR CODE HERE
	    
		int[] val1 = {8, 20, 50};
		int[] val2 = {12, 30, 75};
		
		int[] values[] =new int[2][];
		values[0] = val1;
		values[1] = val2;
		
		
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(values));
		
		
	}

}
/*

 Declare and create a two-dimensional array of ints, values, 
 with 2 rows, and initialize the first row to 8, 20, 50 
 and the second row to 12, 30, 75.

*/

//virgülden sonraki sayıları yuvarlama kodu: 
//System.out.println((“Sayıların toplamı = “+ new DecimalFormat(“##.##”).format(sayi1+sayi2)).replace(‘,’, ‘.’));