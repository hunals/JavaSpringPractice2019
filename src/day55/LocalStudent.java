package day55;

public class LocalStudent extends Student{

	int seatID;
	
	@Override
	public void attendClass() {
		System.out.println("attend class in classroom");
		
		
	}

	public LocalStudent(int id, String name, int seatID) {
		super(id, name);
		this.seatID = seatID;
	}
}

/*
package day55;

public class LocalStudent extends Student{

  int seatID; 
  
  @Override
  public void attendClass() {
    System.out.println("attend class in classroom");
  }
  
  
}


*/