package repl5;

import java.util.Scanner;

public class Repl140 {

	public static void cube()
	  {
	    //your code here
		int num, cube;
		   
		Scanner input = new Scanner(System.in);
		   
		num = input.nextInt();
		cube = num*num*num;
		
		System.out.println(cube);
		
	  }//end cube
	  
	  public static void main(String[] args) {
	    
	    cube();
	   
	  }
	}

/*
Given method called cube. Write all required code inside this method in order  to 
asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n


*/