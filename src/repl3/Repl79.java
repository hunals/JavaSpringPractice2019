package repl3;

import java.util.Scanner;

public class Repl79 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    String txt = s.next();
		
		int count = txt.length();
		String last = txt.substring(0,count-1) ;
		
		System.out.println(last);
		
	}
}
//In this exercise you get a string called txt .
//
//output txt without its last letter.
//
//for example:
//
//txt = "foo"
//
//output will be:
//fo