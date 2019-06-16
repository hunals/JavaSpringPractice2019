package day57;

public class Burger implements Edible {

	String name ;
	int size ;
	
	public Burger(String name,  int size) {
		this.name=name;
		this.size=size;
	}
	

	@Override
	public String toString() {
		return "Burger [name is " + name + ", size is " + size + "]";
	}
	
	
	@Override
	public void eat() {
		
		System.out.println("Spartan Eating burger");
	}
	
}

/*
package day57;

public class Burger implements Edible{
  
  String name;
    int size;
  
  public Burger(String name, int size) {
    this.name = name;
    this.size = size;
  }
  @Override
  public String toString() {
    return "Burger [name=" + name + ", size=" + size + "]";
  }
  @Override
  public void eat() {
    System.out.println("Spartan Eating burger");
  }

  
}










/// ---- TASK 1 

Create two interfaces called 

  Edible 	
		with single abstract method  void eat(); 
, Drinkable
		with single abstract method  void drink(); 
		
Drinkable extends Edible interface 

create a class called Burger  and it implements Edible interface 
it has 2 instance fields  name and size 
it has constructors to set the value 
and it has toString method 

create another class called IceCoffee  
	it implements Drinkable interface
	it has 1 instance field  -- size 
	it has constructors to set the value 
	and it has toString method 

fix any error might come up 
*/