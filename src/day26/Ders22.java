package day26;

import java.util.Arrays;

public class Ders22 {

	public static void main(String[] args) {
		
		String str = "Java is fun, java is challenging" ;
		
//		String[] words = str.split(" ") ;
//		System.out.println(Arrays.toString(words));
//		
//		String[] parts = str.split("a") ;
//		System.out.println(Arrays.toString(parts));
//		
//		String[] parts2 = str.split("is") ;
//		System.out.println(Arrays.toString(parts2));
	
	
//	create a string called groceries
//		add items separated by comma
//		split them and print them out
//		find out size of split
//		find out length of each items
		
		String groceries = "tomato, peper, potato, bread, onion, cucumber, banana" ;
		
		String[] word = groceries.split(",") ;
		System.out.println(word.length);
		System.out.println(Arrays.toString(word));
//	
//		for (int i = 0; i < word.length; i++) {
//			
//			System.out.println(word[i].trim().length());  //trim kelimeler arasini kesti
//		}
	
	
	}

}
