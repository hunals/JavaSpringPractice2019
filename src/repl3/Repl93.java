package repl3;

import java.util.Scanner;

public class Repl93 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	    
	     int index1 = str.indexOf("bread") ;
	     int index2 = str.indexOf("bread", index1+4);
	     int index3 = str.indexOf("bread", index2+4);
	     
	     if (index2<0)
	    	 System.out.println("nothing");
	    else if (index3>1)
	    	 System.out.println(str.substring(index1+5, index3));
	     else if(index2>1 && index3==-1)
	    	 System.out.println(str.substring(index1+5, index2));
	}

}
//A sandwich is two pieces of bread with something in between. 
//Print the string that is between the first and last appearance of "bread" in the given string,
//or return string "nothing" if there are not two pieces of bread.
//Example:
//input: breadjambread
//output: jam
//
//Example:
//input: xxbreadjambreadyy
//output: jam
//
//Example:
//input: xxbreadapple
//output: nothing
//
//Example:
//input: breadbutterbread
//output: butter