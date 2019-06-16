package officehours;

import java.util.Scanner;

public class March20 {
	public static void main(String[] args) {
		int num = 12345;
		
		Scanner s = new Scanner(System.in) ; 
		
		
		int digit1 = num/10000;
		int digit2 = num/1000%10;
		int digit3 = num/100%10;
		int digit4 = num/10%10;
		int digit5 = num%10;
		System.out.println("Number 1: "+ digit1);
		System.out.println("Number 2: "+ digit2);
		System.out.println("Number 3: "+ digit3);
		System.out.println("Number 4: "+ digit4);
		System.out.println("Number 5: "+ digit5);
		//we are converting integer to String 
		String numString = String.valueOf(num);
		System.out.println(numString.charAt(1));
	}

}
