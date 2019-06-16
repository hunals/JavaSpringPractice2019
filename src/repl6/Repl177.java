package repl6;

import java.util.Arrays;
	public class Repl177 {
	
	  public static int[] mergR(int[] a,int[] b) {
	    
			   //we need to create an array 
			   //that is capable to handle values from both arrays a and b
			   //( a--> [1,2,3], b--> [4,5,6])
			   // c[] --> [0,0,0,0,0,0]
		  int[] c = new int[a.length + b.length];
		  
		    	//this index we gonna use to set values in the new arrray
		   
		  int index =0;
		  for(int j=0; j<a.length; j++){
			    // 1st iteration --> [1,0,0,0,0,0]
			    // 2nd iteration --> [1,2,0,0,0,0]
			    // 3rd iteration --> [1,2,3,0,0,0]
		     
			  c[index]=a[j];
		     index++;
		   }
		   for(int i=0; i<b.length; i++){
			     //index = 3 
			     // 1st iteration --> [1,2,3,4,0,0]
			     // 2nd iteration --> [1,2,3,5,4,0]
			     // 3rd iteration --> [1,2,3,4,5,6]
		     c[index] = b[i];
		      index++;
		   }
		   return c;
		    
		
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
	   
	  }
	}

/*
Instructions from your teacher:
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.

*/