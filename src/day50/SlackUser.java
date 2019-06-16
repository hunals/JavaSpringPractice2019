package day50;

public class SlackUser {

//	public static void main(String[] args) {
		
	String displayName;
	int timeZone ;
	String status;
	
	public SlackUser() {
		System.out.println("Slackuser no arg constructor");
	}
	
	public SlackUser(String displayName, int timeZone, String status) {
		
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
	}
	
	public void sendMessage(String message) {
		System.out.println("<" + displayName + "> is sending <" + message + ">");
	}
	
	public void changeStatus(String status) {
		this.status = status;
	}
	

}

/*

 package day50;

public class SlackUser {

  String displayName; 
  int timeZone; 
  String status; 
  
  public SlackUser() {
    super(); 
    System.out.println("Slackuser no arg constructor");
  }
  public SlackUser(String displayName,int timeZone
      , String status) {
    
    this.displayName = displayName; 
    this.timeZone = timeZone; 
    this.status = status; 
  }    
  
  public void sendMessage(String message) {
    
    System.out.println("<"+displayName+"> is sending <" 
            + message+">" );
    
  }
  
  public void changeStatus(String status) {
    this.status = status;
  }
  
  
}




 
 
TASK 1 
Create classes as below 
SlackUser
    displayName as String
    timezone as int
    status as String
constructor --
    no arg
    3 args to set All fields value
    sendMessage    
        have one parameter as message and has no return type
        print --- <displayName> is sending<Message>
    changeStatus
        accept one String as parameter and change status to new status
2 sub classes :
StudentUser
    groupNumber as int 
    
    Create a 4 args constructor to set all field values of StudentUser
    
    // generate toString method so we can print out object directly 
Optional : 
AdminUser
    adminLevel as int 
  
    Create a 4 args constructor to set all field values of AdminUser
   // generate toString method so we can print out object directly 

*/