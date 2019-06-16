package repl6;

import java.util.*;
public class Repl197 {

	public static void main(String[] args) {
	
	}
	  public static int[] addElements(int[] ints1, int[] ints2) {

	    int[] ints3 = new int[] {0,0,0,0,0};
	    
	    for (int i = 0; i < 5; i++) {
			ints3[i] = ints1[i]+ints2[i];
		}
	    return ints3;
	  }
}
/*
Method addElements accepts 2 int arrays and adds each 
element value of two arrays and returns a new array. 
You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]




*/