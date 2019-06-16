package repl6;

import java.util.*;
public class Repl194 {

	public static void main(String[] args) {
	}
	  public static boolean isAnagram(String word1, String word2) {
	    
		  word1 = word1.toLowerCase().replace(" ", "");
		  word2 = word2.toLowerCase().replace(" ", "");
		  
		  if(word1.length() != word2.length()) {
			  return false;
		  }  
		  for (int i = 0; i < word1.length(); i++) {
			if(!word2.contains(word1.charAt(i)+"")) {
				return false;
			}
		  }
			return true;
	  }
	}

/*
Anagram is a word, phrase, or name formed by rearranging 
the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram 
to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false


*/