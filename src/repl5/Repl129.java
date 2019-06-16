package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl129 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num.length <= 2) {
				num[i] = i;
			}
		}
		
		System.out.println(Arrays.toString(num));
	}

}


/*
Given an int array of any length, print a new array
 of its first 2 elements. If the array is smaller 
 than length 2, use whatever elements are present.

Example:
input 1, 2, 3 
output: [1, 2]

Example:
input 1,
output: [1]

*/