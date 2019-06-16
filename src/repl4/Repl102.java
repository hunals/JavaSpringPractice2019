package repl4;

import java.util.Scanner;

public class Repl102 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int sum  = 0;
	    boolean isNumber = true ;
		for (int i = 0; i < str.length(); i++) {
			
			if(isNumber = Character.isDigit(str.charAt(i))) {
//			char c = str.charAt(i) ;
		  	int num = Integer.parseInt(str.substring(i,i+1)); 
		  	if (str.charAt(i)>='0' && str.charAt(i)<='9') {
			sum+= num ;
		}
			}
		}
		System.out.println(sum);
	    
		
//		 String newStr = "";
		    
//		  int x=0;
//		  while(x<= str.length()-1){
//		    char c = str.charAt(x);
//		    int num = Integer.parseInt(str.substring(0, x));
//		    if(c<= '9' || c>= '0'){
//		      sum += num;
//		    }
//		    x++;
//		  }
//		  System.out.print(sum);
		  
	    
	}

}
/*
char c = str.charAt(i);
if (c >='0' && c <='9')
num = Integer.parseInt(str.substring(i,i+1));
System.out.print(num);
sum+=num;

}
System.out.println();
System.out.println(sum);

/*


Given a string str, print out the sum of the digits 0-9 that appear in the string, ignoring all other characters. 
Print out 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
Integer.parseInt(string) converts a string to an int.)

Example of conversion:
String word = "1java";
boolean isNumber = Character.isDigit(word.charAt(0)); <-- in this way, we can check if character is digit.
int num = Integer.parseInt(word.substring(0,1)); <-- in this way, we can convert String to int

Example:
input: aa1bc2d3
output: 6

Example:
input: aa11b33
output: 8

Example:
input: Chocolate
output: 0


*/