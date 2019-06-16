package day58;

public class AnimalShow2 {

	public static void main(String[] args) {
		
		// create Animal array with capacity 3
		
		// create 3 objects Dog , Cat , Horse
		// use reference of Animal for all of them
		
		// then store it to Animal Array
		
//		Animal[] arr=new Animal[] {new Cat(),new Horse(),new Dog()};

		
		Animal[] animal = new Animal[3];
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Horse();
		
		animal[0] = a1;
		animal[1] = a2;
		animal[2] = a3;
		
		for (Animal each : animal) {
			each.makeNoise();
		}
		
	}

}
