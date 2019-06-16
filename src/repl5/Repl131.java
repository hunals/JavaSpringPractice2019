package repl5;

import java.util.Scanner;

public class Repl131 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int rows = scan.nextInt(); 
	    int cols = scan.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=scan.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    int matches = 0;
			
			for (int i = 0; i <= rows-1; i++) {
				for (int j = 0; j <= arr[i].length-2; j++) {
					if(arr[i][j]==arr[i][j+1]) {
						matches++;
					}
				}
			}
			
	    
	    
	    System.out.print("matches: "+matches);
		
	}

}
/*
Bir 2d dizisi alırsınız ve kaç tane iki eşleşme olduğunu bulmanız gerekir.
ve bulduğunuz eşleşme sayısını (int) döndürün.

Örneğin: 1 ve 2 bir eşleşme değildir, 2 ve 2 bir eşleşmedir.
Bu durumda bir eşleşme, art arda eşit olan iki sayıdır.



Like in a match 3 game but not.

You get a 2d array and you need to find how many two matches there are.
and return the number(int) of matches you found.

For example : 1 and 2 are not a match, 2 and 2 are a match.
a match in this case is two numbers in a row that are equal .

for example:
2,2,1,3,4,5
5,2,3,3,4,5
3,2,3,1,4,5

print
matches: 2

This 2d array has 2 matches (the 2,2 in the first row and 3,3 in the second).

hint: you will need a nested for loop to loop all the array. 
in the if check the if the current number is equal to the next 
(or previous it doesn't matter), check for array boundaries 
before so you won't get an error.



*/