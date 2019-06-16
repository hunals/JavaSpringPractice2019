package officehours;

import java.util.ArrayList;
import java.util.List;

public class Haz06_2 {

	public static void main(String[] args) {
		
		 //task: mail: spartan@gmail.com; 
        //name:spartan
        //compony: gmail
        //extension:vom
    
    String mail="spartan@gmail.com";
    
    showMail(mail);
            
        
    }
    static void showMail(String s) {
    List<String> mailList=new ArrayList();
    String name=s.substring(0,s.indexOf("@"));
    //System.out.println(name);
    String Campony=s.substring(s.indexOf("@")+1,s.indexOf("."));
    //System.out.println(Campony);
    String extension=s.substring(s.indexOf(".")+1);
    //System.out.println(extension);
    mailList.add(name);
    mailList.add(Campony);
    mailList.add(extension);
    System.out.println(mailList);
    List<List<String>> allMail=new ArrayList();
    allMail.add(mailList);
    allMail.add(mailList);
    System.out.println(allMail);
    
    
    

	}
}

/*
STRING
>LENGTH
	> String word    ="My name is Ali";
	> lengthOfword   =word.length();

>UPPER-LOWERCASE
	> String word="Hello";
	> String w1 = word.toUpperCase(); //w1="HELLO"
	> String w2 = word.toLowerCase(); //W2="hello"
>IGNORE CASE 
	> String word="Hi";
	> boolean b=word.equals("Hi"); // b=true
	> boolean b=word.equals("hi"); // b=false
	> boolean b=word.equalsIgnoreCase("hi"); // b=true
	> String name="Hi";
	  boolean b=word.equals(name); // b=true

>CHAR
	               01234
	> String word="Hello";
	> char c1=word.charAt(0);//c1='H'
	> char c2=word.charAt(4);//c2='o'
	> char c3=word.charAt(20);// error
	> char lastCharOfWord =word.charAt(lengthOfWord-1);

>CONTAINS
	> String word="Hello";
	> boolean b1=word.contains("He");//->true
	> boolean b2=word.contains("abc");//-<false

>INDEX
				   01234567890
	> String word="how are you"
	> int n1=word.lastIndexOf(" "); //n1=7
	> int n1=word.lastIndexOf("e"); //n1=6
	> int index1=word.indexOf("ou"); //index1=9
	> int index2=word.indexOf("g"); //index2=-1
	> int index2=word.indexOf('o'); //index2=1 possible
	> int index3=word.indexOf("o",3); //index3=9; *it check first "l" starting from index 3.
>SUBSTRING
				  01234
	>String word="hello";
	>String str=word.substring(1,3); //str="el"
	>String str=word.substring(4,45); // error
	>String s=word.substring(1); //s="ello"
	>String s=word.substring(13); //error
>EMPTY OR NOT
	>String word="";
	>boolean b1=word.isEmpty();//b1=true
	>String word="hello";
	>boolean b2=word.isEmpty();//b2=false
>START WİTH ANOTHER STRING
	>String word="Hello";
	>boolean b=word.startWith("He");//b=true
	>boolean b=word.startWith("k");//b=false
>END WİTH ANOTHER STRING
	>String w="hello";
	>boolean b=w.endswith("lo");//b=true
>REMOVE SPACE BEGINNIG ENDING OF STRING
	>String w=" Hello ";
	>string q=w.trim();//q="Hello"
>CONCAT 
	>String w1="Hi";
	>String w2=" Guys";
	>String w=w1.concat(w2);//w="Hi Guys"
>REPLASE OLDCHAR-NEWCHAR
	>String s="Hello";
	>String w=s.replase('o','a');//w=Hella
	if not exist, ignore
	>String w=replace('z','m');//w="Hello" not change
>REPLASE OLDSTRING-NEWSTRING
	>String s="Hello";
	>String w=s.replase("ello","www");//w=Hwww
	>string w=replace("l",'mm');//w="Hemmmmo"
	if not exist, ignore
>OBJECT
	> String s1="Hello"; //S1 is in String pool /in pool only one "Hello"
	> String s2=new String("Hello"); //S1 is in heap / as object many "Hello"
	> (s1==s2) -> false
	> s1=s2; 
	  (s1==s2) ->true // s1 and s2 just have path of "Hello"
	>String m1="Hi";
	 String m2="Hi";
	 (m1==m2) ->ture //m1,m2 in pool and only one "Hi" can be

	>String s1="asd";
	>String s2="asd"; s1 and s2 in same String POOL// So;
	>(s1==s2); true
	>String s3=new String("asd");
	>String s5=new String("asd");
	>(s3==s4);false--->look way,location
	>(s3.equels(s4));true--->look value
*/
