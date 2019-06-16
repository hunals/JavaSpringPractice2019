package day36;

public class Ders1 {

	public static void main(String[] args) {
		// METHOD OVERLOADING
		
		/*
		 * Same method name + different parameter list
		 * 
		 * DOES RETURN TYPE MATTER :
		 * 
		 * NO !! it's not part of method signature
		 * 			method name + parameter list	
		 * 
		 * */

		
		int i = 10 ;
		
		// bolean , char , byte, short, int, long
		// float, double
		
		/*
		 * Wrapper class-->
		 * specifically designed to
		 * store primitive value as object
		 * 
		 * 
		 * */
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false") ;
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("true");
		
		System.out.println(  b );
		System.out.println(  b1 );
		System.out.println(  b2 );
		System.out.println(  b3 );
		
//		
//		Integer i1 = new Integer(123);
//		Integer i2 = new Integer("123");
//		Integer i3 = Integer.valueOf(123);
//		Integer i4 = Integer.valueOf("123");
//		
//		System.out.println( "equal? " +  i1.equals(123) );
//		System.out.println(  i2 );
//		System.out.println(  i3 );
//		System.out.println(  i4 );
		
		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');
		
		System.out.println( c1 );
		System.out.println( c2.toString() );
		
		

		// auto unboxing
		int i1 = new Integer("12"); 
		
		// auto boxing
		Integer i2 = 12; 			
		
		//Integer i1 is auto unboxed to int 12
		int i3 = i1;
		
		//==============================================
		
		//double 3.14 is auto boxed d1
		Double d1 =3.14;
		
		//Double 12.5 is auto unboxed to double
		double d2 = new Double(3.143455);
		
		//d1 with reference type Double auto-unboxed to double
		double d3 = d1;
		
		
	}

}

/*
 
 package day36;

public class WrapperClasses {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int i = 10 ; 
    
    // boolean , char , byte, short , int , long 
    // float , double
    
    /*
     * Wrapper class --> 
     * specifically designed to 
     * store primitive value as object 
     * 
     * *
    Boolean b =  new Boolean(true) ; 
    Boolean b1 = new Boolean("false"); 
    Boolean b2 = Boolean.valueOf(true); 
    Boolean b3 = Boolean.valueOf("true"); 
    
    System.out.println(  b );
    System.out.println(  b1 );
    System.out.println(  b2 );
    System.out.println(  b3 );
    
    Integer i1 = new Integer(123); 
    Integer i2 = new Integer("123"); 
    Integer i3 = Integer.valueOf(123); 
    Integer i4 = Integer.valueOf("123"); 

    System.out.println("equal? "+  i1.equals(123) );
    System.out.println(  i2 );
    System.out.println(  i3 );
    System.out.println(  i4 );
 
 */
