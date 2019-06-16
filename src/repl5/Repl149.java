package repl5;

import java.util.Scanner;

public class Repl149 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s) {
	    /*
			 * Write your code here.
			 */
		//  Scanner scan = new Scanner(System.in);
			//s = scan.nextLine();
		  
		  
		  int iHour = 0;
		  String hour = s.substring(0, s.indexOf(":"));
		  if(s.indexOf("PM")>0) {
			  iHour = Integer.parseInt(hour)+12 ;
			  System.out.println(iHour + s.substring(s.indexOf(":") , s.indexOf(":")+6));
		  }else {
			  System.out.println(s.substring(0, 8));
		  }
		  
		  
			
	  }
}


/*

Given a time in 12-hour AM/PM format, 
convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, 
and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM 
on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input 
time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45

*/