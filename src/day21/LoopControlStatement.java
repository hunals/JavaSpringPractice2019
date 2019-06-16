package day21;

public class LoopControlStatement {

  public static void main(String[] args) {
    
	  for (int i = 1; i <= 10; i++) {
	      
	      System.out.print(i + " ");
	      
	    }
	    System.out.println();
	    
//	    int j = 1 ; 
//	    for(  ; j<=10 ; ) {
//	      j ++ ; 
//	      System.out.print(j+ " ");
//	    }    
	    for(int i= 1 ; i<=10 ; i += 3 ) {
	      
	      System.out.print(i + " ");
	      
	    }
	  
	  
	  
    
//    for (int i = 1; i <=10; i++) {
//      
//      if (i==5) {
//        break; 
//      }
//      
//      System.out.println("GOT SMART WATER? "+ i);
//      
//    }
    
    for (int i = 1; i <=10; i++) {
      
      if (i==5) {
        continue; 
      }
      
      System.out.println("GOT SMART WATER? "+ i);
      //break ; 
      
    }	
		
		
		
	}

}
