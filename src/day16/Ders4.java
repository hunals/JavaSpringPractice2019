package day16;

public class Ders4 {

	public static void main(String[] args) {
		
		String str = "   GOO    JAVA SPARTAN    " ;
		System.out.println(str);
		
		//System.out.println(str.trim());
		//get JAVA SPARTAN from above String
		

        //System.out.println(str.trim() );
        
        // get  JAVA SPARTAN from above String 
        int indexO = str.lastIndexOf("O"); 
        
        String part = str.substring(indexO + 1) ; 
        System.out.println( part.trim()      );
        
        
        System.out.println(   str.substring(indexO + 1)    );
        System.out.println(   str.substring(indexO + 1).trim()      );
        //str.length().trim() ;  BAD
        
	}

}
