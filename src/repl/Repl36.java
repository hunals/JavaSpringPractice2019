package repl;

import java.util.Scanner;

public class Repl36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int  senior = scan.nextInt();
		int  nonSenior = scan.nextInt();
		
		System.out.println("What is new citizen's age?");
		
		int age = scan.nextInt();
		
		if (age >= 65) {
			
			System.out.println("Senior Citizen" 
			+ "\n" + "New seniorCitizens count " + ++senior 
			+ "\n" + "New nonSeniorCitizens count " + nonSenior );
	}else
		
			System.out.print("Non-Senior Citizen" 
			+ "\n" + "New seniorCitizens count " + senior 
			+ "\n" + "New nonSeniorCitizens count " + ++nonSenior );	
		
		
	}

}
