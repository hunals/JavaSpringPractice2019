package day27;

import java.util.Arrays;

public class Ders31ArrayShortMethod {

	public static void main(String[] args) {
		
		int[] nums = {1,4,5,2,77,45} ;
		
		System.out.println(Arrays.toString(nums));
		
		// sort method from Arrays class
		// it take array object and sort it's items in ascending order
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		// char array is sorter by ASCII code value low high
		String name = "CyberTek 123" ;
		char[] nameChars = name.toCharArray();
		
		Arrays.sort(nameChars);
		System.out.println(Arrays.toString(nameChars));
		
		
		
//		boolean yazilamaz
//		boolean[] bools = {true,false,true,false,false,true} ;
//		Arrays.sort(bools);
		
		
		String[] names = {"abc","efg"," ","123","Ku"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
//		bu kod kucukten buyuge siralama yapiyor 
//		once busluk virgul tire gibi karakterler
//		sonra rakamlar sonra buyuk harfle baslayanlar
//		en son alfabetik siraya gore kucuk harfler(ASCII kodlara gore siralama yapiyor)
		
		String[] names1 = {"abc","afg","afz"};
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));
		
		
		String[] names2 = {"a19999","a2","afZ"}; // siralama yaparken ilk ve ikinci karakterlere bakiyor rakamin buyuklugune degil
		Arrays.sort(names2);
		System.out.println(Arrays.toString(names2));
		
		
		
	}

}

/*
public static void main(String[] args) {
    
    // Array is mutable meaning  items inside can change 
    // it's not resizable we can not increase or decrease the capacity 
    // Arrays sort method will internally shuffle the items around 
    // to make it sorted order , low-to-high 
    int[] nums = {1,4,5,2,77,45} ; 
    
    System.out.println(Arrays.toString(nums));
    
    // sort method from Arrays class 
    // it take array object and sort it's items in ascending order 
    Arrays.sort(nums);
    
    System.out.println(Arrays.toString(nums));
    
    // char array is sorted by ASCII Code value low to high 
    
    // ASCII Code value low to high 
    // -- most of the special chars --numbers -- uppercase -- lowercase 
    
    
    String name = "CybeterTek 123" ; 
    char[] nameChars = name.toCharArray() ; 
    
    Arrays.sort(nameChars);
    System.out.println(Arrays.toString(nameChars));
      
    // Sorting a string array , it's based on first character
    // ASCII Code value low to high 
        // -- most of the special chars --numbers -- uppercase -- lowercase 
        
    String[] names = {"abc","efg"," " , "123","Ku"} ; 
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
    
    // if multiple items have same first char 
    // it will move on to compare the next character
    String[] names1 = {"abc","afz","afZ"} ; 
    Arrays.sort(names1);
    System.out.println(Arrays.toString(names1));
    
    String[] names2 = {"a19999","a2","afZ"} ; 
    Arrays.sort(names2);
    System.out.println(Arrays.toString(names2));

*/