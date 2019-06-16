package day28;

import java.util.Arrays;

public class Ders54 {

	public static void main(String[] args) {
		
		String[][] groups = {
								{"BMW", "AUDI" },
								{"TOYOTA", "HONDA", "HYUNDAI"},
								{"SPARTAN", "HORSE"}
		};		

//		System.out.println(Arrays.toString(groups));
//		String [] [] groups = { 
//				{"BMW", "Audi" },
//				{" Toyota", "Honda", "Hyundai" },
//				{ "Spartan", "Horse" } };
//		
		
		
		System.out.println(Arrays.deepToString(groups));
		
		
	}

}

/*
 
     String[][] groups = {   
                 {"BMW","AUDI"},
                 {"TOYOTA","HONDA","HYUNDAI"},
                 {"SPARTAN","HORSE"}           
               } ; 

     System.out.println( Arrays.deepToString( groups) );
 
 
 */
