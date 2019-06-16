package repl;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String ans = s.nextLine();
	  
	    boolean a = ans.equals("a");
	    boolean b = ans.equals("b");
	    boolean c = ans.equals("c");
	    
		if( a ) 
			System.out.println("a is wrong" );
		else if( b )  
			System.out.println("b is correct" );
		else if ( c ) 
			System.out.println("c is wrong" );
		else
			System.out.println(ans + " is not a valid answer" );  
    

	}

}
