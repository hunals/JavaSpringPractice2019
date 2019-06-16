package day29;

import java.util.Arrays;

public class Ders1 {

	public static void main(String[] args) {
		
		String [][] pizza= {{"mushroom","black olive","green pepper"},
		          {"spinach","green pepper","mushroom"},
		          {"black olive","black olive","spinach"},
		          {"mushroom","mushroom","red pepper"},
		          {"banana pepper","spinach","red pepper"},
		          {"mushroom","green pepper","green pepper"},
		          {"spinach","green pepper","mushroom"}};


/*
Task 1.1 : create 2D String array to represent below scenario
( using any one of 3 way to create and assign value to array)
Task 1.2 : print out to see what’s inside using the Arrays class method
Task 1.3 print all the value inside using for loop

*/
		System.out.println(Arrays.deepToString(pizza));	
		
		for(String[] slice : pizza) {
			
			for( String topping: slice) {
				System.out.print(topping + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		for (int k = 0; k < pizza.length; k++) {
			System.out.println("Slice number : " +(k+1));
			if(k==2) 
			continue;
			
			for (int j = 0; j < pizza[j].length; j++) {
				System.out.print(pizza[k][j] + " | ");
			}
			System.out.println();
		}
		
		
		System.out.println("++++++++++++++++++++");
		
		
		spartan:	// buraya herhangi bir kelime ekleyip breakin yanina yazilinca
					//break  de duruyor eklemezsek sadece o satiri pas geciyor(outer, ...)
		for (int i = 0; i < pizza.length; i++) {
			System.out.println("Slice number : " +(i+1));
						
			for (int j = 0; j < pizza[i].length; j++) {
				if(pizza[i][j].equals("banana pepper")) {
				break spartan;
			}
				System.out.print(pizza[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		
	  
	    for (int i = 0; i < pizza.length; i++) {
	      
	      System.out.println("Slice number : " + (i+1) );
	      
	      for(int j=0 ; j < pizza[i].length ; j++ ) {
	        
	        if(pizza[i][j].equals("banana pepper") ) {
	        continue;
	        }      
	        System.out.print(pizza[i][j] + " | ");
	        
	      }
	      System.out.println();
	    }
	}
}

/*
 * /*Create array of 2 Dimensional String Array , the pizza has 7 slice , each slice can be finished in 3 bites , each bite has different topping as color code on the right : total 21 toppings.
Task 1.1 : create 2D String array to represent below scenario( using any one of 3 way to create and assign value to array)
Task 1.2 : print out to see what’s inside using the Arrays class method
Task 1.3 print all the value inside using for loop
Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper
  *
  *
  *
//Task 1.1
String [][] pizza= {
      {"mushroom","black olive","green pepper"},
          {"spinach","green pepper","mushroom"},
          {"black olive","black olive","spinach"},
          {"mushroom","mushroom","red pepper"},
          {"banana pepper","spinach","red pepper"},
          {"mushroom","green pepper","green pepper"},
          {"spinach","green pepper","mushroom"}
          };
// Task 1.2
System.out.println( Arrays.deepToString(pizza)   );

//Task 1.3 print all the value inside using for loop
for(String[] slice: pizza) {
  
  for( String topping : slice) {
    System.out.print(topping + "\t");
  }
  System.out.println();
}
System.out.println("----------------------");
//Task 1.4 print all the value inside using for loop 
//and skip 3rd slice of pizza

for (int i = 0; i < pizza.length; i++) {
  
  System.out.println("Slice number : " + (i+1) );
  if(i==2) 
    continue;
  
  for(int j=0 ; j < pizza[i].length ; j++ ) {
    
    System.out.print(pizza[i][j] + " | ");
  }
    System.out.println();
}



    //Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper
    
    // labels -- used to label certain loop in nested loop 
    
    outer:
    for (int i = 0; i < pizza.length; i++) {
      
      System.out.println("Slice number : " + (i+1) );
      
      for(int j=0 ; j < pizza[i].length ; j++ ) {
        
        if(pizza[i][j].equals("banana pepper") ) {
          break outer; 
        }      
        System.out.print(pizza[i][j] + " | ");
        
      }
      System.out.println();
    }


 System.out.println("---------------------");
    
    for (int i = 0; i < pizza.length; i++) {
      
      System.out.println("Slice number : " + (i+1) );
      
      for(int j=0 ; j < pizza[i].length ; j++ ) {
        
        if(pizza[i][j].equals("banana pepper") ) {
          continue; 
        }      
        System.out.print(pizza[i][j] + " | ");
        
      }
      System.out.println();
    }
*/