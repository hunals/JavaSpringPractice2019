package repl2;

import java.util.Scanner;

public class Repl51enver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int peopleAmount ;
		double checkAmount, tip=0;
		String str1 = "Yes";
		String str2 = "No";
	
		String mark = "&";
		
		System.out.println("Split:");
			String splitAnswer = input.next();
		System.out.println("Number of people: ");
			peopleAmount = input.nextInt();
		System.out.println("Check amount:");
			checkAmount = input.nextDouble();
		System.out.println("Service Quality:");
			String quality = input.next();
		
					
		switch (peopleAmount) {
		case 1 : mark = "&";
			break;
		case 2 : mark = "&&";
			break;
		case 3 : mark = "&&&";
			break;
		case 4 : mark = "&&&&";
			break;
		case 5 : mark = "&&&&&";
			break;
		default: System.out.println("Please enter max 5 people");
			break;
		}
		
		if(quality.equalsIgnoreCase("Excellent")) 
			tip = checkAmount*0.25;
		else if(quality.equalsIgnoreCase("Great"))
			tip = checkAmount*0.2;
		else if(quality.equalsIgnoreCase("Good"))
			tip = checkAmount*0.15;
		else if(quality.equalsIgnoreCase("Fair"))
			tip = checkAmount*0.1;	
		else if(quality.equalsIgnoreCase("Poor"))
			tip = checkAmount*0.05;
		
		
		if(splitAnswer.equalsIgnoreCase(str1)) {
			System.out.println("Number of people entered: " + mark);
			System.out.println("Total to pay: " + (checkAmount + tip));
			System.out.println("Total tip: " + tip);
			System.out.println("Total per person: " + (checkAmount+tip)/peopleAmount);
			System.out.println("Tip per person: " + tip/peopleAmount);
		}else if(splitAnswer.equalsIgnoreCase(str2)){
			System.out.println("Number of people entered: " + mark);
			System.out.println("Total to pay: " + (checkAmount + tip));
			System.out.println("Total tip: " + tip);
		}else
			System.out.println("for Split just -Yes or No- please");
			
		input.close();
	}


		
		
		
	}


