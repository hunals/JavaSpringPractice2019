package repl;

import java.util.Scanner;

public class If30 {

	public static void main(String[] args) {
		
		System.out.println("Enter seconds:");
		
		Scanner input = new Scanner(System.in);
	    int inputSecond = input.nextInt();
	 
	    boolean hour = false;
	    boolean minute = false;
		int result ;
	
	    int hours = inputSecond/3600 ;
		int minutes = (inputSecond%3600) / 60 ;
		int seconds = (inputSecond % 3600) % 60;
		
		if (hour) {
			result = hours;
		}else if (minute) {
			result = minutes;
		}else {
			result = seconds;
		
		System.out.println(hours + " hours, " + minutes +" minutes, and " + seconds + " seconds");
	}

}
}