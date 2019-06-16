package day35;

public class Ders1 {

	public static String findLongestWord(String...words) {
		
//		String[] names = {"hakan","derya","gulayy","kubbraa"};
		String longestWord = words[0];
		
		for (String name : words) {
			
			if(name.length()>= longestWord.length()) {
				longestWord = name;
			}
		}
		return longestWord;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"hakan","derya","gulayy","kubbraa"};
		
		System.out.println( findLongestWord("hakan","derya","gulayy","kubbraa"));
		System.out.println(  findLongestWord("Odiljan","Talmurat","Sulayman","Marat")   );
	    System.out.println(  findLongestWord("Sumeyye","Hafsa","Emre", "Okan","Omer")   );

	    System.out.println(findLongestWord(names));
	}
	}
	
//	public static void findLongestWord(String...words) {
//		
//		 String longWords =words[0];
//		    for (int i = 0; i < words.length; i++) {
//				
//		       	if(words.length>longWords.length()) {
//		    		longWords = words[i];
//		    	}
//	 
//		    System.out.println(longWords);
//	}
	
	/* Warm up

	Create a static method called findLongestWord
	this method have one parameter as String vararg
	and return the longest word as String
	*/



/*

package day35;

public class WarmUp {

  public static String findLongestWord(String... words) {

    String longestWord = words[0];

    for (String name : words) {
      if (name.length() >= longestWord.length()) {
        longestWord = name;
      }
    }

    return longestWord;
  }

  public static void main(String[] args) {
    /*
     * // Warm up Create a static method called findLongestWord this method have one
     * parameter as String vararg and return the longest word as String
     *
    String[] names = { "abc", "c", "hyght" };
    
  
        
    
    System.out.println(  findLongestWord("Odiljan","Talmurat","Sulayman","Marat")   );
    System.out.println(  findLongestWord("Sumeyye","Hafsa","Emre", "Okan","Omer")   );

    
  }

}


//    for (int i = 0; i < names.length; i++) {
//      
//      if(names[i].length() > longestWord.length() ) {
//        
//        longestWord = names[i];
//        
//      }
//      
//    }

*/