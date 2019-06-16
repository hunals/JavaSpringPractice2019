package repl2;

import java.util.Scanner;

public class repl74 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    int veriable1 = message.lastIndexOf("<");
	    int veriable2 = message.lastIndexOf(">");
	    int veriable3 = message.lastIndexOf("[");
	    int veriable4 = message.lastIndexOf("]");
	    int veriable5 = message.lastIndexOf("{");
	    int veriable6 = message.lastIndexOf("}");
	    
	    sender = message.substring(veriable1+1,veriable2) ;
	    phoneNumber = message.substring(veriable3+1,veriable4) ;
	    messageBody = message.substring(veriable5+1,veriable6) ;
	    
	    
	    System.out.println("Sender: " + sender);
	    System.out.println("Phone Number: " + phoneNumber);
	    System.out.println("Message body: " + messageBody);
	    
	    
	}
}
	    
//	    We have a message variable already declared and assigned value in this format
//
//	    Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//
//	    Variables are already declared:
//
//	    sender, phoneNumber, message
//	    - by using String methods:
//	    retrieve related information from SMSmessage string and assign to those 3 variables.
//	    -print each variable in separate line
//
//	    Sender: Mike Smith
//	    Phone Number: 202-123-3456
//	    Message body: I love programing and problem solving
	    
	    
//	String sent= scan.nextLine();
//		
//		
//		int ilk = sent.lastIndexOf('<');
//		int son = sent.lastIndexOf('>');
//		sender = sent.substring(ilk+1, son);
//		
//		int ilk1 = sent.lastIndexOf('[');
//		int son1 = sent.lastIndexOf(']');
//		
//		
//		phoneNumber = sent.substring(ilk1+1, son1);
//		int ilk2 = sent.lastIndexOf('{');
//		int son2 = sent.lastIndexOf('}');
//		
//		
//		message = sent.substring(ilk2+1, son2);
//		System.out.println("Sender: " + sender                );
//		System.out.println("Phone Number: " + phoneNumber         );
//		System.out.println("Message body: " + message          );
//	    
//		


//int firstVariable = message.indexOf("<");
//int secondVariable = message.indexOf(">");
//int thirdVariable = message.indexOf("[");
//int fourthdVariable = message.indexOf("]");
//int fifthVariable = message.indexOf("{");
//int sixthdVariable = message.indexOf("}");
//
//sender =    message.substring(firstVariable+1,secondVariable);
//phoneNumber = message.substring(thirdVariable+1,fourthdVariable);
//messageBody =  message.substring(fifthVariable+1,sixthdVariable);
//
//System.out.println("Sender: "+sender);
//System.out.println("Phone Number: "+phoneNumber);
//System.out.println("Message body: "+messageBody);


//We have a message variable already declared and assigned value in this format
//
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//
//Variables are already declared:
//
//sender, phoneNumber, message
//- by using String methods:
//retrieve related information from SMSmessage string and assign to those 3 variables.
//-print each variable in separate line
//
//Sender: Mike Smith
//Phone Number: 202-123-3456
//Message body: I love programing and problem solving