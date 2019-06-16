package repl2;

import java.util.Scanner;

public class Repl71 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String fullEmail = email.substring(0,email.length()-1);
	    
	    int underScore = email.indexOf( "_" );
	    int et = email.indexOf( "@" );
	    int count = email.length();

	
		if (email.contains("_")) {
			String firstName = email.substring(0,underScore); 
		    String lastName = email.substring(underScore+1,et); 
		    String domain = email.substring(et+1,count);			
			System.out.println( lastName+ "_" + firstName +"@"+ domain );
		}else {
			System.out.println(email);
		}	
	}
}
//In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything. 
//
//Example:
//input: mike_tyson@gmail.com
//output: tyson_mike@gmail.com


//String email=input.next();
//int inde_X =email.indexOf("_");
//int indexEmail=email.indexOf("@"); 
//int leghth=email.length();
//String firstName=email.substring(0, inde_X);
//String lastName=email.substring(inde_X+1, indexEmail);


//int indexS=email.indexOf("_");
//int indexEmail=email.indexOf("@");
//String emailPart=email.substring(indexEmail);
//if (indexS>=0){
//  String firstName=email.substring(0,indexS);
//  String lastName=email.substring(indexS+1,indexEmail);
//  System.out.println(lastName+"_"+firstName+emailPart);
//}else{
//  System.out.println(email);
//}