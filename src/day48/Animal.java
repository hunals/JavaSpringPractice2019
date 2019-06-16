package day48;

public class Animal {

	private String breed; /// basina private yazilinca diger class calismaz
	String color;
	boolean wild;
	int legCount;
	
	
	
	
}
/*
 * IF IT IS PRIVATE WE CANNOT INHERIT 
 * IT NEED TO BE ALL VISIBLE
 * IT GAVE US COMPILER ERROR
 * 
 * 
 * IF OUR HORSE CLASS AND ANIMAL CLASS IS DIFFERENT PACKAGE
 * WE HAVE TO IMPORT IT, BECAUSE IT GAVE US COMPILE ERROR WITHOUT IMPORT
 */