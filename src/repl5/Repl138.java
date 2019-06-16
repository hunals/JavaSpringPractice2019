package repl5;

import java.util.Scanner;

public class Repl138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     plus();
	  }
	  
	  public static void plus(){
	     
	   int num1, num2, sum;
	   
	   Scanner input = new Scanner(System.in);
	   
	  num1 = input.nextInt();
	  num2 = input.nextInt();
	   
	   sum = num1 + num2 ;
	   
	   System.out.println("result: " + sum );
	}

}

/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3


*/