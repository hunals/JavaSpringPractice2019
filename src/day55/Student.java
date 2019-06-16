package day55;

// abstract class are not meant to be instantiated --- NO OBJECT !!!
// abstract class are meant to be super class
// to provide a general idea, without providing implementation details
// using abstract method

// OTHER THEN ABOVE
// YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 

public abstract class Student {

	int id;
	String name;
	public static final String SCHOOL = "Cybertek";
	

	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void study() {
		System.out.println("Study hard to get the job");
	}

	public static void showSchool() {
		System.out.println(SCHOOL);
	}
	
	public abstract void attendClass() ;
	
//	public void attendClass() {
//		
//		System.out.println("IMPLEMENT IN SUB CLASSES");
//		
//	}
	
	
	
	
/*	
	package day55; 


//abstract class are not meant to be instantiated --NO OBEJCT !!!!
//abstract class are meant to be a super class 
//  to provide a general idea, without providing implemetation details 
//   using abstract method 

// OTHER THAN ABOVE 
// YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 

public abstract class Student {

  // abstract class can have both instance/ static fields 
  int id; 
  String name; 
  public static final String SCHOOL = "Cybertek"; 

  // we can have constructor in abstract class 
  // the sole purpose is to provide reusable code 
  // for sub class constructor 
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  // we can have non-abstract instance method 
  // sub class have option to directly use it 
  // or it has option to override the method 
  public void study() {
    System.out.println("Study hard to get the job");
  }
  
  // can have static method 
  // sub class have option to use as is 
  // or hide it with same method 
  
  // static method can not be abstract AT ALL !!!!  
  public static void showSchool() {
    System.out.println(SCHOOL);
  }
  
  
  // abstract method can be defined only in abstract class 
  // it must have keyword abstract 
  // and it must not have body 
  // it ends with < ; > 
  public abstract void attendClass(); 
  
//  public void attendClass() {
//    
//    System.out.println("IMPLEMENT IN SUB CLASSES");
//    
//  }

}

	
	
	*/

	
}
/*
Difference between Abstraction and Encapsulation?
• Abstraction lets you focus on what the object 
	does instead of how it does it.
o Encapsulation means hiding the internal details 
	of how the object does something.
• Abstraction is used for hiding the unwanted data 
	and giving relevant data.
o Encapsulation means hiding the code and data, 
	and to protect the data from outside.
• Abstraction can achieved by using Abstract class 
	and Interfaces
o Encapsulation can achieved by using “private” 
	keyword.

*/