package repl3;

import java.util.Scanner;

public class Repl92 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();	
		
		int index1 = json.indexOf(":") ;
		int index2 = json.indexOf(":", index1+1) ;
		int index3 = json.indexOf(":", index2+1) ;
		int comma1 = json.indexOf(",") ;
		int comma2 = json.indexOf("," , comma1+1) ;
		int comma3 = json.indexOf("," , comma2+1) ;
		
			System.out.println("First name: " + json.substring(index2+3, comma2-1));
			System.out.println("Last name: " + json.substring(index3+3, comma3-1));
	}

}

//String a = ":";
//String b = "lastName";
//String c = "\"" ;
//String d = "\"" ;
//int indexHtml = json.indexOf("<html>");

//int ver1 = json.indexOf(a);
//int ver2 = json.indexOf(b);

//int ver3 = json.indexOf(c);
//int ver4 = json.lastIndexOf(d) ;

//if (!json.contains("<html")) {
//	System.out.println("Invalid input!");
//} else
//	System.out.println("First name: " + json.substring(ver1 + 13, ver3));
//	System.out.println("Last name: " + json.substring(ver2 + 12, ver4));


//Web service is something that provides data as a service over the HTTP (Hypertext Transfer Protocol) protocol. 
//Web pages allow people to communicate and collaborate with each other. 
//Web services allow programs to communicate and collaborate with each other.
//REST is used to build Web services that are lightweight, maintainable, and scalable in nature. 
//A service which is built on the REST architecture is called a RESTful service. 
//The underlying protocol for REST is HTTP, which is the basic web protocol. 
//REST stands for REpresentational State Transfer.  RESTful web service permits different data format 
//such as Plain Text, HTML, XML and JSON.
//
//
//JSON stands for JavaScript Object Notation 
//JSON is a lightweight format for storing and transporting data
//JSON is often used when data is sent from a server to a web page
//JSON is "self-describing" and easy to understand
//Note: ( JavaScript it's also language, don't confuse with Java) 
//TASK
//In this task, we gonna talk about JSON files. JavaScript Object Notation (JSON) - 
//is a language-independent data format. Write a program that will parse JSON file, 
//and print out into the console first name and last name as displayed in the example below.
//In this task, JSON file will be provided as a String variable. 
//Example:
//input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
//output:
//First name: James
//Last name: May
//
//Hint: use replace() method in order to get rid of some characters and use trim() method 
//in order to remove spaces from the beginning and at the end of the string. Use substring() 
//method in order to slice this variable, and indexOf()method in order to identify position of characters. 
//Snippet from JSON file that describes team in the BookIT application.
//
// {
//        "id": 1933,
//        "name": "HighTech",
//        "members": [
//            {
//                "id": 1934,
//                "firstName": "James",
//                "lastName": "May",
//                "role": "student-team-member"
//            },
//            {
//                "id": 1935,
//                "firstName": "John",
//                "lastName": "Dillinger",
//                "role": "student-team-member"
//            },
//            {
//                "id": 1936,
//                "firstName": "Eloisa",
//                "lastName": "MacCauley",
//                "role": "student-team-member"
//            },
//            {
//                "id": 1937,
//                "firstName": "Bess",
//                "lastName": "Lebond",
//                "role": "student-team-leader"
//            },
//            {
//                "id": 1938,
//                "firstName": "Hunt",
//                "lastName": "Durand",
//                "role": "student-team-member"
//            }
//        ]
//    },