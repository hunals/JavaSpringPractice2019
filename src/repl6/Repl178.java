package repl6;

public class Repl178 {
	class Main {
		
	}
		public static String reverse(String input){
			
			String reversed = "";
			for (int i = input.length()-1; i >=0 ; i--) {
				
				reversed += input.charAt(i) ; 
			    }
			  
			
		   return reversed;
		}
	}

/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"

*/