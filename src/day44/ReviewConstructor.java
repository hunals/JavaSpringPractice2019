package day44;

public class ReviewConstructor {

	public void ReviewConstructor() {
		System.out.println("BOOM");
	}
	// we can use any access modifier for constructer
	public ReviewConstructor() {
		System.out.println("BOOM REAL");
		
		
	}
	
	
	public static void main(String[] args) {
		
		ReviewConstructor re = new ReviewConstructor();
		
	}

}
