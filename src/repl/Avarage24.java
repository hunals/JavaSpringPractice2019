package repl;

import java.util.Scanner;

public class Avarage24 {
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to the Grader!" );
	    
	    System.out.println("Please enter subject name number 1 and score for this subject" );
	    String subject1 = scan.next();
	    float grade1 = scan.nextFloat();
	    
	    System.out.println("Please enter subject name number 2 and score for this subject" );
	    String subject2 = scan.next();
	    float grade2 = scan.nextFloat();
	    
	    System.out.println("Please enter subject name number 3 and score for this subject" );
	    String subject3 = scan.next();
	    float grade3 = scan.nextFloat();
	    
	    System.out.println("Please enter subject name number 4 and score for this subject" );
	    String subject4 = scan.next();
	    float grade4 = scan.nextFloat();
	   
	    float grade = (grade1 + grade2 + grade3 + grade4)/4 ;
	    
	    System.out.println("Summary: " + subject1 + " - " + grade1 + ","+  subject2 + " - "+ grade2 + "," 
	    					+ subject3 + " - "+ grade3 + "," + subject4 + " - "+ grade4 ) ;
	    System.out.println("Your average score is: " + grade) ;
	    System.out.println("Thank you for using Grader!" ) ;
	    System.out.println("Goodbye!") ;
	    
	    
	}
	
}
