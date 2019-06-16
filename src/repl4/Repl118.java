package repl4;

import java.util.Scanner;

public class Repl118 {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    
//	    String et = "@" ;
//	    int count =0 ;
	    for (int i = 0; i < email.length(); i++) {
			
	    }String[] newWord = email.split("@");
	    	if (newWord.length==2) {
	    		System.out.println("Email id: " + newWord[0]);
	    		System.out.println("Email domain: " + newWord[1]);
	    	}else {
	    		System.out.println("invalid email");
	    	
	    	
	}
	}

}
/*
Instructions from your teacher:
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:  
invalid email

email -> my@fancy@email.com
print:  
invalid email


*/