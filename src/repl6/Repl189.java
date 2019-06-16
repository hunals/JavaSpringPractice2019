package repl6;

import java.util.ArrayList;

public class Repl189 {

	public static void main(String[] args)
	{
		
	}
	public static void timesTwo(ArrayList<Integer> nums) {
		
		for (int i = 0; i < nums.size(); i++) {
			
			nums.set(i, nums.get(i)*2);
		}
	}
}

/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.


*/