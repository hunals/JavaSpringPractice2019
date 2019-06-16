package day31;

public class Ders2MethodWithMoreParams {

	public static void main(String[] args) {
		
		login("spartan", "s300", true);
		login("horse", "h300", false);
		
		String user = "abc" ;
		String pass = "efg" ;
		boolean isChecked = false ;
		
		login(user, pass, isChecked);
		
	}
	
	
	
	public static void login(String username, String password
							, boolean rememberMe) {
		
		System.out.println("You entered username :" + username);
		System.out.println("You entered password :" + password);
		
		if(rememberMe==true) {
			System.out.println("you checked rememberMe checkbox");
		}else {
			System.out.println("you did not check rememberMe checkbox");
		}
			
		}
		

	
	
	// create a static method called login
	/*it return nothing
	 * it takes 3 parameters :
	 * 		user as String, password as String,
	 * 		rememberMe as boolean
	 * inside body
	 * 		You entered username :---
	 * 		You entered Password :---
	 * 		print you checked rememberMe checkbox if it's true
	 * 		print you did not check rememberMe checkbox if it's false
	 */
	
	
	
	

}

/*
  public static void main(String[] args) {
    
    login("spartan","s300",true) ; 
    
    login("horse","h300",false) ; 
    
  }
  
  public static void login(String username, String password
              ,boolean rememberMe) {
  
    System.out.println("You entered username : " + username);
    System.out.println("You entered password : " + password);
    
    if(rememberMe==true) {
      System.out.println("you checked remeberMe checkbox");
    }else {
      System.out.println("you did not check remeberMe checkbox");
    }
    
  }
  
  
  // create a static method called login 
  /* 
   * it return nothing
   * It takes 3 parameters : 
   *     user as String , password as String, 
   *     rememberMe as boolean
   * inside body 
   *     You entered username : ----
   *     You entered password : ----
   *     print you checked remeberMe checkbox if it's true 
   *     print you did not check remeberMe checkbox if it's false
   *






Scanner key = new Scanner(System.in);
		System.out.println("Enter your user Name");
		String userName = key.nextLine();
		System.out.println("Enter your password");
		String passWord = key.nextLine();
		System.out.println("Did you check remember me (true or false) : ");
		boolean rememberMe = key.nextBoolean();
		
		login(userName, passWord, rememberMe);

	}

	public static void login(String userName, String passWord, boolean rememberMe) {

		System.out.println(" You Entered your user Name: " + userName);
		System.out.println(" You Entered your pass word : " + passWord);

		if (rememberMe == true) {
			System.out.println("you checked remeberMe checkbox");
		} else {
			System.out.println("you did not check remeberMe checkbox");
		}

*/