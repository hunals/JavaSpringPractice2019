package day11;


import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// create a variable int and get the value from scanner
		// declare String variable result ;
		// conditionally assign the value of result using ternary operator
		// if the number is both divisible by 5 and 3 assign result to fizzBuzz
		// else you assign value to notFizzBuzz

		Scanner input = new Scanner(System.in);

		int num;
		String result = "";

		System.out.println("Enter an integer");
		num = input.nextInt();
		
//		if(num % 5 == 0 && num % 3 == 0 ) {
//			result = "FizzBizz" ; 
//			
//		}else{
//			result = "NotFizzBizz" ; 
//		}
		
		result = (num % 5 == 0 && num % 3 == 0 ) ? "FizzBizz" : "Not FizzBizz"; 
		// THIS IS what you do if you dont wanna do anything in else condition 
		//result = (num % 5 == 0 && num % 3 == 0 ) ? "FizzBizz" : result; 
		
		System.out.println(result);
		

	}


}
