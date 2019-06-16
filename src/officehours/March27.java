package officehours;

public class March27 {
	public static void main(String[] args) {
//		//infinite loop, please avoid this, make sure you habe breake somewhere
//		while(true) {
//			System.out.println("LOOP");
//		}
		String email = "mike_tyson@gmail.com";
		int index = 0;
		while(index<email.length()){
			System.out.print(email.charAt(index++));
		}
		System.out.println();
		while(index>0){
			System.out.print(email.charAt(--index));
		}
		
		
		System.out.println();
		index = 0;
		while(index<email.length()-1){
			System.out.print(email.charAt(++index));
		}
	}

}