package day22;

public class Ders32 {

	public static void main(String[] args) {
		
		
		String str = "java kava ava " ;
		
		String target = "ava" ;
		
		int firstIndex = str.indexOf(target) ;
		int lastIndex = str.lastIndexOf(target) ;
		
		int index = -1 ;
		while(index <= lastIndex ) {
			
			index = str.indexOf(target, index) ;
			System.out.println("Found at index : " + index);
//			index = index + 1 ;
			index = index + target.length() ;
		}
		
	}

}


//String str = "java kava ava " ;
//
//String target = "ava" ; 
//
////int firstIndex = str.indexOf( target ); 
//int laststIndex = str.lastIndexOf( target );
//
//int index = -1 ; 
//
//while( index<= laststIndex   ) {
//  
//  index = str.indexOf(target, index); 
//  System.out.println("Found at index : "+ index);
//  //index = index + 1 ; 
//  index = index + target.length() ; 
//  
//}
