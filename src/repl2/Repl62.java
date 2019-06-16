package repl2;

import java.util.Scanner;

public class Repl62 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int count = word.length();
		int midIndex = count / 2;

		if (count % 2 == 1 && count >= 3) {
			midIndex = count / 2;
			char a = word.charAt(midIndex);
			System.out.println(a);
		} else if(count == 1)
			System.out.println(word + word + word);
		
		if (count % 2 == 0 && count >= 4) { 
			midIndex = count / 2;
			// char a = word.charAt(midIndex);
			char b = word.charAt(midIndex - 1);
			char c = word.charAt(midIndex);
			System.out.println("" + b + c);
		}else if(count ==2 ) 
			System.out.println(word + word);
		
		
	}

}
//You have a word, do the following:
//
//1. When word has odd number of characters and:
//            - 3 or more characters, print middle letter
//      oak ==> a
//      javav ==> v
//             - Single character, print that character 3 times
//      # ==> ###
//      q ==> qqq
//
//2. When word has even number of characters and:
//           - 4 or more characters, print middle 2
//     java ==> av
//     apples ==> pl
//     #$%^&* ==> %^
//           - 2 characters, print those 2 characters twice
//      @@ ==>@@@@
//      $$ ==>$$$$
//      hi ==> hihi

