package repl4;

import java.util.Arrays;
import java.util.Scanner;

public class Repl124 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }

		int day = 0;
		int indexOfLastElement = inhabitants.length - 1;
		int totalPopulation = 0;
		boolean precedingCityLostAllInhabitants = false; 
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		do {
			day++;
			for (int i = 0; i < inhabitants.length; i++) {
			  //if it's a first city
			  //then we want to check if population of second city is equals to 0
				if (i == 0) {
				  //if population of second city is equals to 0
					if (inhabitants[1] == 0) {
					  //first will loose half of the population
						inhabitants[0] = inhabitants[0] / 2;
					}
				 //if it's a last city
			  //then we want to check if population of second before las city is equals to 0
				} else if (i == indexOfLastElement) {
				  //if population of second before last city is equals to 0
					if(inhabitants[indexOfLastElement - 1] == 0) {
					  //then last city will loose half of the population
						inhabitants[indexOfLastElement] = inhabitants[indexOfLastElement] / 2;
					}
				} else {
				  //if it's no t a first or last city
				  //the we are checking if it's not already 0
				  if(inhabitants[i] != 0){
				    //the we are checking if following value is equals to 0
  					if (inhabitants[i + 1] == 0 ) {
  					  //if it's true, then this city losses half of the population
  						inhabitants[i] = inhabitants[i] / 2;
  						//if preceding city has no population and it 
  						//didn't loose population within a same the day
  					}else if (inhabitants[i - 1] == 0 && !precedingCityLostAllInhabitants) {
  			      //if it's true, then this city losses half of the population
  						inhabitants[i] = inhabitants[i] / 2;
  						//this is for seeting our condition
  						//it set precedingCityLostAllInhabitants to true only if city lost all inhabitants
  						if(inhabitants[i]==0){
  						  precedingCityLostAllInhabitants = true;
  						}
  					}
				  }
				}

			}
			//we are printing updated info
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			//we are checking how many inhabitants left
			//if there is no more inhabitants
			//breake from the loop
			for (int i : inhabitants) {
				totalPopulation += i;
			}
			//break if no more inhabitants 
			if (totalPopulation == 0) {
				break;
			}
			//reset condition
      precedingCityLostAllInhabitants = false;
      //reset counter
			totalPopulation = 0;
		} while (true);

		System.out.println("---- EXTINCT ----");
  }
}
/*
/*
An array inhabitants represents cities and their respective populations. For example, 
the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population 
if it is adjacent(right or left) to a city with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example 
numbers to follow.

Hint: 
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 1]

Code:
System.out.println(Arrays.toString(inhabitants)));

***************

Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {

            inhabitants[i] = input.nextInt();
        }
        int Days = 0;

        boolean[] z = new boolean[8];


        int[] temp = Arrays.copyOf(inhabitants, 8);
      //  System.out.println("copy of inhabitants" + Arrays.toString(temp));

        boolean x = true;
        while (x) {
            System.out.println("Day " + (Days++) + " " + Arrays.toString(inhabitants));


            for (int i = 0; i < inhabitants.length; i++) {
               
                z[i] = (inhabitants[i] == 0 ? true : false);

                if (i > 0 && i < inhabitants.length - 1) {
                    if (inhabitants[i - 1] == 0 || inhabitants[i + 1] == 0) {
                        temp[i] = inhabitants[i] / 2;
                    }
                } else if (i == 0) {
                    if (inhabitants[i + 1] == 0) {
                        temp[i] = inhabitants[i] / 2;
                    }

                } else if (i == inhabitants.length - 1) {
                    if (inhabitants[i - 1] == 0) {
                        temp[i] = inhabitants[i] / 2;
                    }

                }

            }

            inhabitants = Arrays.copyOf(temp, 8);

            x = (Arrays.toString(z)).contains("false");
        }
        

        System.out.println("---- EXTINCT ----");

    }
}













int day = 0;
	    int indexOfLastElement = inhabitants.length-1 ;
    	int totalPopulation = 0;
    	boolean preceding ;
		System.out.println("Day " + day +" " +Arrays.toString(inhabitants) );
	    do {
	    	day++;
	    	
	    	for (int i=0; i <inhabitants.length; i++) {
	    		if(i==0) {
	    			if(inhabitants[1]==0) {
	    				inhabitants[0] = inhabitants[0]/2 ;
	    			}
	    			}else if(i==indexOfLastElement) {
	    				if(inhabitants[indexOfLastElement-1] == 0) {
	    				inhabitants[indexOfLastElement] = inhabitants[indexOfLastElement]/2 ;
	    				}
	    				}else {
	    				if(inhabitants[i+1]==0 || inhabitants[i-1]==0) {
	    					inhabitants[i] = inhabitants[i]/2 ;
	    				}
	    		}
	    	}
	    	System.out.println("Day " + day +" " +Arrays.toString(inhabitants) );
	 	   for(int i : inhabitants) {
	 		   totalPopulation +=i ;
	 	   }
	    	if(totalPopulation==0) {
	    		break;
	    	}
	    	totalPopulation = 0 ;
	    }while(true);
	    
	    
*/