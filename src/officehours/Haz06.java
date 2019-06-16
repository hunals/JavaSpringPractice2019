package officehours;

public class Haz06 {

	//static int count;
	public static void main(String[] args) {	
		/* length
		 * trim
		 * toLowerCase
		 * toUpperCase
		 * equals
		 * ignoreCase
		 * contains// return true or false
		 * substring
		 * charAt
		 * replace
		 * indexOf
		 * lastIndexOf
		 * isEmpty
		 * startsWith
		 * endsWith
		 * concat and +
		 * split
		 * toCharArray
		 * 
		 * */		
//		String  s="   Java is java as you know java    ";
//		int a=s.length();
//		s.trim();
//		//s=s.trim();
//		String b=s.trim();
//		
//		System.out.println(s.toUpperCase());
//		String a="JaVa";
//		String b="jaVA";
//		System.out.println(a.equalsIgnoreCase(b));
		//Task: how many java words does s contains.
		//1. way:
//		String str="java";
//		int count=0;// local variable need to be initialize;
//		for (int i=0;i<s.length()-4;i++) { //i=s.length()-1
//			s.substring(0,4).equals(str);// I miss 1,5
//			s.substring(1,5).equals(str);
//			s.substring(2,6).equals(str);
//			if(s.substring(i,i+4).equalsIgnoreCase(str))
//			   count++;
//		}
//		System.out.println("java exist :"+count);//3 or not
			
//		String  s="   Java is java as you know java    ";
//      String str="java";
//      //2. way
//      String a=s.toLowerCase();
//      a=a.replace(str, "");
//      System.out.println(a+ " "+a.length());
//      System.out.println(s+ " "+s.length());      
//		System.out.println((s.length()-a.length())/4);//3 or not

		 //3. way
//        String[] arr=s.trim().split(" ");
//        for  (int i=0;i<arr.length;i++) {
//            //System.out.print(arr[i]+" ");
//            if(arr[i].equalsIgnoreCase(str))
//                count++;
//        }
//        System.out.println(count);
        
        
        
        String  s="   Java is java as you know java    ";
      //task change second "java" to c++
        int count=0;
        String str="java";
        String[] arr=s.trim().split(" ");
        for  (int i=0;i<arr.length;i++) {
            if(arr[i].equalsIgnoreCase(str))
                count++;
            if (count==2) {
                arr[i]="c++";
            break;
            }
        }
        for  (int j=0;j<arr.length;j++)
        System.out.print(arr[j]+" ");
        
        
        
        String s5="java";
        String s6="java ";
        String s7="ja".concat("va");
        String s8="ja"+"va";
        System.out.println(s5==s8);
        //System.out.println(s5==s6.trim()); //false because we used method
        
        
        
	}

}
