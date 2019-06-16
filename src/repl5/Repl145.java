package repl5;

import java.util.Scanner;

public class Repl145 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
		String word[] = info.split(",");
		
		System.out.println("person name: " + word[0] + " last name: " + word[1] + " age: " + word[2]);
		   
		   
		}//end person
	  
	}

/*
The method person get a string with this format : "name,last name,age"
for example: 

person("jon,doe,30");

the output is:
 
person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char


*/