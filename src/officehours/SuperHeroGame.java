package officehours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SuperHeroGame {
	public static void main(String[] args) {
		Superhero batman = new Superhero();
		Superhero superman = new Superhero();
		Superhero wonderwoman = new Superhero();
		Superhero flash = new Superhero();
		Superhero aquaman = new Superhero();
		Superhero aladdin = new Superhero();
		Superhero cyborg = new Superhero();
		Superhero captainamerica = new Superhero();
		Superhero sadirpalwan = new Superhero();

		batman.setName("Batman");
		superman.setName("Superman");
		wonderwoman.setName("Wonder Woman");
		flash.setName("Flash");
		aquaman.setName("Aquaman");
		aladdin.setName("Aladdin");
		cyborg.setName("Cyborg");
		captainamerica.setName("Captain America");
		sadirpalwan.setName("Sadir Palwan");
		// we create list of superheroes
		ArrayList<Superhero> listofHeroes = new ArrayList<Superhero>();
		// we added all superheroes
		// Arrays.asList() method convert array into an arraylist
		listofHeroes.addAll(Arrays.asList(batman, superman, wonderwoman, flash, aquaman, aladdin, cyborg,
				captainamerica, sadirpalwan));
//		for (Superhero hero : listofHeroes) {
//			System.out.println(hero.getName());
//		}
		String inputFromUser = "";
		Superhero randomHero = new Superhero();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		do {
			// if superhero name was not set, select random name from the collection
			if (randomHero.getName() == null) {
				randomHero = listofHeroes.get(random.nextInt(listofHeroes.size() - 1));
			}
			// to ask user to provide superhero name
			System.out.print("Guess superhero name: ");
			System.out.println(randomHero.getEncryptName());
			System.out.print("Enter the name: ");
			inputFromUser = scan.nextLine();
			if (!inputFromUser.equals(randomHero.getName())) {
				System.out.println("Try again!");
			}
		} while (!inputFromUser.equals(randomHero.getName()));
		System.out.println("You win!");
		System.out.println("WELL DONE");
		System.out.println("Superhero name: " + randomHero.getName());

	}
}