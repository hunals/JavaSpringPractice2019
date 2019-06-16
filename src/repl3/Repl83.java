package repl3;

import java.util.Scanner;

public class Repl83 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		String name = "" ;
		String enter = "";
		String guestName = "" ;
		System.out.println("Please enter guest name:");
		name = scan.nextLine();
		System.out.println("Do you want to enter new guest name:");
		enter= scan.next();
		
		
		while (enter.equalsIgnoreCase("yes")) {
			System.out.println("Please enter guest name:");
			guestName = scan.next();
			name = name + ", " + guestName ;
			System.out.println("Do you want to enter new guest name:");
			enter= scan.next();
			
		}	
		System.out.println("Guest's list: " + name );
		
		
		
		
		
		
//		String guestName ="";
//		
//		
//		 System.out.println("Please enter guest name:");
//		    String name = input.next();
//		    
//		    System.out.println("Do you want to enter new guest name:");
//		    String bool = input.next();
//		    
//		    while(bool.equalsIgnoreCase("yes")){
//		    guestName= input.next();
//		    }
//		    System.out.println("Guest's list: " + name + ", " + guestName);
//		    
	}

}
//Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//Ask for the first guest name.
//Then ask does user want to enter one more guest.
// If yes - take input from.
//If not - finish the program and print list of the guests.
//
//Example of the program:
//
//Please enter guest name:
//Nick
//Do you want to enter new guest name:
//yes
//Please enter guest name:
//Linda
//Do you want to enter new guest name:
//no
//
//Guest's list: Nick, Linda