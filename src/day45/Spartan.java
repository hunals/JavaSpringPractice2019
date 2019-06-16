package day45;

// calling a Constructor
/*
 * Where : when object is being created
 * 		a constructer can only be called inside another constructor of same class
 * 		RULE : 
 * 			this(arg...) use this keyword with parantethese and pass arguments if needed
 * 			1. it has to be in first statement of constructor body
 * 			2. ONLY ONE call(of any constructor) is allowed inside one constructor
 * 			3. recursive constructor call is not allowed --- COMPILER ERROR
 * 		
 * 	public Caller() {
		this(100); bunu yazdigimizda calismaz hata verir
		System.out.println("calling no arg");
	}
	
	public Caller(int x) {
		
		this();
		System.out.println("calling 1 arg");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	METHOD VS CONSTRUCTOR
	
	METHOD -- has return type can have any name and can take certain action
				and can be called upon request
	Constructor -- has NO return type has same name as class name
				will be called each time  
 * 
 * 
 * */




import java.util.Arrays;

public class Spartan {

  String name; 
  int studyHour; 
  int horsePower; 
  boolean tired; 
  String[] certificates; 
  
  // this no arg constructor should set default value for name, studyHour , horsePower
  public Spartan() {

    this("No Name", 5); 
    
    System.out.println("no arg");
    
//    this.name = "No Name";
//    this.studyHour = 5; 

    this.horsePower = 320; 
    //this.certificates = new String[] {"OCA","OCP"};     
  }
  
  
  public Spartan(String name, int studyHour) {
    this.name = name; 
    this.studyHour = studyHour; 
  }
  
  // CREATE A CONSTRUCTOR THAT TAKE ONE ARG boolean tired
  // inside this constructor 
  //  call the constructor that that take 5 args
    // to set all your default value 
  
  
  public Spartan(boolean tired) {
	  
	  this("Hakan", 12, 700, tired, null);
	  
  }
  
  
  public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {

    this(name,studyHour); 
//    this.name = name;
//    this.studyHour = studyHour;
    this.horsePower = horsePower;
    this.tired = tired;
    this.certificates = certificates;
  }


  // whenever an object is being printed directly 
  // compiler will call this method to get String representation
  public String toString() {
    return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
        + ", certificates=" + Arrays.toString(certificates) + "]";
  }  
  
}

