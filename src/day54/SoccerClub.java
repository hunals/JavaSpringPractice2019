package day54;

public class SoccerClub {

	int playerCount;

	String name;
	
	Stadium st;
	
	public SoccerClub(int playerCount, String name, Stadium stadium) {
		this.playerCount = playerCount;
		this.name = name;
		this.st = stadium;
	}
	
	

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stadium getStadium() {
		return st;
	}

	public void setStadium(Stadium stadium) {
		this.st = stadium;
	}



	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount 
				+ ", name=" + name 
				+ ", stadium=" + st + "]";
	}
	
	public char getInitial() {
		
		return name.charAt(0);
	}
	
	
	public int getStadiumCapacity() {
		
		return st.capacity ;
		
	}
	
	public static void main(String[] args) {
		
		Stadium st = new Stadium(42000, "Doner");
		System.out.println(st.toString());
		
		SoccerClub besiktas = new SoccerClub(23, "Besiktas",st);
		System.out.println(besiktas.toString() );
		System.out.println(besiktas.getInitial());
		System.out.println(besiktas.st.capacity);
	
	}
	
	
	// ADD 3 ARGS CONSTRUCTOR
	// ADD GETTERS AND SETTERS
	// ADD TOSTRING METHOD
	// CREATE A MAIN METHOD
	// CREATE YOUR FAVORITE SOCCER CLUB OBJECT
	// AND TAKE SOME ACTIONS

	
}

/*
package day54;

public class SoccerClub {

  int playerCount; 
  String name; 
  Stadium stadium;
  
  public SoccerClub(int playerCount, String name, Stadium stadium) {
    this.playerCount = playerCount;
    this.name = name;
    this.stadium = stadium;
  }
  
  public static void main(String[] args) {
    
    Stadium st = new Stadium(10000, "Burger"); 
    
    System.out.println( st.toString() );
    
    SoccerClub chelcea = new SoccerClub(25, "Chelcea", st); 
    
    System.out.println(chelcea.toString());
    
  }

  @Override
  public String toString() {
    return "SoccerClub [playerCount=" 
        + playerCount + ", "
        + "name=" + name 
        + ",stadium=" + stadium.toString() + "]";
  }


  public int getPlayerCount() {
    return playerCount;
  }

  public void setPlayerCount(int playerCount) {
    this.playerCount = playerCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stadium getStadium() {
    return stadium;
  }

  public void setStadium(Stadium stadium) {
    this.stadium = stadium;
  } 
  
  
  
  
  // ADD 3 ARGS CONSTRUCTOR 
  // ADD GETTERS AND SETTERS 
  // ADD TOSTRING METHOD 
  // CREATE A MAIN METHOD 
  // CREATE YOUR FAVORITE SOCCER CLUB OBJECT 
  // AND TAKE SOME ACTIONS 
  
} 


*/
