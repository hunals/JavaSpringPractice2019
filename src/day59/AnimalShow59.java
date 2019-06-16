package day59;

import day58.*;

public class AnimalShow59 {

	public static void main(String[] args) {
		
	
		// Cat is a Cat
		Cat c1 = new Cat();
		// Cat is a Animal
		Animal a1 = new Cat();
		// Cat is a IndoorPet
		IndoorPet i1 = new Cat();
		// Animal is a Cat---->> NOT VALID
//		Cat a2 = new Animal(); // bu sekilde yazilamaz (her animal bir cat denilemez)
		// Cat IS-A Object
		Object o1 = new Cat();
		
		
		
	}
}
