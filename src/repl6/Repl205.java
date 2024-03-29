package repl6;

public class Repl205 {
	public class GasTank {
		  //WRITE YOUR CODE HERE
		  //by default 0.0;
		  //instance variables must be private
		  //it will work without private
		  //but, it's bad implementation of OOP (int this case encapsulation). 
		  //encapsulation encourage us to make instance variables private
		  //static variables are mostly public.
		  private double amount;
		  private double capacity;
		  
		  //A constructor that accepts a parameter of type double. 
		  //The value of the parameter is used 
		  //to initialize the value of capacity.
		  public GasTank(double capacity){
		    this.capacity=capacity;
		  }
		  
		  //A method named addGas that accepts a parameter of type double.
		  public void addGas(double gas){
		    if((gas+amount)>capacity){
		      //However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
		      amount = capacity;
		    }else{
		      //The value of the amount instance variable is increased by the value of the parameter.
		      amount+=gas;
		    }
		  }
		  
		  public void useGas(double gas){
		    //the amount instance variable 
		    //is decreased by the value of the parameter. 
		    this.amount-=gas;
		    //However, if the value of amount is decreased below 0, 
		    //amount is set to 0.
		    if(amount<0){
		      amount=0;
		    }
		  }
		  
		  public boolean isEmpty(){
		    //true if the value of amount is less than 0.1, and false otherwise.
		    return this.amount<0.1;
		  }
		  
		  public boolean isFull(){
		    //true if the value of amount is greater than capacity-0.1, 
		    //and false otherwise
		    return amount > (capacity-0.1);
		  }
		  
		  public double getGasLevel(){
		    return this.amount;
		  }
		  
		  // fillUp increases amount to capacity and 
		  //returns the difference between the value of capacity 
		  //and the original value of amount
		  public double fillUp(){
		    // difference between the value of capacity 
		    double difference = capacity - amount;
		    // fillUp increases amount to capacity and 
		    this.amount = this.capacity;
		    return difference;
		  }
		}
	
/*
	
Write a class named GasTank containing:
An instance variable named amount of type double, initialized to 0.
An instance variable named capacity of type double.
A constructor that accepts a parameter of type double. The value 
of the parameter is used to initialize the value of capacity.
A method named addGas that accepts a parameter of type double. 
The value of the amount instance variable is increased by the 
value of the parameter. However, if the value of amount is 
increased beyond the value of capacity, amount is set to capacity.
A method named useGas that accepts a parameter of type double. 
The value of the amount instance variable is decreased by the 
value of the parameter. However, if the value of amount is 
decreased below 0, amount is set to 0.
A method named isEmpty that accepts no parameters. isEmpty 
returns a boolean value: true if the value of amount is less 
than 0.1, and false otherwise.
A method named isFull that accepts no parameters. isFull 
returns a boolean value: true if the value of amount is 
greater than capacity-0.1, and false otherwise.
A method named getGasLevel that accepts no parameters. 
getGasLevel returns the value of the amount instance variable.
A method named fillUp that accepts no parameters. fillUp 
increases amount to capacity and returns the difference 
between the value of capacity and the original value of 
amount (that is, the amount of gas that is needed to 
fill the tank to capacity).	
	
	
*/