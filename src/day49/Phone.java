package day49;

public class Phone extends Device{
	// int serial;
	String brand;
	int screenSize;
	




	public Phone() {
		
		//super();
		// Device(); BAD
		//super(100);
		System.out.println("Phone COnstructor");
	}
	

	// what's the difference between super and this
	/*
	 * this(args...) is used to call constructor of same class
	 * in another constructor in same class
	 * 
	 * super(args...) is used to call super class's
	 * constructor
	 * 
	 * Super(arg...) rules
	 * 	it has to be the first statement
	 * 	it can be only be used on time per constructor
	 * 	super() and this() can not be mixed together
	 * 
	 * 
 	 * */
	
	public Phone(String brand, int screenSize, int serialNum) {
//		super();
		super(serialNum);
		this.brand = brand;
		this.screenSize = screenSize;
		//this.serialNum = serialNum;
	}
	
	
	public static void main(String[] args) {
		
		//Phone p = new Phone();
		Phone p1 = new Phone("iphone", 7, 123);
		
		System.out.println(p1.brand);
		System.out.println(p1.screenSize);
		System.out.println(p1.serialNum);
		
		
		
		
	}
}
