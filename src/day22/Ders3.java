package day22;

public class Ders3 {

	public static void main(String[] args) {
		
//		given String str = "ABCDEFGH"
//		print 2 letter at a time compared to one from previous tasks
//		ABCDEFGH --->AB CD EF GH
		
		String str = "ABCDEFGH" ;
		for (int i = 0; i < str.length(); i+=2) {
			
			System.out.print(str.substring(i, i+2) + " ");
		}
		
		System.out.println();
		
		String scan = "ABCDEFGHIJK" ;
		for (int i = 0; i < scan.length(); i+=2) {
			
			if(i!=scan.length()-1)
			System.out.print(scan.substring(i, i+2) + " ");
			else 
				System.out.println(scan.substring(i));
		}
		
		
		for (int i = 0; i < scan.length(); i+=3) {
			
			if(i!=scan.length()-2)
			System.out.print(scan.substring(i, i+3) + " ");
			else 
				System.out.println(scan.substring(i));
		}
		}

}

	
//
//    // Task 2 
//          //01234567890
//    String str = "ABCDEFGHIJK" ;
//    
//    // print 2 letter at a time compared to one from previous tasks
//    // ABCDEFGH  --> AB CD EF GH 
//    
//    for (int i = 0; i < str.length(); i+=2) {
//      
//      if(i!=str.length()-1)
//        System.out.print(  str.substring(i, i+2)  + " "  );
//      else
//        System.out.println(str.substring(i));
//    }
//    System.out.println();
//    
//    for (int i = 0; i < str.length(); i+=3) {
//      
//      if(i!=str.length()-2)
//        System.out.print(  str.substring(i, i+3)  + " "  );
//      else
//        System.out.println(str.substring(i));