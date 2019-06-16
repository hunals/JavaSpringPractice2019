package repl6;

public class Repl171 {

	 public static String at3(String target,String word){
	    
	  
		 return target.substring(0, 3).concat(word).concat(target.substring(3, target.length()));
	  
	  }
}

/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 
3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"


*/