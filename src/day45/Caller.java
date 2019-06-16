package day45;

public class Caller {

	public Caller() {
//		this(100); bunu yazdigimizda calismaz hata verir
		System.out.println("calling no arg");
	}
	
	public Caller(int x) {
		
		this();
		System.out.println("calling 1 arg");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
