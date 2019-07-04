package repl6;

import java.util.Scanner;

public class ReplExtra9Haz {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//	    String model = scan.next();
//	    int year = scan.nextInt();
//	    boolean recalled = true;
//	    
//	    if(model=="Extravagant" && (year>=2010 && year<=2012)) {
//	    	System.out.println(recalled);
//	    }else if(model=="Guzzler" && (year>=2015 && year<=2018)) {
//	    	System.out.println(recalled);
//	    }else {
//	    	System.out.println(recalled==false);
//	    }
	
		Scanner scan = new Scanner(System.in);
	    int statusCode = scan.nextInt();
	    switch(statusCode){
	    	
	    case 200:
	    	System.out.println("OK");
	    	break;
	    case 401:
	    	System.out.println("unauthorized");
	    	break;
	    case 403:
	    	System.out.println("forbiden");
	    	break;
	    case 404:
	    	System.out.println("not founded");
	    	break;
	    case 500:
	    	System.out.println("server error");
	    	break;
	    default:
	    	System.out.println("not supported status code");
	    	break;
	    
	    
	    }
	
	}

}
public class PlayListEntry {
	  
	  String title ;
	  String artist ;
	  int platCount ;
	  
	  
	  
	  


	public PlayListEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayListEntry(String title, String artist, int platCount) {
		super();
		this.title = title;
		this.artist = artist;
		this.platCount = 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getPlatCount() {
		return platCount;
	}
	public void setPlatCount(int platCount) {
		this.platCount = platCount;
	}
	  
	  
	  
	}