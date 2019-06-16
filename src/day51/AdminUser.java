package day51;

public class AdminUser extends SlackUser{

	int adminLevel ;
	
	/*
	 * String displayName
	 * int timeZone ;
	   String status;
	 * 
	 * */


	public AdminUser(String displayName, int timeZone
			, String status, int adminLevel) {
		
		super(displayName, timeZone, status);
		this.adminLevel = adminLevel ;
	}
	
	// optional annotation to make sure
	// you are overriding it correctly
	
	@Override
	public void sendMessage(String message) {
		
		System.out.println("@channel Dear good people of sparta");
//		System.out.println("<" + displayName + "> is sending <" 
//				 + message + ">");
	
		System.out.println("rebellios kids");
	}
	
	public static void main(String[] args) {
		
		AdminUser a1 = new AdminUser("B11", 5, "FULLY CHARGED" , 1);
		a1.sendMessage("abc");
	}
}
