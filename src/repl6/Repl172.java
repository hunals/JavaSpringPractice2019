package repl6;

public class Repl172 {

	
	public static String biggerS(String a ,String b){
	   
		 String max = a ;
		 
		   if(a.length()>b.length()) {
					return a;
				}else
			  return b;
	  }
}

/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"

*/