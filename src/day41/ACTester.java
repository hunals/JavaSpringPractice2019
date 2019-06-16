package day41;

public class ACTester {

	public static void main(String[] args) {
		    
	    AirConditioner ac = new AirConditioner(); 
	    ac.brand= "Samsung" ; 
	        ac.currentTemp=79.7f;
	        ac.isOn=true;
	        
	        ac.displayBrand();;
	        ac.displayAllInfo();
	        
	        ac.turnOff();
	        ac.turnOn();
	        ac.showCurrentTemp();
	        
	        ac.increaseTemp(10);
	        System.out.println( ac.currentTemp );
	 
	        ac.decreaseTemp(20);
	        ac.showCurrentTemp();
	        
	        ac.setTemperature(80f);
	        ac.showCurrentTemp();
		 
	}

}
