package repl;

import java.util.Scanner;

public class If27 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		 
		    if (player >= 21 ) {
		        System.out.println("bust");
		    }else if (player < house ) {
		        System.out.println("player loss");  
		    }else if (player == house ) {
		        System.out.println("it is a tie");
		    }else if (player > house ) {
		        System.out.println("player wins");    
		       
		    }
			
		
	}

}
