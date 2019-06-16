package day13;

public class WarmUp {

	public static void main(String[] args) {
		
		int x = 97 ; 
		String result = "Unknown" ;
//		
//		if(x>70){
//			result = "pass" ; 
//		}else{
//			result = "fail" ; 
//		}
//		result = "fail" ; 
		result = (x>70) ? "pass" : "fail" ; 
		
		//System.out.println("fail");
		
		//System.out.println(  result );
		System.out.println(   "my result is : " + ( (x>70) ? "pass" : "fail")   );
		
		// BREAK TILL 9:15 
	
		int num1 = 5 ; 
		int num2 = 8 ; 
		
		num1-- ; 
		num2++; 
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
//		int max ; 
//		if(num1>num2){
//			max = num1 ; 
//		}else{
//			max = num2 ; 
//		}
//		
		 //max = (num1>num2) ? num1 : num2 ; 
		 
		 //System.out.println( "max number is " + max);
		 System.out.println( "max is " +  (  (num1>num2) ? num1 : num2 )   );
		 
		 System.out.println( 10 +  (  (num1>num2) ? num1 : num2 )   );
		 
		 System.out.println( 10 +  (  (num1++> --num2) ? num2 : num1 )   );
		 //System.out.println(num1);
		
	
	}

}
