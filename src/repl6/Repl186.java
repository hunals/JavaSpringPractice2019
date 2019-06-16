package repl6;

import java.util.ArrayList;

public class Repl186 {
public static void main(String[] args) {

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2 ) {
		
		ArrayList<String> List1 = new ArrayList<>(wordList1);
		
		ArrayList<String> List2 = new ArrayList<>(wordList2);
		
		List1.addAll(List2);
		
		return List1;
	}
	
//	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
//
//        ArrayList<String> List1 = new ArrayList<>(wordList1);
//        ArrayList<String> List2 = new ArrayList<>(wordList2);
//        List1.addAll(List2);
//        return List1;
}
}

/*
Statik bir yöntem oluşturun:
birleştirme denir
ArrayList döndürür
iki parametre alır: wordList1 adında bir ArrayList 
dizisi ve wordList2 adında bir ArrayList dizisi

Bu yöntem yeni bir ArrayList of Strings oluşturmalı, 
tüm sözcükleri (sırayla) wordList1'den eklemeli, 
sonra tüm kelimeleri (sırayla) wordList2'den eklemelidir. 
Başka bir deyişle, iki öğedeki tüm öğeleri birleştiriyor.



Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, 
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, 
add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  
In other words, it is combining all the elements 
from the two parameters.

*/