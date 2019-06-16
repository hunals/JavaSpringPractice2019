package day11;

public class NestedIf {

	public static void main(String[] args) {

		String username = "user12321";
		String password = "pass22";

		if(username.equals("user") && password.equals("pass")){
			System.out.println(" \" login successful \" ");
		}else{
			
			if( ! username.equals("user") ){
				System.out.println("USERNAME NOT FOUND");
			}else{
				System.out.println("PASSWORD NOT CORRECT");
			}
			
}
		
		
		
//		String username = "user";
//		String password = "pass";

		if (username.equals("user")) {

			if (password.equals("pass")) {
				System.out.println("YES LOG IN SUCCESS");
			}

		}

		if (username.equals("user"))

			if (password.equals("pass"))
				System.out.println("YES LOG IN SUCCESS");


	}
}