package repl3;

import java.util.Scanner;

public class Repl85 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
		
//	    String output = "" ;
//	    int h = 1 ;
//	    
//	    while (count == 1) {
//	    	
//	    	if (h==1) {
//	    		output = word ;
//	    		System.out.print(output);
//	    		
//	    	}else  if (h>=2){
//	    		h++ ;
//	    		output =  separator + word  ;
////	    		System.out.print(output);
//	    		
////	    }		
//	    	System.out.print(output);
//	    }
//	    }
	    
//	    int x = 1;
//	    String newWord = "";
//	    while (x < count) {
//	        if (x < count ) {
//	            newWord = word + separator;
//	            System.out.print(newWord);
//	            x++;
//	        } else {
//	            newWord += word;
//	            System.out.print(newWord);
//	            x++;
//	        }
//	    }
	    
	    String newWord = "";
	        if(count==1)
				System.out.println(word);
			else {
				for(int h = 2; h<=count; h++) {
					newWord+=word+separator;
					
				}
				
			System.out.println(newWord+word);	
			}
	}
}

//	    if (count ==1) {
//	          System.out.println(word);
//	          
//	      }else if (count>=2) {
//	        
//	             System.out.print(word);
//	          for (int x=1 ; count>x; x++ ) {
//	             System.out.print(separator+word );
	        
	              
//	          }
//	      }
//	    int h=1;
//		String newWord = "";
//
//	    while (count > h) {
//	    
//	    	if (h < count -1) {
//	    		newWord = word + separator  ;
//	    		System.out.println(newWord);
//	    		h++;
//	    	}else  
//	    		newWord +=   word ;
//	    	System.out.println(newWord);
//	    	h++;
//	    }		
		
		
		
//
//String word = scan.next();
//String separator = scan.next();
//int count = scan.nextInt();
//int x = 0;
//String newWord = "";
//while (x < count) {
//    if (x < count ) {
//        newWord = word + separator;
//        System.out.print(newWord);
//        x++;
//    } else {
//        newWord += word;
//        System.out.print(newWord);
//        x++;
//    }
//}
	

//Given two strings, word and a separator sep, 
//return a big string made of count occurrences of the word, 
//		separated by the separator string.
//Example:
//input: Word
//input: X
//input: 3
//output: WordXWordXWord
//
//Example:
//input: This
//input: And
//input: 2
//output: ThisAndThis
//
//Example:
//input: This
//input: And
//input: 1
//output: This