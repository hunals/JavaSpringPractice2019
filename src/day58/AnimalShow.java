package day58;

public class AnimalShow {

	public static void main(String[] args) {


		// Dog is Dog	
	
		// reference type     actual object type
			Dog d 		=   	new Dog();
		
		// reference type     actual object type
			Animal a1 		=   new Dog();
				

		// Dog is IndoorPet	
		// reference type      actual object type
			IndoorPet d2 	=   new Dog();
			
		// Horse
		Horse h1 = new Horse();
		Animal h2 = new Horse();
		// Horse and IndoorPet has no relationship
//		IndoorPet h3 = new Horse();   birbirine baglantisi olmadigi icin calismaz
		
		// Animal is parent 
//		Dog d1 = new Animal(); bu sekilde yazilamaz sola buyuk kuma yazilmak zorunda
//		Animal a3 = new IndoorPet(); bu sekilde ikinci kisma interface class yazilamaz
		
		
		
		
		
		
	}

}
