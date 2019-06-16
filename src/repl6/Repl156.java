package repl6;

import java.util.Scanner;

public class Repl156 {
	
	public int max(int x,int  max){
		if(x>max)
			return max;
		return x;    
	}
	public static void main(String[] args) {
		
		  Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter first numbers: ");
		    int x=scan.nextInt();
		    System.out.println("Please enter second numbers: ");
		    int max=scan.nextInt();
		    
		    
		    int maxNum = max(x, max);
		    System.out.println(max);
	}

	
}

/*
max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5

*/