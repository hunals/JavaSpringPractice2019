package day22;

public class Ders2 {

	public static void main(String[] args) {
					 //012345678901234567890123456
		String song = "Name : Ba Ba Black Sheep Ba" ;
		
		String target = "Ba" ;
		
		int indexOf1Ba = song.indexOf("Ba") ;
		System.out.println(indexOf1Ba);
		
//		indexOf(string, beginningIndex)
		int indexOf2Ba = song.indexOf("Ba" , indexOf1Ba +2) ;
		
		System.out.println(indexOf2Ba);
		
		int indexOf3Ba = song.indexOf("Ba" , indexOf2Ba +2) ;
		
		System.out.println(indexOf3Ba);
		
		
		
		
		String str = "ABCAADKAB" ;
		
		//TASK 1 : 
	    // loop through each character using subString 
	    // and print them out with - in between 
	    
	    // OPTIONALLY : avoid the dash in last character 
		
		for (int i = 0; i < str.length(); i++) {
			
//			System.out.print( str.substring(i, i+1) + " - ");
//		
			String eachChar = str.substring(i, i+1) ;
			
//			if (i!=str.length()-1)
//				System.out.print( eachChar + "-");
//			else 
//				System.out.println( eachChar );
//		}
		System.out.print( eachChar + ( (i!= str.length()-1)? "-" : "") ) ;		
		}
	}

}

//String str = "ABCAA" ;
//
////TASK 1 : 
//// loop through each character using subString 
//// and print them out with - in between 
//
//// OPTIONALLY : avoid the dash in last character 
//
//// try line by line to start with if looping directly is challenging
//// once the sequential numbers show up it will be clear
////System.out.println(  str.substring(0,1)   );
////System.out.println(  str.substring(1,2)   );
////System.out.println(  str.substring(2,3)   );
////System.out.println(  str.substring(3,4)   );
////System.out.println(  str.substring(4,5)   );
//
//for (int i = 0; i < str.length(); i++) {
//  
//  String eachChar = str.substring(i, i+1) ;
//  
//  if(i!= str.length()-1)
//    System.out.print( eachChar  + "-" );
//  else
//    System.out.print( eachChar) ; 
////  System.out.print( eachChar + ( (i!= str.length()-1)? "-" : "") ) ;
//  