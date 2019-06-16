package day37;

//import java.util.ArrayList;
import java.util.*;

public class Ders21 {

	public static void main(String[] args) {
		
		ArrayList<String>lst1 = new ArrayList<>();
		
		lst1.add("Yasar");
		lst1.add("Kursat");
		lst1.add("Erdem");
		lst1.add("Emine");
		lst1.add("Tugba");
		lst1.add("Mavlida");
	
		
		// getting the count of the items inside				// we use size() method
		int count = lst1.size();
		System.out.println( "item count is : " + count);
				
		// iterating over each items using loops
				
		for (int i = 0; i <= 5; i++) {
			System.out.println(lst1.get(i));
					
		}
		
		System.out.println("----------------");
		
		for (String each : lst1) {
			System.out.println(each);
				}
	}

}
