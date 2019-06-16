package repl6;

public class Repl175 {

	public class Main {
		  //WRITE YOUR CODE HERE

		
	  
		public int findMax(int[] num) {
			
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(num[i] > max) 
				max = num[i];
		
		}
	
		return max;
		}
		
		public double findMax(double[] num) {
			
			double max = num[0];
			
			for (int i = 1; i < num.length; i++) {
				if(num[i] > max) 
					max = num[i];
			
		}
		return max;
		}
	}
	
}

/*
In this task, you need to write 2 methods findMax() that will 
find a maximum number in the array. First method should work 
with array of integers (int[]) and return int, and second method 
should work with an array of doubles (double[]) and return 
double as a result.
Methods must have the same name and different parameters.

Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.

*/