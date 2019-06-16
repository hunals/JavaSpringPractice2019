package repl6;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Repl180 {
//	class Main {
		public static void main(String[] args) {
			
			String[] r1 = { };
			String[] r2 = { };
			
			System.out.println(combineRs(r1,r2));
		
		}

	  public static String combineRs(String[] r1,String[] r2) 
	  {
		  String sum = "";
	  ArrayList<String> a = new ArrayList<>(Arrays.asList(r1));
	  ArrayList<String> b = new ArrayList<>(Arrays.asList(r2));
	  a.addAll(b);
	  
	  for (int i = 0; i < a.size(); i++) {
		 sum += a.get(i) + "";
	}
	 
	  
	   return sum;
	  }
	}

/*
import java.util.ArrayList;
import java.util.Arrays;

// combine two string arrays make it an arraylist, return it as a string
public class Repl180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []x= {"esra","likes","coding"};
		String []y= {"but","not","when","she","is","hungry"};
		System.out.println(combineR(x,y));

	}
	
	public static String combineR(String [] r1, String r2[]) {
		String sum="";
// <String> myarr= new ArrayList<>();
//		
//		for(String s: r1) {
//			myarr.add(s);
//		}
//		
//		for(String s: r2) {
//			myarr.add(s);
//		}
//		
//		for(int i=0; i<myarr.size();i++) {
//			sum+=myarr.get(i)+" ";
//		}
//		
//		return sum;
		
		ArrayList <String > a= new ArrayList<>(Arrays.asList(r1));
		ArrayList <String > b= new ArrayList<>(Arrays.asList(r2));
		a.addAll(b);

		for(int i=0; i<a.size();i++) {
			sum+=a.get(i)+" ";
		}
		return sum;
		
		
		
	}

}




combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"


*/