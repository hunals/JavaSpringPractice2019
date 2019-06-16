package day32;

public class Ders2 {

	public static void main(String[] args) {
		
		
//		create a method giveMe6DigitSalary that return long
//		then return the number you have in mind
//		call this method twice and
//		calculate how much you will be making in 2 years

		
//		long firstYearSalary = giveMe6DigitSalary();
//		long secondYearSalary = giveMe6DigitSalary();
//		
//		System.out.println(firstYearSalary + secondYearSalary);
		
//		System.out.println(firstYearSalary *2 );
		
//		System.out.println( giveMe6DigitSalary() + giveMe6DigitSalary());
	
//		second year 10% raise
//		long firstYearSalary = giveMe6DigitSalary();
//		long secondYearSalary = (long) (firstYearSalary * 1.1) ;
//		
//		System.out.println(firstYearSalary + secondYearSalary);
		
		
		
		
		
//		boolean result = isAdultOrNot(19);
//		System.out.println(result);
//		System.out.println(isAdultOrNot(32));
	
		
		
		int biggerNum = giveMeBiggerNumber(10,12) ;
		System.out.println( biggerNum);
		
		System.out.println(giveMeBiggerNumber(100,11) );
	}
	
	public static int giveMeBiggerNumber(int num1 , int num2) {
	
		int max = (num1>num2) ? num1 : num2;
		return max;
		//return (num1>num2) ? num1 : num2 ;
	}
//	task 3
//	create static method called giveMeBiggerNumber
//	it takes 2 byte as parameter
//	and return bigger number 
//	call the method couple times with different result
	
	
	
	
	
	
	public static boolean isAdultOrNot(int age) {
		
//		if(age>18) {
//			return true;
//		}else{
//			return false;
//		}
		
		return age>18 && age<28;
	}
//	create a method called isAdultOrNot
//	it takes one int as a parameter and return a boolean
//	inside body -->if the number passed is more than 18 return true
//	else return false
	
//	call your method couple times and print out the result
//	either by saving it or directly storing it
	
	
	
	
	
public static long giveMe6DigitSalary() {
	return 180000L;
}
}

/*

package day32;

public class Job {

  public static void main(String[] args) {
    
     // Task 1 : create a method giveMe6DigitSalary that return long 
     // then return the number you have in mind 
     
     // call this method twice and 
     // calculate how much you will be making in 2 years 
     
     // giveMe6DigitSalary() ---> 1st year salary
     //  giveMe6DigitSalary() ---> 2nd year salary
  
//     long firstYearSalary = giveMe6DigitSalary(); 
//     long secondYearSalary = giveMe6DigitSalary(); 
//     System.out.println(firstYearSalary +  secondYearSalary );

    
//     long firstYearSalary = giveMe6DigitSalary(); 
//     System.out.println(firstYearSalary * 2 );


//     System.out.println( giveMe6DigitSalary() + giveMe6DigitSalary()   );

//// SECOND YEAR 10% RAISE 
//     long firstYearSalary = giveMe6DigitSalary(); 
//     long secondYearSalary = (long) ( firstYearSalary * 1.1 ) ; 
//     System.out.println(firstYearSalary +  secondYearSalary );

     
     boolean result = isAdultOrNot(19) ; 
     System.out.println(result);
     System.out.println( isAdultOrNot(16) );

     
     int biggerNum = giveMeBiggerNumber(10, 12) ; 
     System.out.println(biggerNum);
     
     System.out.println(giveMeBiggerNumber(100, 11) );
     
  
  }
  
  public static int giveMeBiggerNumber(int num1 , int num2) {
    
    int max =  (num1>num2) ? num1 : num2 ; 
    return max ; 
    // return (num1>num2) ? num1 : num2 ;
    
  }
  
  // TASK 3 :
  
  // CREATE static method called giveMeBiggerNumber
  // it takes 2 int as parameters 
  // and return bigger number 
  
  // call the method couple times with different result 
  
  
  
  public static boolean isAdultOrNot(int age) {
    
//    if(age>18) {
//      return true ; 
//    }else {
//      return false; 
//    }
    return age>18 ; 
    
  }
  
  // TASK 2 
  
  // create a method called isAdultOrNot 
  // It takes one int as a parameter 
  //  and return a boolean 
  // inside body --> if the number passed is more than 18  return true 
  // else return false 
  
  // call your method couple times and print out the result 
  // either by saving it or directly storing it 
  
  
  
  
  public static long giveMe6DigitSalary() {
    
    return 180000L; 
    
  }

*/