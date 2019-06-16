package day25;

import java.util.Arrays;

public class Ders2 {

	public static void main(String[] args) {
		
//		create an string array of capacity 4
//		put your favorite movie/show in
		
//		1. first use loop to print them out
//		2. print the length of all items
//		3. get the max length movie title
		
		String movies[] = new String[4] ;
		movies[0]= "Life" ;
		movies[1]= "Without" ;
		movies[2]= "love is" ;
		movies[3]= "meaningless" ;
		
//		System.out.println(Arrays.toString(movies));
		
		
		
//		System.out.println(movies.length );
		
//		int i = 0;
//		System.out.println(movies[0].length());
//		i++;
//		System.out.println(movies[0].length());
//		i++;
//		System.out.println(movies[0].length());
//		i++;
//		System.out.println(movies[0].length());
		
		for(int i = 0; i<movies.length; i++) {
			System.out.println(movies[i] + " char count is : " + movies[i].length());
		}
		
//		int max = movies[0].length();
//		for (int j = 1; j < movies.length; j++) {
//			
//			if( movies[j].length() >max) {
//				max = movies[j].length();
//			}
//		}
//		System.out.println(max);
//		
		
		
		int max = movies[0].length();
		
		int index = 0 ;
		for (int k = 1; k < movies.length; k++) {
			
			if( movies[k].length() >max) {
				max = movies[k].length();
				index = k ;
			}
		}
		System.out.println(index);
		System.out.println(movies[index]);
		
	}

}

/*

    // create an string array of capacity 4
    // put your favorite movie/show in

    // 1,first use loop to print them out

    // 2, print the length of all items

    // 3 , get the max length movie title

    String movies[] = new String[4];
    movies[0] = "Life";
    movies[1] = "without";
    movies[2] = "love is";
    movies[3] = "meaningless";
    
    System.out.println( Arrays.toString(movies)  );
    
    // getting the count of array 
    // we are using length property of array object  
    System.out.println( movies.length     );// notice this without the parenthesis
    // getting the char count of String 
    // we are using the length method with parenthesis
//    int i = 0 ; 
//    System.out.println( movies[i].length());// notice this with parenthesis
//    i++ ; 
//    System.out.println( movies[i].length());// notice this with parenthesis
//    i++ ; 
//    System.out.println( movies[i].length());// notice this with parenthesis
//    i++ ; 
//    System.out.println( movies[i].length());// notice this with parenthesis
    for (int i = 0; i <= movies.length-1 ; i++) {
      System.out.println( movies[i] + " char count is :  "+movies[i].length() ); 
    }
    
    int max = movies[0].length(); 
    for (int i = 1; i < movies.length; i++) {
      
      if( movies[i].length() > max ) {
        max = movies[i].length() ; 
      }
      
    }
    System.out.println(max);




    // create an string array of capacity 4
    // put your favorite movie/show in

    // 1,first use loop to print them out

    // 2, print the length of all items

    // 3 , get the max length movie title

    String movies[] = new String[4];
    movies[0] = "Life";     // 4 
    movies[1] = "without";   // 7 
    movies[2] = "love is";   // 7 
    movies[3] = "meaningless";  // 11

    int max = movies[0].length();
    // get the location of the word with max length
    // then just use that index to get the word
    int index = 0;
    /* max = 4
     * Iteration 1 : 7 > 4 ---> max = 7  index = 1  
     * Iteration 2 : 7 > 7 ---> max = staySame  index = 1  
     * Iteration 3 : 11 > 7 ---> max = 11  index = 3  
     * 
     *
    
    for (int i = 1; i < movies.length; i++) {

      if (movies[i].length() > max) {
        max = movies[i].length();
        index = i;
      }

    }

    System.out.print(index+" is of the word location "
        + "that has the max length: "+ movies[index]);

*/