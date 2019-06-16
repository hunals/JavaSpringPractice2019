package day24;

public class Ders2 {

	public static void main(String[] args) {
		
//		String names [] = { "Ahmet", "Batul", "Kubra", "Hakan", "Derya"} ;
//		
//		System.out.println(names[2]);
//		System.out.println(names[names.length-1]);
//		System.out.println(names[4]);
//		
//		names[2] = "Gulay" ;
//		System.out.println(names[2]);
		
		
//		create an char array that contains your name characters
//		create 3 array using the 3 different ways that you learned
//		print out each items of your nameArray
		
//		char name [] = {'h', 'a', 'k', 'a', 'n'} ;
//	
//		System.out.println(name);
//		
		char[] names = new char[5] ;
//		names[0] ='H' ;
//		names[1] ='A' ;
//		names[2] ='K' ;
//		names[3] ='A' ;
//		names[4] ='N' ;
//		
//		System.out.print(names[0 ]);
//		System.out.print(names[1] );
//		System.out.print(names[2] );
//		System.out.print(names[3] );
//		System.out.print(names[4] );
		
//		System.out.println();
//		
//		for (int i = 0; i <5; i++) {
//			System.out.print(names[i]);
//		}
		System.out.println();
		
		char [] name2 =new char[] {'h', 'a', 'k', 'a', 'n'} ;
		
		for (int i = 0; i < name2.length; i++) {
			System.out.print(name2[i]);
		}
		
		
		char [] name3 = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'} ;
//		int count = name3.length ;
//		
//		System.out.println("item in last index : " + name3[count-1]);
//		
//		int midIndex = count/2 ;
//		System.out.println("item in mid index : " + name3[midIndex]);
//		
//		System.out.print( name3[7] + " ");
//		System.out.print( name3[6] + " ");
//		System.out.print( name3[5] + " ");
//		System.out.print( name3[4] + " ");
//		System.out.print( name3[3] + " ");
//		System.out.print( name3[2] + " ");
//		System.out.print( name3[1] + " ");
//		System.out.print( name3[0] + " ");
//		
		System.out.println();
		
		for (int i = 7; i >= 0; i--) {
			System.out.print(name3[i] + " ");
		}
	}

}

/*
   String names[] = {"Ahmet", "Batul", "Jovidon", "Emine", "Munire"} ;  
    
    System.out.println( names[2] );
    
    System.out.println( names[names.length-1]    );
    System.out.println( names[4]    );
    
    names[2] = "Mubarek" ;
    System.out.println(names[2]);
    
    
    
    
    
       // create an char array that contains your name characters
    // create 3 array using the 3 different ways that you learned 
    
    // print out each items of your nameArray 
    
    char[] myNameChar = new char[6];
    myNameChar[0] = 'M';
    myNameChar[1] = 'E';
    myNameChar[2] = 'H';
    myNameChar[3] = 'M';
    myNameChar[4] = 'E';
    myNameChar[5] = 'T';
    
     System.out.print( myNameChar[0] );
     System.out.print( myNameChar[1]);
     System.out.print( myNameChar[2]);
     System.out.print( myNameChar[3]);
     System.out.print( myNameChar[4]);
     System.out.print( myNameChar[5]) ; 
     
     System.out.println( );
     for (int i = 0; i < 6; i++) {
    System.out.print( myNameChar[i]  );
     }
     System.out.println( );
     
     char[] myNameChar2 = new char[] {'G', 'u', 'l','j','a','h','a','n'} ; 
     
     //for (int i = 0; i <= myNameChar2.length-1 ; i++) {
     for (int i = 0; i < myNameChar2.length ; i++) {
      System.out.print( myNameChar2[i] + " " );
     }
     System.out.println();
                 // 0    1    2    3    4    5    6    7 
     char[] myNameChar3 = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
     
     /// how do we get last items 
     int count = myNameChar3.length ; 
     
     System.out.println( "item in last index : " +  myNameChar3[count-1] );
     // how do we get the one in the middle 
     
     int midIndex = count/2 ; 
     
     System.out.println( "item in mid index : " +  myNameChar3[midIndex] );
     
    
     System.out.print( myNameChar3[7] + " " );
     System.out.print( myNameChar3[6] + " " );
     System.out.print( myNameChar3[5] + " " );
     System.out.print( myNameChar3[4] + " " );
     System.out.print( myNameChar3[3] + " " );
     System.out.print( myNameChar3[2] + " " );
     System.out.print( myNameChar3[1] + " " );
     System.out.print( myNameChar3[0] + " " );
     
     System.out.println();
     
     for(int i=7 ; i>=0 ; i--) {
       System.out.print( myNameChar3[i] + " "   );
     }

*/