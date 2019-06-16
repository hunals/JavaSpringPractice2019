package day21;

public class Ders3 {

	public static void main(String[] args) {
		
//		every for loop can be written in while loop
		
//		use for loop to print your name char by char
//		and print reverse order char by char 
//		optionally save it into another variable
		
		
		String name = "hakan" ;
		
		for (int i= 0;  i < name.length(); i++) 
			System.out.print(name.charAt(i) + " ");
		
		
		for (int j = name.length()-1 ; j >= 0 ; j--) 
			System.out.print(name.charAt(j) + " ");
		
		
		String newStr = "" ;
		for (int k = name.length()-1 ; k >= 0 ; k--) { 
			char eachChar = name.charAt(k) ;
			newStr = newStr + eachChar ;
	}
		System.out.println(newStr);
	

	}

}

// EVERY FOR LOOP CAN BE WRITTEN IN WHILE LOOP

// use for loop to print your name char by char
// and print reverse order char by char

// OPTIONALLY Save it into another variable
      // 012345
//String name = "Dilnur";
//TASK 3.1
//for (int d = 0; d < name.length(); d++) {
//  System.out.print(name.charAt(d) + " ");
//}
//System.out.println();
//// TASK 3.1
//for (int d = name.length() - 1; d >=0 ; d-- ) {
//  System.out.print(name.charAt(d) + " ");
//}
//
// TASK 3.3
//String newStr = "" ; 
//for (int d = name.length() - 1; d >=0 ; d-- ) {
//  //System.out.print(name.charAt(d) + " ");
//  char eachChar = name.charAt(d); 
//  newStr = newStr + eachChar ;
//}
//System.out.println( newStr);


//int x = 0 ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 


//int x = name.length()-1 ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 
//System.out.print(name.charAt(x) + " ");
//x-- ; 



// EVERY FOR LOOP CAN BE WRITTEN IN WHILE LOOP

// use for loop to print your name char by char
// and print reverse order char by char

// OPTIONALLY Save it into another variable
      // 012345
//String name = "Dilnur";
//TASK 3.1
//for (int d = 0; d < name.length(); d++) {
//  System.out.print(name.charAt(d) + " ");
//}
//System.out.println();
//// TASK 3.1
//for (int d = name.length() - 1; d >=0 ; d-- ) {
//  System.out.print(name.charAt(d) + " ");
//}
//
// TASK 3.3
//String newStr = "" ; 
//for (int d = name.length() - 1; d >=0 ; d-- ) {
//  //System.out.print(name.charAt(d) + " ");
//  char eachChar = name.charAt(d); 
//  newStr = newStr + eachChar ;
//}
//System.out.println( newStr);




//int x = 0 ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 
//System.out.print(name.charAt(x) + " ");
//x++ ; 

//String newStr = "" ; 
//int x = name.length()-1 ; 
//newStr = newStr + name.charAt(x) ; 
//System.out.print(newStr + " ");
//x-- ; 
//newStr = newStr + name.charAt(x) ; 
//
//System.out.print(newStr + " ");
//x-- ; 
//newStr = newStr + name.charAt(x) ; 
//System.out.print(newStr + " ");
//x-- ; 
//newStr = newStr + name.charAt(x) ; 
//System.out.print(newStr + " ");
//x-- ;
//newStr = newStr + name.charAt(x) ; 
//System.out.print(newStr + " ");
//x-- ;
//newStr = newStr + name.charAt(x) ; 
//System.out.print(newStr + " ");
//x-- ; 
