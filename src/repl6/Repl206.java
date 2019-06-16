package repl6;

public class Repl206 extends Value{
	public static void main(String[] args) {
	    System.out.println("Hello world!");
	  }
	}

public class Value {
	  //WRITE YOUR CODE HERE
	  private int val;
	  private boolean modified;
	  
	  
	  
	  public Value(int val) {
		  this.val = val;
	  }
	  
	  public Value() {
		  
	  }
	  
	  public void setValue(int val) {
		  this.val = val;
		  modified = true;
	  }
	  
	  public boolean wasModified() {
//		  if(modified == true) {
//			  return true;
//		  }else {
			  return modified;
//		  }
	  }
	  
	  public int getValue() {
//		  if(val != 0) {
			  return val;
//		  }else {
//			  return 0;
//		  }
	  }
	}





/*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter, 
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: 
if setVal has ever been called, it getVal returns the last 
value passed to setVal. Otherwise if the "single int parameter" 
constructor was used to create the object, getVal returns the value 
passed to that  constructor. Otherwise getVal returns 0. 


*/