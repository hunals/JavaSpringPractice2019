package repl6;

import java.util.Scanner;

public class Extra_30_haziran {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
//		    
//		    for (int i = 0; i < s.length()-1; i++) {
//				if(s.startsWith(upperCase)) {
//					
//				}
//			}
		    
		    
		    
	}

}
class Person{
	
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	
	
	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getBirthDay() {
		return "Birthday" + "\"" + birthmonth + "/" + birthday + "/" + birthyear +"\"";
	}
	
	public boolean verifySSN() {
		boolean check = true;
		
		return check;
	}
	
	
	
	
	
}