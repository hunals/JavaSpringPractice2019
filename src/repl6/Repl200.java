package repl6;

public class Repl200 {
	 public static void main(String[] args) {
		 Person p1 = new Person();
		 
		 
		 System.out.println(p1.getFirstName());
		 System.out.println(p1.getLastName());
		 System.out.println(p1.getAge());
		 System.out.println(p1.toString());
		 
		 p1.setFirstName("undefined");
		 p1.setLastName("undefined");
		 p1.setAge(-1);
		 
	}
}

class Person {
	  
	private String firstName ;
	private String lastName ;
	private int age = -1;
	
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return  firstName + " | " + lastName + " | " + age ;
	}
	
	
	
	
}



/*
Person class has following attributes: 

 - private String instance variables: firstName, lastName
 - private int instance variable: age

Methods:
  - getter and setter methods for each instance variable. try to use this. keyword
     -   toString method.No parameters and Returns(does not print! no println in the method!) person info in this format: "firstName | lastName | age"

Constructors:

1) No-Args constructor
 -sets default values for the Person object
 name and lastName => "undefined"
 age => -1

2) 3-Args  Constructor:
 - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
 try to use this. keyword

Examples:

Person person = new Person();

System.out.println(person.getFirstName()); //"undefined"
System.out.println(person.getLastName());  //"undefined"
System.out.println(person.getAge());       // -1
System.out.println(person.toString());     //"undefined | undefined | -1"

person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);

System.out.println(person.toString() ); // "John | Doe | 44"
--------------------------------

Person person = new Person("Fatima", "Lee", 22);

System.out.println(person.getFirstName()); //"Fatima"
System.out.println(person.getLastName());  //"Lee"
System.out.println(person.getAge());       // 22
System.out.println(person.toString());     //"Fatima | Lee | 22"




*/