package repl6;
import java.util.*;
public class Repl187 {

	public static void main(String[] args) {
		
		
		public static void removeAll(ArrayList<String> wordList, String targetWord ) {

			for (int i = 0; i < wordList.size(); i++) {
				if(wordList.get(i).equals(targetWord)) {
					wordList.remove(i);
					i--;
				}
			}
			System.out.println(wordList);
		}
		
		/*
		 import java.util.*;

// create a method that takes a string arraylist and removes all the strings that starts with s

public class ex2 {

	public static void main(String[] args) {
		ArrayList <String> myarr= new ArrayList <>(Arrays.asList("string","java","sebze","soft","pencil"));
		removeS(myarr);
		

	}
	
	public static void removeS(ArrayList<String> s) {
		for(int i=0; i<s.size();i++) {
			if(s.get(i).startsWith("s")) {
				s.remove(i);
				i--;
			}
		}
		System.out.println(s);
	}
	

}
		 
		 
		 
		 */
		
	}
}

/*
Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called 
wordList, and a String called targetWord

This method should go through every element of wordList 
and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]


*/