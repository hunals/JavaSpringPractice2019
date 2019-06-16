package day43;

public class Vehicle {

	private String brand;
	private String model;
	private int speed;

	//sag tikla
	// source sec
	// olusturmak istedigin getter ve setter sec
	// sonra generate tikla 

	public void increaseSpeed(int increaseBy) {
		
		for (int i = 1; i <= increaseBy; i++) {
			speed++;
			System.out.print(speed +"->");
		}
		
		System.out.println();
	}

	public void decreaseSpeed (int decreaseBy) {
		for (int i = 1; i <= decreaseBy; i++) {
			speed--;
			System.out.print(speed +"->");
		}
		
		System.out.println();
		
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	
	
	public void setBrand(String newBrand) {
		//brand = newBrand;
		this.brand = newBrand;
	}
	
	public String getModel() {
		return model;
	}
	
	// this keyword can be used to address
	// the current object/instance being worked on
	public void setModel(String newModel) {
		//model = newModel;
		this.model = newModel ;
	}
	
	public int getSpeed() {
		return speed; //this.speed;
	}
	
	// this keyword can be used to address
		// the current object/instance being worked on
	public void setSpeed(int newSpeed) {
		//speed = newSpeed;
		this.speed = newSpeed;
	}
		
		public void stop() {
			
//			speed = 0;   		// direct way
			this.speed = 0 ;    // using this keyword
//			setSpeed(0);
//			this.setSpeed(0);
		}
   }

/*
package day43;

public class Vehicle {

  // <this> keyword can be used to address 
  // the current object|instance being worked on 

  
  private String make;
  private int speed;
  private String model;

  public void increaseSpeed(int increaseBy) {

    // speed = speed + increaseBy;
    for (int i = 1; i <= increaseBy; i++) {

      speed++ ;
      System.out.print(speed + "->");
    }

    System.out.println();

  }
  
  public void decreaseSpeed(int decreaseBy) {
    
    for (int i = 1; i <= decreaseBy; i++) {

      speed-- ;
      System.out.print(speed + "->");
    }

    System.out.println();

  }

  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    //model = model;
    this.model = model ; 
  }

  public String getMake() {
    return make;
  }

  public void setMake(String newMake) {
    this.make = newMake;
  }

  public int getSpeed() {
    return speed;  // this.speed; 
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  
  public void stop() {
    
//    speed = 0 ;      // direct way
    this.speed = 0 ; // using this keyword
//    setSpeed(0);
//    this.setSpeed(0);
    
    
  }












// 4 access modifier to define access level of fields of methods 
public      --- accessible anywhere
protected   -- stay tuned for later
default(no) -- package private 
private     -- in same class only 

Good Encapsulation practice 
making instance fields private 
and providing public getter/setter for the filed for access and modify 

getter -->> a method for getting the value of your field and the name is specifically recomended in getFieldName() format  and return the value of field

setter -->> a method for setting the value of your field
 and the name specically sugested to have 
setFieldName(dataType fieldName) and it will set 
new value for the field and it does not return value 



Create a class called Vehicle 
with few private fields model , make , speed 
create getters and setters for all those private fields 

create methods : 
	increaseSpeed : it accepts one parameter 
	increaseBy as int 
	and increase the speed to new speed. 
	if your current speed is 10 and you pass 5 to 
	this method , outcome should be  
	---> 10->11->12->13->14->15->

	decreaseSpeed  : 
	it accepts one parameter decreaseBy as int 
	and decrease the speed to new speed. 
	if your current speed is 10 and you pass 5 to
	 this method , outcome should be  
	 ---> 10->9->8->7->6->5->


*/