package day49;

public class Book {

	protected int pageCount;
	String author;
	int chapterCount;
	double price;
	
	public void printAuthot() {
		System.out.println("name " + author);
	}
}
/*
*   Create a class class 
*     Book 
*       pageCount, author, chapterCount, price 
*       
*     2 subclasses of the book 
*     
*     create sub class of Book
*     AudioBook 
*       pageCount, author, chapterCount, price , audioLength
*   
*     PaperBook 
*       pageCount, author, chapterCount, price , weight , hardcover
*     
*   
*     inside your WarmUp Class with main method 
*       create few objects and see what you can access 
*       try different access modifers and see what error you get 
*/