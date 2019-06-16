package repl;

import java.util.Scanner;

public class PatientInformation23 {
  public static void main(String[] args) {
    //Enter your code here
    
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Welcome to the patient portal!" );
	  System.out.println("Please enter your personal information" );
	  
	  System.out.println("Enter your first name" );
	  String firstName = scan.next();
	  
	  System.out.println("Enter your last name" );
	  String lastName = scan.next();
	  
	  System.out.println("Enter your email" );
	  String email = scan.next();
	  
	  System.out.println("Enter your street" );
	  scan.next();
	  String street = scan.nextLine();
	  
	  System.out.println("Enter your city" );
	  String city = scan.next();
	  
	  System.out.println("Enter your state" );
	  String state = scan.next();
	  
	  System.out.println("Enter your zip code" );
	  int zipCode = scan.nextInt();
	  
	  System.out.println("Enter your work phone number" );
	  long workPhoneNumber = scan.nextLong();
	  
	  System.out.println("Enter your personal phone number" );
	  long personalPhoneNumber = scan.nextLong();
	  
	  System.out.println("Enter your age" );
	  int age = scan.nextInt();
	  
	  System.out.println("Enter your height" );
	  double height = scan.nextDouble();
	  
	  System.out.println("Enter your weight" );
	  double weight = scan.nextDouble();
	  
	  System.out.println("Are you marrried?" );
	  boolean isMaried = scan.nextBoolean();
	  
	  System.out.println("Patient personal information");
	  System.out.println("Full name: " + lastName + ", " + firstName);
	  System.out.println("Address: " + street + ", " + city + ", " + state +", " + zipCode);
	  System.out.println("Contacts: Work phone number - " + workPhoneNumber + ",  "+"personal phone number - " + personalPhoneNumber +", " + "email: " + email );
	  System.out.println("Age : " +age );
	  System.out.println("Height : " + height );
	  System.out.println("Weight : " + weight );
	  System.out.println("Married? : " + isMaried );
	  
	
//	  System.out.println("Enter your mood today: ");
//	  String mood = scan.nextLine();
//	  System.out.println("Enter your location: ");
//	  String location = scan.nextLine();
//	  
//	  System.out.println("Your location is: " + mood);
//	  System.out.print("Your mood is: "+ location);

  }
}

