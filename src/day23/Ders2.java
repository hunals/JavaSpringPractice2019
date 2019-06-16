package day23;

public class Ders2 {

	public static void main(String[] args) {
		
		char a = 'a' ;
		char next = (char) (a+1) ;		//parantez icine char yazmasaydik ascii kodunu yazacakti
		System.out.println( next );
		
		for (int i = 'a'; i <= 'z' ; i++) {
			
//			System.out.println(i);   	// ascii kod numaralari yazdirir
		char eachChar = (char) i ;
		System.out.print(eachChar);
		}
		

	}

}

/*
 * 
    // upcasting -- type widening -->>
        // converting smaller data type to bigger data type
        // for example : int to long , int - double 
        //          char to int 
    // upcasting happen implicitly (automatically by compiler)
    
    /*
     * downcasting -- type narrowing --> 
     *   converting from bigger data type to smaller 
     *   for example : double to int , long to short 
     *          int to char 
     *  // downcasting must happen explicitly (by programmer)
     *   or it will not compile  
     *   
     
    
    
    char a = 'a' ; 
    
    System.out.println( a+1 );
    char next =  (char) (a + 1) ; 
    System.out.println(next );
    
    int asciiCode = 'a' ; 
    System.out.println(asciiCode);
    
    
    for(int i = 'a' ; i<= 'z' ; i++ ) {
      
      char eachChar = (char) i ; 
      System.out.print( eachChar);
      
    }
    
    // write a program to print all the char from beginning char 
    // to ending char 
    // if beginning character is before ending character 
    // just print in low to high order 
    // if ending character is before beginning char 
    // then print in high to low order 



char a = 'a' ; 

//System.out.println( a+1 );
//char next =  (char) (a + 1) ; 
//System.out.println(next );
//
//int asciiCode = 'a' ; 
//System.out.println(asciiCode);


for(int i = 'a' ; i<= 'z' ; i++ ) {

char eachChar = (char) i ; 
System.out.print( eachChar);


*/