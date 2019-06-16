package day61;

import day58.*;


public class WarmUp {

	public static void main(String[] args) {
		
		int i = 10;
		double d = 3.14;
		int a = (int) d;
		System.out.println(a);
		
		Dog d1 = new Dog();
		// up casting
		Animal a1 = d1 ;  // up casting
		Dog d2 = (Dog) a1;  // down casting
		
		// Cat c = (Cat) d1 ;  // calismaz cunku d1 daha onca Dog olarak adlandirildi
	
//	Object o = new Object();
//	Dog d3 = (Dog) o ;  // Dog d3 = new Object() ;
	
		Object o1 = new Dog();
		Dog d4 = (Dog) o1;
		
		
		Shape s = new Square("asda", a);
		Square sq = (Square) s ;
	
		
	}
	
	// polymorphism
	/*
	 * Ability of object to take multiple form
	 * Ability of object to be referred by it's super type
	 * and take object specific action at run time
	 * 
	 * Animal a = new Dog();
	 * 		  a.makeNoise();
	 * 		  a = Cat();
	 * 		  a.makeNoise();
	 * 
	 * Animal makeNoise -->> Dog --> woof , cat miao
	 * 
	 * List<String> lst = new ArrayList<>() ;
	 * 
	 * 
	 * 	it provide flexibility
	 * 
	 * 	we can group objects together by it's general type
	 * 
	 * 	Animal[] animals = {new Dog() , new Cat() , new Horse()} ;
	 * 
	 * 	Method parameters :
	 * 	for example :
	 * 
	 *	public void AnimalNoiseTester(Animal anyAnimal) {
	 *  
	 *  }
	 *  
	 *  // what argument we can pass to above method
	 *  AnimalNoiseTester (new Dog() );
	 *  AnimalNoiseTester (new Cat() );
	 *
	 *	Return Type
	 *	public static Animal getMyAnimal(){
	 *		return -->> new Dog() or new Cat() or new Horse()
	 *	}
	 *
	 *	// each class in java implicitly extend Object if not already extending another class
	 *	// interface does not have this concept
	 *
	 *	WebDriver driver = new ChromDriver() ;
	 *
	 *	// What decide what member can be accesible using the reference variable
	 *			---ONLY REFERENCE TYPE
	 *
	 *		Animal a = new Dog();
	 *		a can access only the members that visible to the Animal
	 *		a.makeNoise() --->> woof
	 *
	 *		// What if we really want to access anything that only exists in Sub class
	 *
	 *		Dog d = (Dog) a ;
	 *		d.dogStuff();	
	 *			
	 * 
	 * */
}
