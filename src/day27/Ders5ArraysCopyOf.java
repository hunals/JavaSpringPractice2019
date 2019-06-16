package day27;

import java.util.Arrays;

public class Ders5ArraysCopyOf {

	public static void main(String[] args) {
		
		String[] dcComicHeros = {"Superman",
				"Batman",
				"Aquaman",
				"Wonder Woman",
				"The Flash",
				"Green Lantern"};
		
		String[] herosCopied = new String[dcComicHeros.length] ;
		
		for (int i = 0; i < herosCopied.length; i++) {
			herosCopied[i] = dcComicHeros[i] ;
		}
		
		System.out.println(Arrays.toString(dcComicHeros));
		
		//sort this array
		//use for each loop to loop through all of them
		//print Bingo
		
//		Arrays.sort(dcComicHeros);
//		
//		for (String hero : dcComicHeros) {
//			System.out.println(hero);
//		}
		
		
		Arrays.sort(herosCopied);
		System.out.println(Arrays.toString(dcComicHeros));
		System.out.println(Arrays.toString(herosCopied));
	
		for (String hero : dcComicHeros) {
			//System.out.println(hero);
			if(hero.equals("Vasly"));
			System.out.println("Bingo");
		}
	
	}

}

/*
   String[] dcComicHeros = {"Superman",
            "Batman",
            "Aquaman",
            "Wonder Woman",
            "The Flash"
            ,"Green Lantern",
            "Vasyl"
          } ;  
    
    String[] herosCopied = new String[ dcComicHeros.length] ; 
    for (int i = 0; i < herosCopied.length; i++) {
      herosCopied[i] = dcComicHeros[i] ; 
    }

    System.out.println( Arrays.toString( herosCopied) );
    
//    // Sort this array 
//    // use for each loop to loop through all of them 
//    // if this array has the hero you are looking for 
//    // print Bingo 
//    
    Arrays.sort(herosCopied);
    System.out.println( Arrays.toString( herosCopied) );
    System.out.println( Arrays.toString( dcComicHeros) );
    
    
    
    
    for (String hero : dcComicHeros) {
      //System.out.println(hero);
      if(hero.equals("Vasyl")) {
        System.out.println("Bingo");
      }
    }


*/