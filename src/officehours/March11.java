package officehours;

import java.util.Scanner;

public class March11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		System.out.println("My score is: "+score);
		if(score>=90 && score<=100){
			System.out.println("Your grade is A");
		} else if(score<90&&score>=75){
			System.out.println("Your grade is B");
		} else if(score<75&&score>=60){
			System.out.println("Your grade is C");
		} else if(score<60&&score>=0){
			System.out.println("Your grade is D");
		} else {
			System.out.println("Invalid grade!");
		}
		//it takes empty input(return button press)
		//next() takes only one word, nextLine() takes sentence 
//		scan.nextLine();
//		System.out.println("Enter your city");
//		String city = scan.nextLine();
//		System.out.println("My city is: "+city);
	}

}
