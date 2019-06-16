package day19;

public class Palindram2 {

	public static void main(String[] args) {
		
//		task4
//		you have string
		String star = "*" ;
		
//		use while loop
//		*
//		**
//		***
//		****
//		*****
//		String result = "" ;
//		int x= 1 ;
//		while(x<=5) {
//			
//			System.out.println(star);	
//			star += "*" ;
//			x++ ;
//		}
	
		int x= 1 ;
		String allStar = "" ;
		while(x<=5) {
			
			allStar += star ;
			System.out.println(allStar);	
			
			x++ ;
	
		}
	
	}

}
