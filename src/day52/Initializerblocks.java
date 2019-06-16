package day52;

public class Initializerblocks {
	
	
	/*
	 instance block: initializing variables   ( Belongs to objects)
	 
	 		execution depends on the creation of the object ( just like constructor)
	 		executed before the constructor
	 		
	 
	 static block: initializing class variables	   ( belongs to class)
	 			executes as soon as class is loaded
	 
	 
	 */
	{
		System.out.println("Instance block 1");
		
	}
	
	{
		System.out.println("Instance block 2");
		
	}

	static {
		System.out.println("static block 2");
	}
	
	
	static{
		System.out.println("Static block 1");
	}
	
	
	
	
	public Initializerblocks() {
		System.out.println("Constructor");
	}
	
	 
	
	public static void main(String[] args) {
		Initializerblocks obj = new Initializerblocks();
		
		Initializerblocks obj2 = new Initializerblocks();
		
		
		
		
	}
	
	
	
	

}