package day22;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter inhabitants count:");
		int inhabitants = scan.nextInt();
		
		int day = 0 ;
		while (inhabitants>0) {
			System.out.println("Day " + day + "[" + inhabitants + "]");
			inhabitants = inhabitants/2 ;
			day++ ;
		}

		System.out.println("----EXTINCT----");
		
		
	}

}
