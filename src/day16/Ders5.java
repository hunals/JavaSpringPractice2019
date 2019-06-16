package day16;

public class Ders5 {

	public static void main(String[] args) {
		

        String str = "Date is 03_25_2019" ;
        
        str = str.replace('_','-') ; 
        
        System.out.println(  str   ); 
        
        //Date is 03-25-2019  --> Date will be 03-25-2019
        
        str = str.replace("is","will be" ) ; 
        System.out.println(  str );
        
        // Date will be 03-25-2019  --->>>03-25-2019
        System.out.println(  str.replace("Date will be ", "")    );
        
        
        String str2 = "AAAAABBBBBBCCCCCCC" ; 
        System.out.println(     str2.replace('A', 'Z')      );
        
		
		String s1 = "abc" ;
		String s2 = new String("abc") ;
		
		//String s3 = s1 ;
		String s3 = "abc" ;
		System.out.println( s1 == s3 );
		
		System.out.println( s1 == s2 );
		
	}

}
