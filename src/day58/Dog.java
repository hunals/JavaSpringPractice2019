package day58;

public class Dog extends Animal implements IndoorPet{

	public String legsCount = "dog leg" ; 
	@Override
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}
}
