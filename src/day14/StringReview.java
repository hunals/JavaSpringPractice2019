package day14;

public class StringReview {

	public static void main(String[] args) {
		
		/*
		 * Sring class method 
		 * 	
		 * 	1, length() 
		 *  2, 
		 * 
		 * 
		 * */
		String name = "Mamatjan" ;  
//		System.out.println( name );
//		System.out.println( "Mamatjan" );
//		
//								// 8 
//		System.out.println( name.length());
//		
//		System.out.println( name.toUpperCase() );
//		
//		System.out.println( name.toLowerCase() );
//		
//		char secondChar = name.charAt(1) ; 
//		System.out.println(  name.charAt(1) );		
//		System.out.println(secondChar);
//
		int lastIndex	= name.length()-1 ; 
		System.out.println(   name.charAt(lastIndex)    );
		
		/*
		 *  length()  taking no external data 
		 *  		and returning a number 
		 *  
		 *  first character index is alwasys 0 
		 *  last character index is always one less than 
		 *  	actual count of character 
		 *  int lastIndex	= str.length()-1
		 *  
		 *  
		 *  charAt(1)  taking 1 extenal data / argument
		 *  	 and returning a character 
		 *  
		 *  str.charAt(lastIndex) ; 
		 *  
		 * */
		// equality 
		
//		System.out.println(  name.equals("Mamatjan")   );
//		System.out.println(  name.equalsIgnoreCase("Mamatjan")   );
		
		// conatains 
		
//		String name = "Mamatjan" ; 
		boolean containsOrNot = name.contains("aam") ; 
		System.out.println(containsOrNot);
		
		// indexOf 
		// return the index of first occurance of the string given 
		// if it does not exist it will return - 1
		System.out.println( name.indexOf("am")   );
		System.out.println( name.indexOf("t")   );
		System.out.println( name.indexOf("samatjan")   );
		System.out.println( name.indexOf("Mamatjan")   );
		System.out.println( name.indexOf("mamatjan")   );
		
		String uName = name.toUpperCase() ; 
		System.out.println( uName.indexOf("MAMATJAN")   );
		
		// optional
		System.out.println( name.toUpperCase().indexOf("MA") )  ; 
		
		//System.out.println( name.lenth().indexOf("MA") )  ; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}