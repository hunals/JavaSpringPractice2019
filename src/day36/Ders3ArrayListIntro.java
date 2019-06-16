package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class Ders3ArrayListIntro{

	public static void main(String[] args) {
		
		
		int i = 10 ;
		Scanner scan = new Scanner(System.in) ;
		Double d = new Double("2.14") ;
		float f = 1.4f ;
		
		
		// an ArrayList variable lst2 is created
		// an ArrayList object is created and assigned to list1
		// it did not specify what we can store in this ArrayList
		// so we can store any type
		ArrayList lst1 = new ArrayList() ;
		lst1.add("abc");
		lst1.add("efg");
		lst1.add(new Integer(10));
		lst1.add(Character.valueOf('A'));
		
		System.out.println( lst1 );
		
		ArrayList<String> lst2 = new ArrayList<>() ;		
		

	}

}
