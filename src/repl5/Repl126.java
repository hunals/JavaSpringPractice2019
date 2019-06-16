package repl5;

import java.util.Scanner;

public class Repl126 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    
	    String shortWords =str[0];
	    for (int i = 0; i < str.length; i++) {
			
	       	if(str[i].length()<shortWords.length()) {
	    		shortWords = str[i];

	       	}
	    
	    }
	    System.out.println(shortWords);
	    	    
	}

}

/*
Write a program that will print the shortest word in the given array str. 

input: java, cable, red, vivid, remedy, grace
output: red




import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] str = {scan.next(), scan.next(), scan.next(), 
                    scan.next(), scan.next(), scan.next()};
                    
  int minValue = str[0].length();;
    for(int i=0; i< str.length; i++){
      if(str[i].length() < minValue){
        minValue = str[i].length();
      }
    }
*/