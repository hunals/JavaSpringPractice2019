package repl;

import java.util.*;

public class If28 {
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    
	    String in = s.next() ;
	    boolean burger = in.equals("burger");
	    boolean chicken = in.equals("chicken");
	    boolean soda = in.equals("soda");
	    float a10=10.0f ;
	    float s2=2.0f ;
	 
	    
	
	    if ( burger ) 
	        System.out.println(a10);
	    else if (chicken) 
	    	System.out.println(a10);
	    else if (soda) 
	    	System.out.println(s2);

	    }
	  
	    
	  } 