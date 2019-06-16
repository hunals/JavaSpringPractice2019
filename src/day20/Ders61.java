package day20;

public class Ders61 {

	public static void main(String[] args) {
		
//		for (int i = 0; i <0 ; i++) {
//			System.out.println("i" + i);
//		}
//		
//		System.out.println("end");
//		
//		for (int i = 0; i < 10; i--) {
//			System.out.println("i" + i);
//			
//		}
//		
//		System.out.println("The end");
		
		
//	for (int i = 0; i < 10; i++) {
//		if (i==5) {
//			break;
//		}
//		
//
//	System.out.println( i );
//	}
	
	String name = "Derya Kubra Gulay" ;
	
	int count = name.length();
	
	for (int i = 0; i < count; i++) {
		System.out.print(name.charAt(i) + " ");
	}
	
	System.out.println();
	
	
	for (int i = count-1; i >=0; i--) {
		System.out.print(name.charAt(i) + " ");
		
	}
	
	}
	
	
	
}
