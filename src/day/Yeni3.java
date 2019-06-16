//package day;
//
//public class Yeni3 {
//
//
//Class note Day 3
//JDK --->> JAVA DEVELOPMENT KIT 
//NEEDED TO DEVELOPE JAVA APP 
//JRE ---> JAVA RUNTIME ENVORONMENT
//NEEDED TO RUN JAVA APPLICATION 
//JVM ---> JAVA VIRTUAL MACHINE 
//Live inide JRE and eventally run your program
//JDK has JRE , JRE has JVM 
////
//How do we disable some statement from being run 
//We use // to comment out the statement so it will not be picked up compiler 
///* Block comment , put whatever your want */ 
//FROM THIS POINT ON , 
//We will use Eclipse for writing source code without worrying about how it turn into bytecode and eventaully machine, eclipse automatically compile right away and generate byte code if we dont have any error. 
//Eclipse creating new project 
//if it asks you to set your workspace, just click on ok and check use a default do not ask again 
//Go to File on your menu--> New ---> Java Project 
//give it a name and just hit finish 
//if it asks you to create module , just say dont create
//Click on your project , click new -- select class
//Give your class a name (start with uppercase)
//if you want to generate main method , click check the checkbox that show main method and click finish 
//Package in eclipse is just like folders in filesystem to organize your source code. 
//you can create new package by right click on your project folder , click on new --select package. 
//you can create classes under that package. 
//So if you do not create any package all source code will be right under src folder and it's called default package 
//once you create a class under a package 
//first statement in your source code will be 
//package yourpackagename ;  // or it will not compile
//Task 1 : 
//Under same project 
//Create 3 dirrect packages 
//create 3 different classes inside 
//create one class in default package
//package rule : 
//we cant start with number
//we can use letters
//we can use numbers (do not start with number and it cant be purely number)
//we can use _ $
//// How to rename anything eclipse 
//right click the name you want to change -- refactor --
//rename and enter new name and finish
//guidine for package naming --> should always be lowercasepackage day7;
//
//public class StringPractice {
//
//	public static void main(String[] args) {
//		
//		
//		// the output expected is ---> I love "Java" 
//		String name = "I love \"Java\" " ;
//		System.out.println(name);
//		
//		// the output expected is ---> I love \Java
//		String name2 = "I love \\Java " ;
//		System.out.println(name2);
//		
//		String sentence = " \" Stay Positive \" " ; 
//		System.out.println( sentence  );
//		
//		// my name is "Mustakil" 
//		
//		// IN ORDER TO HAVE quotation inside your string 
//		// you need to add \ before to to tell compiler it's not end of the Sring 
//		// but just treat it as nornal quotation character 
//		//   \" will generate " in the output
//		// same goes for \ itself -->> \\ will generate \ in output 
//		
//		
//		String name3 = "Mustakil" ;
//		System.out.println(  "my name is \"" + name3 + "\" "     );
//		
//		System.out.println( " JAVA IS\n COOL"  );
//		
//		// COME BACK AT 4:15
//		
//
//	}
//
//}
//	
//	
//	
//}
