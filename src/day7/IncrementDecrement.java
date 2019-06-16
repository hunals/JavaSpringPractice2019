/*
Skip to content
Why GitHub? 
Enterprise
Explore 
Marketplace
Pricing 
Search

Sign in
Sign up
4 2 3 CybertekSchool/Spring2019Online_Project
 Code  Issues 0  Pull requests 0  Projects 0  Insights
Join GitHub today
GitHub is home to over 31 million developers working together to host and review code, manage projects, and build software together.

Spring2019Online_Project/src/day7/IncrementDecrement.java
@CybertekSchool CybertekSchool day 8 codes
12ac44e  9 days ago
63 lines (37 sloc)  1.66 KB
  */  
package day7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//Increment and decrement operator
		// increment --- increasing value by one  ++  for example b++ ++b
		// decrement --- decreasing value by one  --  for example b-- --b 
		
		// if ++ comes after variable name --> post increment 
			// it means increase the value and only reflect the change next time 
			// the variable showed up again 
		
		// if ++ comes after variable name --> pre increment 
					// it means increase the value right away and reflect the change right away
				
		
		int x = 3;
		
//		x = x++ ; //-->>> x = 3
//		x = ++x ; //--->> x = 4 

		//int result = x++ + 5 ;   ///3+5 
		//int result = ++x + 5 ;     ///4+5 
		
		//x = x++ + ++x ; // 3 + 5 = 8  
		
		//x = x++ + --x + x-- + x ;  //3 + 3 + 3 + 2 = 11 
		// step 1  x++ --> 3  but next time it shows up it will be 4
		// step 2  --x at this moment x showed up so value of x is 4 
					// since currently x= 4 ->>  --x will immediately generate x=3
		// step 3  x-- ---> 3 when x shows up again next time it will be 2
		// step 4  x = 2 
		
		
		
		
		//System.out.println(result);
		System.out.println( x  );  // 4 
		
		//++x ;// x++  /// if i change this to pre-incerment would it change the value in below output 
		//System.out.println( x );
		
		//System.out.println( x++ );
//		System.out.println( ++x ); // increment the value and reflect right away
//		
//		System.out.println( x ); // no change in here
//		System.out.println( x ); // no change in here 
		
		//System.out.println(  x--  ); // post-decrement 
//		System.out.println(  --x  ); // pre-decrement 
		System.out.println( x  ); 
		
		
		
		
		

	}


}