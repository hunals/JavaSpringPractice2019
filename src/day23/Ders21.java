package day23;

public class Ders21 {

	public static void main(String[] args) {
		
		//DRY PRINCIPLE
		//DO NOT REPEAT YOURSELF
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		
//		ic ice for  dongusu yazilirsa icteki for dista belirtilen kadar yazdirilir
		
//		for (int j = 0; j < 3; j++) {
//			for (int i = 1; i < 6; i++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}	
		
//		15-5 arasini 4 kere yazdirdi
		for (int k = 0; k < 4; k++) {
			System.out.println("Iteration " + (k+1));
			for (int n = 15; n >= 5; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
	}

}
}

/*


// DRY PRINCIPLE 
// DONOT REPEAT YOURSELF 

for (int j = 0; j < 3; j++) {

  for (int i = 1; i < 6; i++) {
    System.out.print(i + " ");
  }
  System.out.println();


for (int j = 0; j < 4; j++) {

  System.out.println("Iteration " + (j+1) );
  for(int i=15 ; i>=5 ; i--) {
    System.out.print(i + " ");
  }
  System.out.println();


*/