package day27;

public class Ders12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String str = "Cybertek Batch Spartan is most hardworking Batch ever";
String[] words = str.split(" ");  
String reversedSentence = "";

for (int j = 0; j < words.length; j++) {
  //System.out.println(words[j]);

  String one = words[j] ; 
  char[] wordChars = one.toCharArray();
  int lastIndex = wordChars.length-1 ; 
  
  for (int i = 0; i < wordChars.length/2; i++) {
    
     char temp = wordChars[i]; 
     wordChars[i] =  wordChars[lastIndex-i] ; 
     wordChars[lastIndex-i] = temp ; 
  }
  // how to change char array to a String 
  String reversed = new String(wordChars);
  
  reversedSentence = reversedSentence + reversed + " " ; 
//  System.out.println(reversed);

}

System.out.println(reversedSentence);

	}
}



//
//String revString="";
//
//for(int k=0;k<cyberTek.length;k++)
//{
//  String word=cyberTek[k];
//  
//  String revWord="";
//  for(int l=word.length()-1;l>=0;l--)
//  {
//    revWord=revWord+word.charAt(l);
//  }
//  revString=revString+revWord+" ";
//}
//System.out.println();
//System.out.println(revString);
//


/*
String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		 String[] str2 = str.split(" ");
		 char[] nameChars = str.toCharArray(); 
		 String store = " ";
			    
//			    for (int i = 0; i < nameChars.length; i++) {
//			    	store = nameChars[i] + "-";
//
//			      System.out.println
//			      (store);
//			      
//			    }
		 for(int k =0 ; k<str2.length; k++) {
			  System.out.print(" "); 
			    
			    for (int j = str2[k].length()-1; j >=0; j--) {
			    	store =store + str2[k].charAt(j);
	    	
 }
			   store += " " ; 
			  
		 }  
		 System.out.print(store);	

*/

