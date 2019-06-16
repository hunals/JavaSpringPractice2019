package day58;

public class ShapeTest {

  public static void main(String[] args) {
    
    // Given the classes we already created in day 58
    
    // Just like Create a reference variable called myIndoorPet as type IndoorPet
      // IndoorPet myIndoorPet = any indoorpet Object
    
    // Create a reference variable called myDrawable as type Drawable
    
	  Drawable d1 = new Triangle("red", 12, 10);
	  			d1.draw();
	  			d1.drawLine(2);
	  			
	  			d1 = new Square("Blue", 4);
	  			d1.draw();
	  			d1.drawLine(2);
	  
	  System.out.println("----------------------------");
	  			Drawable d0 = new Square("red",5);
	  			Drawable d2 = new Triangle("red",5,5);
	  			Drawable d3 = new Triangle("red",5,5);
	  			Drawable d4 = new Square("Green",5);
	  			
	  Drawable[] allDrawables = {d0,d1,d2,d3, d4} ; 
	  	      
	  	      for (Drawable each : allDrawables) {
	  	        each.draw();
	  	      }
	  	      
// ONLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS USING THAT VARIABLE !!! 	  			
	  			
	  			
	  			
	  			
	  		//d1 = new Triangle("red", 12, 10);
	  			
	  			
	  			
	  
    // and try to assign all the objects you can assign 
    
    // and see what you can access 
    // and call all the methods you can call 
    
    // Create a Drawable array 
    // add few items 
    // and draw all of them 
    
    
    // Also create a shape reference variable 
    // and assign few different objects and call their methods
    
    
    //Optionally 

  }
  
  public static void DrawMyDrawableStuffs(Drawable anythingDrawable) {
    // implement this method and call it in main method 
    
  }
  
}
