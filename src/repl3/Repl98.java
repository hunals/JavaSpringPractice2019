package repl3;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	 
//	    

	int i = 0;
	int countOfJava = 0;
	int countOfPython = 0;
	
	while(i<sentence.length()-1)
	{
		if (sentence.charAt(i) == 'j' && sentence.charAt(i + 1) == 'a' && sentence.charAt(i + 2) == 'v'
				&& sentence.charAt(i + 3) == 'a') {
			countOfJava++;
		} else if (sentence.charAt(i) == 'p' && sentence.charAt(i + 1) == 'y' && sentence.charAt(i + 2) == 't'
				&& sentence.charAt(i + 3) == 'h' && sentence.charAt(i + 4) == 'o' && sentence.charAt(i + 5) == 'n') {
			countOfPython++;
		}
		i++;
	}
	if(countOfPython==countOfJava){
		System.out.println("true");
	}else{
		System.out.println("false");
}
	}
}
	
//	    sentence=sentence.replace("","");
//	    int countOfJava = 0;
//	    int countOfPython = 0;
//	    int h = sentence.length();
//
//	    for (int x = 0; h-6>x; x++) {
//				
//	      if(sentence.substring(x,x+4).contains("java")) {
//	    	  countOfJava++;
//	      }
//	      if(sentence.substring(x,x+6).contains("python")) {
//	    	  countOfPython++;
//	      }
//	    }
//	    if (countOfJava == countOfPython) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//	}
//	}
//}
//		sentence = sentence.replace("", "");
//		int x = 0;
//		int count = sentence.length();
//		int sumOfJava = 0;
//		int sumOfPython = 0;
//		String result = "";
//
//		for (x = 0; count - 6 > x; x++) {
//
//			if (sentence.substring(x, x + 4).contains("java")) {
//				sumOfJava++;
//			}
//			if (sentence.substring(x, x + 6).contains("python")) {
//				sumOfPython++;
//			}
//
//		}
//
//		if (sumOfJava == sumOfPython) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		
//	}
//}
	    
	    

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string 
is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
*/