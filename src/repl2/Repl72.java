package repl2;

import java.util.Scanner;

public class Repl72 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
		
	    int underScore = email.indexOf( "_" );
	    int et = email.indexOf( "@" );
	    int point = email.indexOf( "." );
	    
	    String first = email.substring(0,underScore); 
	    String last = email.substring(underScore+1,et); 
	    String domain = email.substring(et+1,point);
	    String topLevelDomain = email.substring(point+1);
	    
	    String character;
		char a = Character.toUpperCase(first.charAt(0)) ;
		char b = Character.toUpperCase(last.charAt(0)) ;
		int count1 = first.length();
		int count2 = last.length();
		
		String firtsName = a+first.substring(1,count1) ;
		String lastName = b+last.substring(1,count2) ;
	    
	    System.out.println("First name: " + firtsName);
	    System.out.println("Last name: " + lastName);
	    System.out.println("Domain: " + domain);
	    System.out.println("Top Level Domain: " + topLevelDomain);
	    
	    
	}

}

//Write a program that will print out information about user based on email. Print first and last name from the upper case.
//
//Example:
//Input: craig_federighi@apple.com
//Output: 
//First name: Craig
//Last name: Federighi
//Domain: apple
//Top-Level Domain: com