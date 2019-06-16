package repl5;

import java.util.Arrays;

public class Repl135 {

	public static void main(String[] args) {
		
		 String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		    
		 for (int i = 1; i < 9; i++) {
			 int j =0; 
			for (char x = 'a'; x <= 'h' ; x++, j++) {
				chessBoard[i-1][j] = "" + i + x ;
			}
		}
		 
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
		  
		
		

	}

}

/*
 Satranç tahtasında 8x8 iki boyutlu bir dizi dizi verildi. 
 Satranç tahtasına göre bir dizinin içindeki değerleri sıfırlayın.
 Bu nedenle dizideki ilk eleman olan satranç tahtası [0] [0] "1a" 
 değerine sahip olmalı ve dizideki son eleman, satranç tahtası 
 [7] [7] "8h" değerine sahip olmalıdır.
 
 
Given a 8x8 two-dimensional array of strings named chessboard. 
Initialize values inside an array accordingly to the chess board. 
So first element in the array, chessboard[0][0] should have a value 
"1a", and last element in the array, chessboard[7][7] should have a value "8h". 


for (int i = 1; i < 9; i++) {
      int j = 0;
			for (char x = 'a', j1 = 0; x <= 'h'; x++, j++) {
					chessBoard[i - 1][j] = "" + i + x;
       
			}
		}

*/