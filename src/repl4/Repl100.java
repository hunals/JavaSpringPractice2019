package repl4;

import java.util.Scanner;

public class Repl100 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int prize = 0;
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();
//	    int[]abcd = {a,b,c,d};
	    
//	    for (int i = 1; ; i++) {
			
	    	if (a==b && a==c && a==d ) {
	    		prize =30;
	    	}else if ((a==b && a==c && a!=d ) || (a==b && a!=c && a==d ) || (a!=b && a==c && a==d ) || (a!=b && b==c && b==d )) {
	    		prize =20;
	    	}else if ((a==b && a!=c && a!=d ) || (a!=b && a==c && a!=d ) ||(a!=b && a!=c && a==d ) || (a!=b && b==c && b!=d ) ||(a!=b && b!=c && b==d ) || (a!=b && a!=c && b!=c && c==d )) {
	    		prize =10;
	    	}else
	    		prize=0;
	    	
	    	System.out.println(prize);
	
	}
}

//	    int[]abcd= {a,b,c,d};		&& b==c && b==d && c==d
//	for(
//	int i = 1;i<abcd.length-2;i++)
//	{
//		if (abcd[i - 1] == abcd[i] && abcd[i] == abcd[i + 1] && abcd[i + 1] == abcd[i + 2]) {
//			prize += 30;
//		} else {
//			prize += 0;
//		}
//
//}
//	System.out.println(prize);
//	}
//}


/*
You have a green lottery ticket, with ints a, b, c and d on it. 
If the numbers are all different from each other, the prize is 0. 
If all of the numbers are the same, the prize is 30. 
If two of the numbers are the same, the prize is 10. 
If three of the numbers are the same, the prize is 20.

Example:
input: 1
input: 1
input: 1
input: 1
output: 30

Example:
input: 2
input: 1
input: 1
input: 1
output: 20

Example:
input: 2
input: 3
input: 1
input: 1
output: 10

Example:
input: 4
input: 3
input: 2
input: 1
output: 0

*/