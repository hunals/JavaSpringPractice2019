package day18;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		
		long x = 10;
		long y = 15;
		System.out.println( x==y );  //yanlis
		
		// scan1 is a variable/ cantainer tahat can hold
		// the address of any single scanner object
		// the reference to any single scanner object
		// the pointer to any single scanner object
		
		Scanner scan1 = new Scanner(System.in) ;  
		Scanner scan2 = new Scanner(System.in) ;
		Scanner scan3 = scan2 ;
		System.out.println( scan1==scan2);  // yanlis
		System.out.println( scan2== scan3); //dogru
		
		String s1 = "literral" ;			// ikisi ayni olabilir ancak farkli 
		String s2 = new String("literral") ; //	konumda oldugu icin esit degiller
		String s3 = "literral" ;  
		
		// since "literral" already exists in the pool
		// it will not create new object and it will just
		// point to existing object
		
		
		System.out.println(s1.equals(s2));   // dogru
		System.out.println( s1==s2 );    // yanlis
		System.out.println( s1==s3);    // dogru
		
		
	}

}

//long x = 10 ; 
//long y = 10 ; 
//
//System.out.println( x==y  );
//
//// scan1 is a variable/ container that can hold 
//// the address of any single scanner object 
//// the reference to any single scanner object
//// the pointer to any single scanner object
//Scanner scan1 = new Scanner(System.in) ;
//Scanner scan2 = new Scanner(System.in) ;
//Scanner scan3 = scan2 ; 
//
//
////System.out.println( scan1 == scan2   );
////System.out.println( scan2 == scan3    );
//
//
//
//
//
//String s1 = "literral" ; 
//String s2 = new String("literral") ; 
//String s3 = "literral" ; 
//String s4 = "cat" ; 
//
//// since "literral" already exists in the pool
//// it will not create new obejct and it will just 
//// point to existing object 
//
//
//System.out.println( s1.equals(s2)  );
//System.out.println( s1==s2  );
//System.out.println( s1 == s3  );