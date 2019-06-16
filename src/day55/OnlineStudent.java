package day55;

public class OnlineStudent extends Student{

	int zoomID;
	
	public OnlineStudent(int id, String name, int zoomID) {
		super(id,name);
		this.zoomID = zoomID;
	}
	
	
	@Override
	public void attendClass() {
		System.out.println("attend class using zoom");
		
	}
	
	public static void main(String[] args) {
		
		OnlineStudent s1 = new OnlineStudent(38, "hakan", 404128);
//		s1.id = 101;
//		s1.name = "Spartan";
//		s1.zoomID = 20001;
		
		s1.attendClass();
		
//		Student s2 = new Student(); 
			
			
		
		
		
	}
}
/*
 package day55;

public class OnlineStudent extends Student {

//  int id; 
//  String name; 
  int zoomId; 
  
  public OnlineStudent(int id,String name,int zoomId) {
    super(id,name); 
    this.zoomId = zoomId; 
  }

  @Override
  public void attendClass() {
    System.out.println("attend class using zoom");
  }
  
  public static void main(String[] args) {
    
    OnlineStudent s1 = new OnlineStudent(32, "ashraf khalil", 522220);
//    s1.id = 101; 
//    s1.name = "Spartan";
//    s1.zoomId = 20001;
    s1.attendClass();
    
//    Student s2 = new Student() ; 
    
    
    
    
  }
  
}



*/
