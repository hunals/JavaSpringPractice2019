package day52;

import java.util.Arrays;

class data1{
	
	static double num2=100;
	
	
}

public class initilizerPractice {
	
	int a;
	String b;
	boolean c;
	double d;
	
	static {
		// a=500;
		initilizerPractice  obj5 = new initilizerPractice();
				obj5.a=500;
				
	}
	
//	{
//		a=30;
//		b="cybertek";
//		c= 10 > 9;
//		d = 100_11;
//		
//		// 100, 000, 0000,09000
//	}
	
	
	static int a1;
	static String b1;
	
	
	
	
	static {
		
		a1=100;
		b1="Cybertek";
		
	}
	
	
	public static void main(String[] args) {
		data1 obj=new data1();
		System.out.println( obj.num2 );  // static should not be called through object
		System.out.println(data1.num2);   
		
		
		
		System.out.println(a1+"  "+b1);
		
		initilizerPractice   obj4 = new initilizerPractice();
			System.out.println(obj4.a);
		
//		initilizerPractice   obj = new initilizerPractice();
//		
//		System.out.println( obj.a );
//		System.out.println( obj.b );
//		System.out.println( obj.c );
//		System.out.println( obj.d );
		
		
		
	}
	
	
	
	

}