package officehours;

import java.util.Arrays;

public class Nisan23 {
	
	
	public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }
	
	
	
	
//	public static void fib(int num){
//	    //WRITE YOUR CODE HERE
//	    int num1 = 0;
//	    int num2 = 1;
//	    int result = 0;
//	    for(int i = 2; i <= num; i++){
//	      result = num1 + num2;
//	      num1 = num2;
//	      num2 = result;
//	    }
//	    System.out.println(result);
//	  }

//	public static int fib(int num) {
//		// WRITE YOUR CODE HERE
//		int num1 = 0;
//		int num2 = 1;
//		int result = 0;
//		for (int i = 2; i <= num; i++) {
//			result = num1 + num2;
//			num1 = num2;
//			num2 = result;
//		}
//		return result;
//	}
	
	
	
	public static int fib(int num) {
		// WRITE YOUR CODE HERE
		int num1 = 0;

		System.out.println("Fib 0 : " + num1);
		int num2 = 1;
		System.out.println("Fib 1 : " + num2);
		int result = 0;
		for (int i = 2; i <= num; i++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.println("Fib " + i + ": " + result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	System.out.println(Integer.toBinaryString(255));
	
	System.out.println(Arrays.toString(Integer.toBinaryString(255).toCharArray()));
	
	}
	
}
/*

package officehours;

import java.util.Arrays;

public class April23 {
	public static void main(String[] args) {
//		isPalindrome(43234);
//		int num = 1;
//		System.out.println("Result: "+ (num%10));
//		int reversed = reverseNumber(123456789);
//		System.out.println(reversed);
		System.out.println(fib(20) == 6765);
		System.out.println(fib(20));
		
		System.out.println(Arrays.toString(Integer.toBinaryString(255).toCharArray()));
	}

	public static void isPalindrome(int num) {
		// WRITE YOUR CODE HERE
		int reversedNum = 0;
		int originalNum = num;
		while (num > 0) {
			// 1 iteration (0 * 10)+ 1 , reversedNum = 1, num/10 -> 100
			// 2 iteration 1 * 10 + 0, reversedNum = 10, num/10 -> 10
			// 3 iteration (10 * 10) + 0, revesedNum = 100, num/10 -> 1
			// 4 iteration (100 * 10) + 1, revesedNum = 1001
			// 8%10 = 8, 1%10 = 1, 10%10 = 0
			reversedNum = reversedNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reversedNum == originalNum);

	}

	public static int reverseNumber(int num) {
		int reversedNum = 0;
		while (num > 0) {
			reversedNum = reversedNum * 10 + num % 10;
			num = num / 10;
		}
		return reversedNum;
	}

	public static int fib(int num) {
		// WRITE YOUR CODE HERE
		int num1 = 0;

		System.out.println("Fib 0 : " + num1);
		int num2 = 1;
		System.out.println("Fib 1 : " + num2);
		int result = 0;
		for (int i = 2; i <= num; i++) {
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.println("Fib " + i + ": " + result);
		}
		return result;
	}

}

*/