package day50;

public class OCAExam extends Exam{

	// String name;
	public OCAExam() {
		super();
		//super("hakan "); // bu kodun calismasi icin iki yol var
						   // parantez icine biseyler yazmak
						   // yada diger class a bir tane daha public class acmak
	}
	
}

class Exam{
	
	String name;
	public Exam() {
		
	}
	public Exam(String name) {
		
		this.name = name;
	}
}

/*
package day50;

public class OCAExam extends Exam{

  // String name; 
//  public OCAExam() {
//    super(); 
//    //super("qjkehweiureiu"); 
//  }
  
  
}


class Exam {
  
  String name; 
  public Exam() {
    // TODO Auto-generated constructor stub
  }
  public Exam(String name) {
    this.name = name; 
  }
  
  
}


*/