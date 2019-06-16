package day54;

public class WarmUp {

	int num = 100 ;
		//num = 200;
		
//		System.out.println( "a statement ");
		
//	{
//		num=150;
//		System.out.println( "init block 1 ");
//	}
//	
//	{
//		num=150;
//		System.out.println( "init block 2 ");
//	}
	
	public WarmUp() {
//		num=150;
		num = 200 ;		// son atanan deger sonucta gorunur
	}
	
	public WarmUp(int x) {
		System.out.println( "init block 1 "); // burdan birsey yazmaz!!!
		System.out.println( "init block 2 ");
		num = 400 ;		
	}
	
	public static void main(String[] args) {
		
		WarmUp w = new WarmUp();
		System.out.println(w.num);
		
	}
}


/*
package day54;

public class WarmUp {

  
  int num = 100 ; 
  
  {
    //num = 150; 
    System.out.println( "init block 1 " );
  }
  {
    //num = 150; 
    System.out.println( "init block 2 " );
  }
  
  public WarmUp() {
  //  num = 150; 
    num = 200 ; 
  }
  
  public WarmUp(int x) {
  //  num = 150; 
    num = 400 ; 
  }
  
  public static void main(String[] args) {
    
    
    WarmUp w = new WarmUp(); 
    System.out.println(w.num);
    

  }

}



*/