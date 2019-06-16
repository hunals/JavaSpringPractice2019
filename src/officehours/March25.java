package officehours;

public class March25 {
	public static void main(String[] args) {
		String word = "apple";
		String word2 = word.charAt(word.length()-1) + word.substring(1, word.length()-1) + word.charAt(0);
		String word3 = word.substring(word.length()-1) + word.substring(1, word.length()-1) + word.substring(0, 1);

//		System.out.println(word2);
//		System.out.println(word3);
//		System.out.println(word.charAt(word.length()/2));
		
		System.out.println(word.contains(""));
	}

}
