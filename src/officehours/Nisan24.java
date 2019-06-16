package officehours;

public class Nisan24 {

}
/*
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String numStr = scan.next();
    printDataTypes(numStr);
  }
  
  public static void printDataTypes(String numStr){
    long num = 0;
    try{
       num = Long.valueOf(numStr);
       System.out.println(num+" can be fitted in:");
       if(num>=-128 && num<=127){
            System.out.println("* byte");
        }
        //WRITE YOUR CODE HERE
        if(num>=-32768 && num<=32767){
            System.out.println("* short");
        }
        if(num>=-2147483648 && num<=2147483647){
            System.out.println("* int");
        }
        if(num>=-9223372036854775808L && num<=9223372036854775807L){
            System.out.println("* long");
        }
        //DO NOT CHANGE        
    }catch(Exception e){
       System.out.println(numStr+" can't be fitted anywhere.");
    }
  }







package officehours;

import java.util.Arrays;
import java.util.Scanner;

public class April24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		// we are getting array of chars with binary representation of number
		// Integer.toBinaryString(decimal) converts any number into binary
		// .toCharArray(); this method converts anything into array of characters
//		char[] binaryChar = Integer.toBinaryString(decimal).toCharArray();
//		for (int i = binary.length - 1, j = binaryChar.length - 1; j >= 0; j--, i--) {
//			//Character.getNumericValue will return number not unicode
//			binary[i] = Character.getNumericValue(binaryChar[j]);
//		}
		for (int i = binary.length - 1; i >= 0; i--) {
			binary[i] = decimal % 2;
			decimal /= 2;

		}

		System.out.println(Arrays.toString(binary));
		System.out.println(Long.MIN_VALUE);

	}
}
*/