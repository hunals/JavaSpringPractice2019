package repl6;

public class Repl191 {
	 public static void main(String[] args) {
		   
		   Atts a = new Atts();
		   a.name = "ball";
		   a.color = "red";
		   a.amount = 1;
		   
		   
		    System.out.println(a.asString());
		  }
		}
class Atts{
	String name;
	String color;
	int amount;
	
	public String asString() {
		return ("name: " + name + " color: " + color + " amount: " + amount);
	}
}

/*
The class Atts holds a few attributes and has a method called asString.

the attributes are name and color -both are strings and amount which is an int.
their visibility is public.

asString returns a string showing all the Atts in a format.

for example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;
   
   System.out.println(a.asString());

prints:
name: table color: brown amount: 1

create the required attributes and method inside the atts class

*/