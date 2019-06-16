package repl6;

import java.util.ArrayList;
public class Repl198 {	
	
		public static void main(String[] args){
			
		}
		//create your method below

		public static void repeatAL(ArrayList<Boolean> arr) {
			
		arr.addAll(arr);	
			
			
			
		}
	}

/*
public static void repeatAL(ArrayList<Boolean> boo){
		  ArrayList<Boolean>n=new ArrayList<>();
		  for(int i=0; i<=1; i++){
		     for(int j=0; j<=boo.size()-1;j++) {
		    	 n.add(boo.get(j));
		     }
		  }
		  System.out.println(n);
		}



Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by 
repeating its ArrayList values.  

For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)

*/