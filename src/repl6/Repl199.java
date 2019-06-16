package repl6;

import java.util.Arrays;
public class Repl199 {
	public static void main(String[] args) {
		
	}
	public static int[] do_switch(int[] i) {

		int n1 = i[0];
		int n2 = i[i.length-1];
		i[0] = n2;
		i[i.length-1] = n1;

		return i;
		}
	}
/*
Switch the last element in an array with the first 
and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

*/