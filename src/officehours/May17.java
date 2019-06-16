package officehours;

//public class May17 {
	class Data{ 
		
		   private int ssn = 123456;
		      // private: it cannot be access other class or objects
		   
		   // getter: it's a method that can read the private data in other objects  , a return method
		   		//  return-type of the getter has to be same with data type that we wanna return
		   public int getSSN() {
			   return ssn;   // the value that method returns has to be same data type with the return-type of the method
		   }
		   
		   
		  // setter: modifying the privtae data,or setting it's value.
		   			// return-type Has to be void,  parameter' data type has to be same with the instance varaible' data type
		   				// this:  instance
		   
		   public void setSSN( int ssn ) {
			     this.ssn = ssn;
		   	}
		   
		   
	}


	public class EncapsulationsReview {
		
		
		
		/*
		 	wncapsulation: hiding data ( initance variables)
		 				
		 
		 */
		
		static int y=10;   // instance variable
		
		public static void main(String[] args) {
			int num1=10;  // local variable: declared with in the block or methods.
						// can only be used with in the block or methods
//			System.out.println(y);
			
			Data obj = new Data();
				System.out.println( 	obj.getSSN() ); 
				
				int ssn= obj.getSSN();
				System.out.println(ssn);
				ssn =  654321;
				System.out.println( 	obj.getSSN() );   // getter is for Read ONLY
			
					obj.setSSN( 654321);
					System.out.println( 	obj.getSSN() ); 
			
		}
		
		
		public static void method2() {
			System.out.println(y);
			
		}
		

	}
}

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the minutes");
	int minutes = scan.nextInt();

	for (int i = minutes; 0 < i; i--) {
		for (int z = 60; z > 0; z--) {

			System.out.println((i - 1) + " minutes and " 
					+ z + " seconds left");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	System.out.println("time is up");
}


class EmployeeInfo{
	
	private String username ="123123";
	private boolean password = true;
	private float ssn =  new Float("10");  // it executes the valueOf 
			// float ssn  = Float.valueOf("10");   returns wrapper Float ,    unboxing
			// float ssn = Float.parseFloat( "10" );    returns primitive
	
	
	/*
	 access modifers: public, protected, default, private
	 specifiers:  static
	 
	 */
	
	
	public String getusername() {
		return username;
	}
	
	public float getSSN() {
		return ssn;
	}
	
	public void setSSN( float ssn) {
		this.ssn = ssn;
	}
	
	
	
}



public class EncapsulationPractices {
	
	
			static int z;


			public static void main(String[] args) {
				int y;
		//		System.out.println(y);   local variables has to be initilized before use it
				System.out.println(z);  //  instance variables does not have to be initilized
				
				
				
				EmployeeInfo obj = new EmployeeInfo();
						System.out.println( obj.getusername() );
						
						System.out.println( obj.getSSN() + 2  );
						
						obj.setSSN(98);
						System.out.println( obj.getSSN());
						
				EmployeeInfo obj2 = new EmployeeInfo();
					System.out.println( obj2.getSSN());
						
						
						
			}
}

package FridayClassDay02;

public class ConstructorReview {
	
	
	public ConstructorReview() {
		// this(10);
		 System.out.println("deafult constructor");
		 	
		 
		 }
	
	public ConstructorReview(int u) {
	//	ConstructorReview();      contsror methods cannot be called through method name
		this();    // this ( )    is used to call constructor methods  in current class 
		
	//	 this(9.8);   //  constructor method can only call one constructor method
		
	}
	
	public ConstructorReview(double u) {
		
		System.out.println("deafult constructor");
		// this();   constructor call needs to in the first line
		
	}
	
	
	/*
	 Every class MUST have constructor method, if no contructor is created, compiler will create default constructor 
	 (also  no-arg constructor).
	 
	  		custom method: 
	  		Access-modifier      specifier         return-type    methodname
	  			optional           optional          required        required
	  			
	  	
	  	Constructor:
	  	Access-modifier      MethodName       (   parameter   )
	  		optional          Required              optional
	  		
	 		Method name:  has to be same with class name
	 		Access-Modifier: supports all access modifiers
	 		Parameter: can be any class, object, primitives.  if there isn't any, the constructore will be deafult
	 		
	 		
	 		constructor cannot have: specifier,   return-type
	 					specifers: static
	 					return-type: void, primitives, wrapperclass, and objects
	 		
	 		
	 		
	 		
	 
	 */
	
	
	    public static  void  methodName ( ){   
	        	//  ConstructorReview( 10 );   contsructor method cannot be called in the methods
	    	System.out.println("hello");
	    	method2();
	    	
	    }
	    public static void method2() {
	    	
	    	
	    }
	

}
