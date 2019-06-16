package day47;

public class Course {

	public static String school;
	public static boolean isRamadan ;
	
	public Course() {
		System.out.println("Constructor");
	}
	//static initilizer block 
	// IT's used to initilize the static fields value before
	// the type's first usage 
	// and it will run only one time right before it's usage
	
	// if you have more than one block
	// it will run in the order it appears
	
	
	static {
		
		school= "Cybertek School";
		System.out.println("WELCOME TO OUR SCHOOL " + school );
		System.out.println("LET THE JOURNEY BEGIN");
	
	}
	
	
	static {
		
		isRamadan = true;
		if(isRamadan) {
			System.out.println("use ramadan schedule");
		}else {
			System.out.println("USE normal schedule");
			
		}
		
	}
	

}

/*
package day47;

public class Course {
  
  
  public static String school ; 
  public static boolean isRamadan; 
  
  
  // static initilizer block 
  // iT'S used to initilize the static fields value before 
  // the type's first usage 
  // and it will run only one time 
  
  
  
  static {
    school = "Cybertek School" ; 
    isRamadan = true ; 
    
    System.out.println("WELCOME TO OUR SCHOOL : " + school );
    System.out.println("LET THE JOURNEY BEGIN");
    
    if(isRamadan) {
      System.out.println("Use ramadan schedule");
    }else {
      System.out.println("USE normal schedule");
    }
  
  
  }

}



*/
