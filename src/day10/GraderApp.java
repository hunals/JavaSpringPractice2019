package day10;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score please ");

		int score = scan.nextInt();

		if(score > 100 || score < 0){
			System.out.println("INVALID NUMBER");
		} else if (score > 90) {
			System.out.println("Great score : A!");
		} else if (score > 80) {
			System.out.println(" Good score : B !!");
		} else if (score > 70) {
			System.out.println(" OK SCORE : C !!");
		} else {
			System.out.println("STDUY HARDER!!!!!");
		}
		
//		if (score > 90){
//			System.out.println("Great score : A!");
//		}
//		if (score > 80 && score <= 90) {
//			System.out.println(" Good score : B !!");
//		}
//		if (score > 70 && score <= 80) {
//			System.out.println(" Good score : C !!");
//		}
//		
//		if (score < 70) {
//			System.out.println(" study Harder !!");
//		}

}

}