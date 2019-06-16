package day53;

public class TropicalFruit extends Fruit{

	public static void main(String[] args) {
		
		generateJuice();
		Fruit.generateJuice();
		TropicalFruit.generateJuice();
		
	
	}
	// hiding static methods
	public static void generateJuice() {
		System.out.println("generate TropicalFruit Juice ");
	}
	
}



///------------------different class------


class Fruit{
	
	public static void generateJuice() {
		
		System.out.println("generate general Juice ");
	}
}

/*
package day53;

public class TropicalFruit extends Fruit{

  
  public static void main(String[] args) {
    
    generateJuice();
    Fruit.generateJuice();
    TropicalFruit.generateJuice();
  }
  // hiding static methods
  public static void generateJuice() {
    System.out.println("generate TropicalFruit Juice ");  
  }
  
}




/// -----------------------different class --------



class Fruit{
  
  public static void generateJuice() {
    System.out.println("generate general Juice ");  
  }
}



*/