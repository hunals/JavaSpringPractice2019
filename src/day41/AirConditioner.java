package day41;


public class AirConditioner {


	  String brand;
	  float currentTemp;
	  boolean isOn;
	  
	  public void displayBrand() {
	    System.out.println("the brand is " + brand);
	  }
	  
	  public void showCurrentTemp() {
	    System.out.println("currentTemp :  " + currentTemp);
	  }
	  
	  public void displayAllInfo() {
	    System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
	  }
	  
	  public void turnOn() {
	    
	    System.out.println("current AC status: " + isOn);
	    
	    if(isOn == false) {
	      isOn = true ; 
	    }else {
	      System.out.println("It is already on !!!");
	    }
	    
	  }
	  
	  
	  public void turnOff() {
	    
	    if(isOn) {
	      isOn = false;
	      System.out.println("It has been turned off");
	    }else {
	      System.out.println("IT IS ALREADY OFF!@");
	    }
	    
	  }
	  
	  public void increaseTemp(int increaseBy) {
	    
	    //currentTemp = currentTemp + increaseBy; 
	    currentTemp += increaseBy;
	    System.out.println("New temp after increase: " + currentTemp );
	    
	  }
	  
	  
	  public void decreaseTemp(int decreaseBy) {
	    
	    //currentTemp = currentTemp - decreaseBy; 
	    currentTemp -= decreaseBy;
	    // an instance method can be called inside 
	    // another instance method directly 
	    // just like an instance field 
	    // can be accessed directly inside any instance method 
	    showCurrentTemp();
	    
	  }
	  
	  public void setTemperature(float targetTempurature) {
	    currentTemp = targetTempurature ; 
	    // calling instance method of same class directly 
	    // in another instance method 
	    showCurrentTemp();
	  }
	  
}
	
	
/*
 * WARM UP 
  Create a class called AirContitioner 
  Add instance fields 
    brand as String 
    currentTemp as float  
    isOn as boolean  

  Add below behaviors 
    displayTheBrand() ;
      accept no paramter and print out the brand  
    showCurrentTemp
      accept no paramter and
      simply display current temp on console 

    displayAllInfo 
      accept no paramter and display all AC info 

    turnOn 
      accept no parameter 
      and set isOn value to true if it's not already true

    turnOff 
      accept no parameter 
      and set isOn value to false if it's not already true
    
    increaseTemp
      it accepts one parameter int 
      and increase the value by the amount passed

    decreaseTemp
      it accepts one parameter int 
      and increase the value by the amount passed
    
    setTemperature
      it acceps one paramter int 
      and set the value to that paramter passed 

  Create a class called ACTester 
    Create 3 object set their field value 
    then call the methods 



OBJECT OREINTED PROGRAMMING 
	
	4 OBJECT ORIENTED PRINCIPLES : 
		A PIE 

		A -- ABSTRACTION 
		P -- POLYMORPHISM
		I -- INHERITANCE
		E -- ENCAPSULATION 


ACCESS MODIFIER 
	private --> 
		ANY FILED/METHOD WITH PRIVATE ACCESS MODIFER
		WILL BE ONLY ACCESSIBLE WITHIN SAME CLASS 
	default -->> 
		ANY FILED/METHOD WITH default(NO) ACCESS MODIFER
		WILL BE ONLY ACCESSIBLE WITHIN SAME PACKAGE
	public 
		accessible anywhere


 * */
