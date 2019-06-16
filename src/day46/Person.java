package day46;

public class Person {

	String name;
	float height;
	char gender;
	
	static String race = "Human" ;

	static int counter;
	//int counter;
	
	public Person() {
		counter++;
	}
	
	
	public Person(String name, float height, char gender) {
		this.name = name;
		this.height = height;
		this.gender = gender;
		
		//counter = counter + 1;
		counter ++;
		
		
		
	}

	
}

/*


package day46;
​
public class Person {
 
 String name; 
Click to expand inline (30 lines)

Yasin Bekar [8:42 PM]
p3 should give only 1 BECAUSE it has only 1 value. That is the point I do not get it

Firuz Baysahatov [8:42 PM]
fb

Akbar [8:42 PM]
Person.java at lines 1-26 
package day46;
​
public class Person {
 
 String name; 
 float height; 
 char gender; 
 
 static String race = "Human";
 
 static int counter ; 
 //int counter ; 
​
 
 public Person(String name, float height, char gender) {
  this.name = name;
  this.height = height;
  this.gender = gender;
  
  //counter = counter + 1 ; 
  counter ++; 
 } 
 
 
​
}

*/