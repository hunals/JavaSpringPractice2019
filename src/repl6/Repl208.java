package repl6;

public class Repl208 {

	public static void main(String[] args) {

		  System.out.println("1+1 = "+calc.plus(1,1) );
		  System.out.println("1-1 = "+calc.minus(1,1) );
		  
		  }
}

class calc {

	public static int ints1;
	public static int ints2;
	
	public static int plus(int ints1, int ints2 ) {
		return (ints1 + ints2);
	}
	
	public static int minus(int ints1, int ints2) {
		
		return (ints1 - ints2);
	}

	
	

}

/*
A static method can be used without instantiating 
a class object.

like in the calculator class create a plus and minus. 
but this time make them static methods.

plus: gets two ints and returns the addition of 
the to numbers as an int

calc.plus(1,1)
returns:2

calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it 
returns the subtracted value of the two ints it gets

calc.minus(1,1)
returns:0

calc.plus(10,1)
returns:9


*/