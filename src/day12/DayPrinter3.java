package day12;

import java.util.Scanner;

public class DayPrinter3 {

	public static void main(String[] args) {
		// Task 4
		/*
		 * Switch VS Ternary VS if else
		 * 
		 * Switch : should be used when checking for equality of certain
		 * variable in multiple specific case Ternary : conditionally assigning
		 * a value . we can not take actions we can only assign value according
		 * to condition If else : most flexible , can do anything
		 * 
		 * use switch statement to accomplish this task
		 * 
		 * declare a int variable dayNum declare a String variable dayWord
		 * 
		 * use switch to check for equality of dayNum 
		 * 
		 * case 1 - 5  ---  assign the value for dayWord as weekdays
		 * case 6 - 7  ---   assign the value for dayWord as weekends
		 *  
		 * 
		 * if nothing match assign value dayWord as invalid day
		 * 
		 * after switch statement -- print out the dayWord value
		 * 
		 * 
		 * HOMEWORK : 
		 *  2 variables : season as String , monthNum as int 
		 * 	Use switch statemmet to check for monthNumber equality 
		 *  if  3-4-5 as spring 6-7-8 as summer -9-10-11 fall -12,1,2 as winter
		 * 
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Day number : ");
		int dayNum = scan.nextInt();
		String dayWord = "Unknown";

		switch (dayNum) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayWord = "Weekdays";
			break;
		case 6:
		case 7:
			dayWord = "Weekends";
			break;

		default:
			dayWord = "Invalid Day";
			break;
		}
		System.out.println("the day is:" + dayWord);

		
		
//		import java.util.Scanner;
//
//		public class DayPrinter4 {

//			public static void main(String[] args) {
//				
//				String dayWord ; 
//				dayWord = "Monday";
//				dayWord = "Tuesday";
//				dayWord = "Wendesday";
//				dayWord = "Thursday";
//				dayWord = "Friday";
//				dayWord = "Saturday";
//				dayWord = "Sunday";
//
//
//				System.out.println("the day is:" + dayWord);

			}

	}
