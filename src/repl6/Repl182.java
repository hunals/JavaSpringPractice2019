package repl6;

import java.util.ArrayList;
public class Repl182 {

	class Main{
		
	}
		public static int sum(ArrayList<Integer> ints)
		{
			//write code here
			int sum = 0;
			for (int i = 0; i < ints.size(); i++) {
				sum += ints.get(i);
			}
			return sum;
		}
}

/*
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array 
called arr, these two pretty much do the same thing:
someList.size()
arr.length

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at 
index i.  The following two expressions also do the 
same thing:
someList.get(4)
arr[4]

On the left, given an ArrayList of Integers called 
ints, find and return the sum of all the Integers in ints.

*/