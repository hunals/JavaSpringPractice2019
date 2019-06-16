package repl6;

public class Repl168 {

	public static int wordCount(String words) {
	    
		/// her ikiside calisiyor altaki return tek basina yeterli
//		int count = 0;
//		String[] split = words.split(" ");
//		
//		for (int i = 0; i < split.length; i++) {
//			count++;
//		}
//		return count;
	      return words.split(" ").length;
	  }
	  
}

/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)


*/