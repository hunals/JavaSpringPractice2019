package day48;

public class Horse extends Animal {

	/*
	 String color;
	boolean wild;
	int legCount;
	 * */
	int shoesCount;
	int horsePower;
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.wild = false;
		
//		System.out.println(a1.breed);
//		System.out.println(a1.legCount);
//		System.out.println(a1.color);
//		System.out.println(a1.wild);
//		System.out.println(a1.horsePower); // bu komut calismaz cunku animal
											// class da horsePOWER TANIMLI DEGIL
		
		Horse h1 = new Horse();
		//h1.breed = "spartan";
		h1.wild = false;
		h1.horsePower = 600;
		//System.out.println(h1.breed);
		System.out.println(h1.horsePower);
		
	}
	
}
