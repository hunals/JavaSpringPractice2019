package repl4;

import java.util.Arrays;
import java.util.Scanner;

public class Repl123 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//	    int[] inhabitants = new int[8];
//	    for(int i=0; i<inhabitants.length; i++) {
//	    inhabitants[i] = input.nextInt();
//	    for (int j = 0; j <i; j++) {
			
//	    System.out.println(Arrays.toString(inhabitants));

	    int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 };
	    int day= 0; 
		System.out.println("Day " +day++ + " " + Arrays.toString(inhabitants));
	    int totalPopulation = 0 ;
	    
	    while(true) {
	    	for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i]/2 ;
			}
	    	System.out.println("Day " +day++ + " " + Arrays.toString(inhabitants));
	    	for (int population : inhabitants) {
				totalPopulation+=population ;
			}
	    	if(totalPopulation==0) {
	    		break;
	    	}
	    	totalPopulation = 0 ;
//	    	day++ ;
	    }
	    System.out.println("---- EXTINCT ----");
	    
	}

}

/*
 		int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 };
		// TODO. Write you code below this line.
		int day = 0;
		System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
		int totalPopulation = 0;
		while (true) {
//			lose half of its population
			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
			}
			
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));		
//			we are calculating amount of inhabitants that left
//			3 + 6 + 0 + 4 + 3 + 2 + 7 + 1
//			we need to calculate this, because it's exit criteria
//			
			for (int population : inhabitants) {
				totalPopulation += population;
			}	
			// if all cities have no humans left
			// then break from the loop
			if (totalPopulation == 0) {
				break;
			}
			//if we didn't break,
			//we gonna reset totalPopulation variable		
		    totalPopulation = 0;
		    //update day
			day++;
		}
		System.out.println("---- EXTINCT ----");

 
 
 
 

An array inhabitants represents cities and their respective populations. 
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
After each day, every city will lose half of its population.
write a program to loop though each city population and make it lose half of its 
population until all cities have no humans left. Make updates to each element in the array 
And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.

Hint: 
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 1]

Code:
System.out.println(Arrays.toString(inhabitants)));


*/