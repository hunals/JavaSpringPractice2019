package day50;

public class Vehicle {

	private String brand;
	private String model;
	protected int year;
	
	
	
	
	
	public Vehicle(String brand, String model, int year) {

		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	// add constructor to set all the private fields
	// provide getters and setters for only private fields
	
	
}

	// create a package called day50.difPackage
	
	// Create Airplane class , sub class of Vehicle
	// add private instance field wingCount int and encapsulate this field
	// add 4 args constructor to set all the fields values
	
	// create a toString method to print out all the field
	
	// create main methods and create few objects and print it out
	
	
/*
 package day50;

// this is super class
public class Vehicle {

  private String brand; 
  private String model; 
  protected int year;
  
  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  } 
  
  
  
  /// add constructors to set all the fields values 
  /// provide getters and setters for only private fields 
  

}
  // create a package called day50.difPackage

  //Create Airplane class , sub class of Vehicle 
  // add private instance field wingCount int and encapsulate this field
  // Add 4 args constructors to set all the fields values 
  
  // create a toString method to print out all the field 

  // create main methods and create few objects and print it out 
 
 	
 	
 	
 */
	
