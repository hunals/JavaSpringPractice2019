package day55;

public class Quizz {

//	public static void main(String[] args) {
//
//		int i=10 ;
//		for (; i < 122; i++) {
//			if(i%2!=0) {
//				System.out.print(i + " ");
//			}
//		}
//	    
//	  }
	public static void main(String[] args) {

		for (char i='z'; i>='v'; i--)
			for (char j='z'; j>='v'; j--) {
				System.out.print(i);
				System.out.println(j);
				}
	}
	
}	
//	 public static void main(String[] args) {
//		    System.out.println("Hello world!");
//		  }
//		  
//		  /**
//			 * @param target - string that you need to check.
//			 * @param sentence - string where you need to lookup for the target string.
//			 * @return 
//			 */
//			public static boolean appearsTwice(String target, String sentence) {
//
//				int count = 0;
//				for (int i = 0; i < sentence.length(); i++) {
//					if(sentence.contains(target)) {
//						count ++;
//					}
//					if (count==2) {
//						return true;
//					}else {
//				
//				return false;
//			
//}
//}
public class Accumulator{
	  
int sum;
	
	public Accumulator(int sum) {
		this.sum = sum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	public void add(int add) {
		sum = sum + add;
	}
	public void remove(int remove) {
		sum = sum - remove;
	}

	@Override
	public String toString() {
		return "Sum is: " + sum;
	}
}
//	  
//	  
//	  
//	}
