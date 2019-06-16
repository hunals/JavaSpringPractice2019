package repl6;

import java.util.Scanner;

public class Repl154 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
	   
		  int num1 = 0;
		  int num2 = 1;
		  int result = 0;
		  for (int i = 2; i <= num; i++) {
			result = num1 + num2 ;
			num1 = num2;
			num2 = result ;
		}
		 System.out.println(result);
	  }
}


/*
Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34


*/