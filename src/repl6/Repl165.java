package repl6;

import java.util.Scanner;

public class Repl165 {

	public static String mergeStrings(String one, String two) {
	    
		int i=0 ;
		int j=0 ;
		String hg = "" ;
		for(; i < one.length() && j < two.length(); i++, j++) {
			hg += "" + one.charAt(i) + two.charAt(j) ;
		}
	    
	    return hg + one.substring(i, one.length())+ two.substring(j, two.length()) ;
	  }
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    String one=s.next();
	    String two=s.next();
	    
	    System.out.println(mergeStrings(one,two));
	}
}

/*
Dişliler birleştiklerinde ve birlikte çalıştıklarında, 
her birinden bir diş sırayla gider.
Bir yöntem yazın mergeStrings hat birleştirilen dizeleri, 
bir seferde bir harfle başlayarak döndürür. Lütfen bir ve 
iki farklı uzunluklarda olabileceğine dikkat edin. 
Lütfen aşağıdaki örneklere bakınız:


When gears merge and work together, one teeth from 
each one goes in order.
Write a method mergeStrings hat will return the strings merged, 
one letter at a time, starting with one.   Please note one and 
two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"



*/