package repl2;

import java.util.Scanner;

public class Repl73 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String start = scan.next();
		    String end = scan.next();
		    
		    
		    if ((start.equalsIgnoreCase("A")) && (end.equalsIgnoreCase("A"))) {
		    	System.out.println(end + " found");
		    }else if((start.equalsIgnoreCase("A")) && (end.equalsIgnoreCase("B"))) {
		    	System.out.println("right: "+ end + " found");
		    }else if((start.equalsIgnoreCase("A")) && (end.equalsIgnoreCase("c"))) {
		    	System.out.println("right "+ "> " +"down: "+ end + " found");
		    }else if((start.equalsIgnoreCase("A")) && (end.equalsIgnoreCase("D"))) {
			    	System.out.println("right "+ "> " +"down "+ "> " + "left: "+ end + " found");
		    }else if ((start.equalsIgnoreCase("B")) && (end.equalsIgnoreCase("B"))) {
		    	System.out.println(end + " found");
		    }else if((start.equalsIgnoreCase("B")) && (end.equalsIgnoreCase("C"))) {
		    	System.out.println( "down: "+ end + " found");
		    }else if((start.equalsIgnoreCase("B")) && (end.equalsIgnoreCase("D"))) {
		    	System.out.println("down "+ "> " + "left: "+ end + " found");
		    }else if((start.equalsIgnoreCase("B")) && (end.equalsIgnoreCase("A"))) {
			    	System.out.println("down "+ "> " + "left " +"> " +"up: "+ end + " found");
		    }else if ((start.equalsIgnoreCase("C")) && (end.equalsIgnoreCase("C"))) {
		    	System.out.println(end + " found");
		    }else if((start.equalsIgnoreCase("C")) && (end.equalsIgnoreCase("D"))) {
		    	System.out.println("left: "+ end + " found");
		    }else if((start.equalsIgnoreCase("C")) && (end.equalsIgnoreCase("A"))) {
		    	System.out.println("left " +"> " +"up: "+ end + " found");
		    }else if((start.equalsIgnoreCase("C")) && (end.equalsIgnoreCase("B"))) {
		    	System.out.println("left " +"> " +"up " +"> "+"right: "+ end + " found");
		    }else if ((start.equalsIgnoreCase("D")) && (end.equalsIgnoreCase("D"))) {
		    	System.out.println(end + " found");
		    }else if((start.equalsIgnoreCase("D")) && (end.equalsIgnoreCase("A"))) {
		    	System.out.println("up: "+ end + " found");
		    }else if((start.equalsIgnoreCase("D")) && (end.equalsIgnoreCase("B"))) {
		    	System.out.println("up " +"> "+"right: "+ end + " found");
		    }else if((start.equalsIgnoreCase("D")) && (end.equalsIgnoreCase("C"))) {
		    	System.out.println("up " +"> "+"right " + "> " + "down: "+ end + " found");
		    
		  
		    }  

	}

}


//Write a program that will print out rout instructions. Your program should take 2 parameters: start point and end point. 
//Use left, right, up and down for navigation. Insert ">" between commands.
//If start point equals to end point - display: "start/end(start or end variable!) found".
//Note: you may move only clock wise.
//
//Example:
//Input: A
//Input: D
//Output: right > down > left: D found
//
//Example:
//Input: C
//Input: C
//Output: C found