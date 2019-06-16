package day11;

public class VariableScope {

	public static void main(String[] args) {
		
		// variable scopes : it means where you can access
			// the piece of data you declared 
		
		int x = 10 ; 
		//int y = 5 ; 
		
		if(x == 10){
		
			System.out.println("YES 10 ");

			int y = 2 ; 
			System.out.println(y);
		
		}
		
		// out of scope 
		// items created inside bedroom can not be accessed inside living room 
		//System.out.println(y);
		
		System.out.println(x);	

	}
}
