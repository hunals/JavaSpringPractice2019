package repl6;

public class Repl166 {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    
		  String unique = "" ;
		  for (int i = 0; i < str.length(); i++) {
			String letter = str.substring(i, i+1);
			if(!unique.contains(letter)) {
				unique += letter;
			}
		}
		  return unique;
	  }
	}

/*
uniqueChars is a method that you will code now, 
should be able to accept any string in the world and 
return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"


*/