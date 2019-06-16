package officehours;

import java.util.*;

public class March19 {
	public static void main(String[] args) {
		March19 m = new March19();
		//m.calculateTips();
		m.calculateTips("Yes", 5, 300, "Excellent");
	}

	public void calculateTips() {
		double tips = 0;
		double total = 0;
		String numberOfGuestsString = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Split:");
		String split = scan.next();

		System.out.println("Number of people:");
		int numberOfGuests = scan.nextInt();

		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		switch (serviceQuality) {
		case "Poor":
			tips = checkAmount * 0.05;
			break;
		case "Fair":
			tips = checkAmount * 0.1;
			break;
		case "Good":
			tips = checkAmount * 0.15;
			break;
		case "Great":
			tips = checkAmount * 0.2;
			break;
		case "Excellent":
			tips = checkAmount * 0.25;
			break;
		}

		switch (numberOfGuests) {
		case 1:
			numberOfGuestsString = "&";
			break;
		case 2:
			numberOfGuestsString = "&&";
			break;
		case 3:
			numberOfGuestsString = "&&&";
			break;
		case 4:
			numberOfGuestsString = "&&&&";
			break;
		case 5:
			numberOfGuestsString = "&&&&&";
			break;
		}
		total = checkAmount + tips;
		System.out.println("Number of people entered: " + numberOfGuestsString);
		System.out.println("Total to pay: " + total);
		System.out.println("Total tip: " + tips);
		System.out.println("Total per person: " + (total / numberOfGuests));
		System.out.println("Tip per person: " + (tips / numberOfGuests));
	}

	public void calculateTips(String split, int numberOfGuests, double checkAmount, String serviceQuality) {
		double tips = 0;
		double total = 0;
		String numberOfGuestsString = "";
		switch (serviceQuality) {
		case "Poor":
			tips = checkAmount * 0.05;
			break;
		case "Fair":
			tips = checkAmount * 0.1;
			break;
		case "Good":
			tips = checkAmount * 0.15;
			break;
		case "Great":
			tips = checkAmount * 0.2;
			break;
		case "Excellent":
			tips = checkAmount * 0.25;
			break;
		}

		switch (numberOfGuests) {
		case 1:
			numberOfGuestsString = "&";
			break;
		case 2:
			numberOfGuestsString = "&&";
			break;
		case 3:
			numberOfGuestsString = "&&&";
			break;
		case 4:
			numberOfGuestsString = "&&&&";
			break;
		case 5:
			numberOfGuestsString = "&&&&&";
			break;
		}
		total = checkAmount + tips;
		System.out.println("Number of people entered: " + numberOfGuestsString);
		System.out.println("Total to pay: " + total);
		System.out.println("Total tip: " + tips);
		System.out.println("Total per person: " + (total / numberOfGuests));
		System.out.println("Tip per person: " + (tips / numberOfGuests));
	}
}
