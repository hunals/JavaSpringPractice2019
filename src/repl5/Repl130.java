package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl130 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);

		boolean result = false;
		for (int i = 0; i < outer.length; i++) {
			
			if((outer[i] == inner[0]) && (outer[i+1] == inner[1])) {
				result=true;
		}
	}
		System.out.println(result);
	
	}

}
/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		boolean result=false;
		for (int i = 0; i < outer.length; i++) {
			if (outer[i] == inner[0] && outer[i + 1] == inner[1]) {
			result=true;
			}
		}
		System.out.println(result );

		
  }
}




Artan sıraya göre sıralanan iki sıra dizisi verildiğinde, 
içteki tüm sayılar dışardaysa, doğru yazdırılır. 
Her iki dizinin zaten sıralanmış düzende 
olmasından yararlanın.


Given two arrays of ints sorted in increasing order,
outer and inner, print out true if all of the numbers
in inner appear in outer. Take advantage of the fact
 that both arrays are already in sorted order.
Example:
input (outer): 1, 2, 4, 6
input (inner): 2, 4
output: true

Example:
input (outer): 1, 2, 4
input (inner): 6, 5
output: false





*/