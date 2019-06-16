package day13;

import java.util.Scanner;

public class StringClassPractice {

  public static void main(String[] args) {

    /*
     * equals --- str1.equal(str2) --> return boolean result
     * equalsIgnoreCase --- str1.equalsIgnoreCase(str2) --> return boolean
     * result without case checking
     * 
     * toUpperCase ----- s1.toUpperCase() ---> toLowerCase -----
     * s1.toLowerCase() --->
     * 
     * charAt ------- s1.charAt(position of the char)
     * 
     * length ------- s1.length() ; ---> count of the character how do we
     * get last character index of any String s1.length() -1 how do we get
     * first character of any String s1.charAt(0) WHILE COUNTING EACH AND
     * EVERY CHARACTER COUNTS including space or any other special
     * charcaters
     * 
     */

    String s1 = "abc";
    String s2 = "ABC";

    boolean b1 = s1.equals("abc");
    boolean b2 = s1.equals(s2);
    boolean b3 = s1.equalsIgnoreCase(s2);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);

    System.out.println(s1 + " ---uppercase " + s1.toUpperCase());
    System.out.println(s1 + " ---lowercase " + s1.toLowerCase());

    // get a certain character inside a str
    // "abc" ----> a is at position 0 b 1 , c 2
    char c1 = s1.charAt(0); // first character
    char c2 = s1.charAt(1); // second character
    char c3 = s1.charAt(2); // third character

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    // System.out.println( s1.charAt(3) );

    // getting the length of String object

    int countOfCharacter = s1.length();
    System.out.println(s1.length());

    // TASK 1
    /*
     * Ask user for two names check for the equality without caring about
     * the case print result
     * 
     * also compare the length of the names if name1 has more character --->
     * print second character of name1 else print 3rd character of name2
     * 
     * // OPTIONAL store the last character of name 2 in char variable and
     * create switch statement to check few cases as below
     * 
     * case 'a' --> print name ended with a case 'b' --> print name ended
     * with b case 'c' --> print name ended with c if no match print did not
     * get abc
     * 
     */
    Scanner inPut = new Scanner(System.in);
    System.out.println("Enter Name1 :");
    String name1 = inPut.next();
    System.out.println("Enter Name2 :");
    String name2 = inPut.next();

    System.out.println("IS IT SAME name > : " + name1.equalsIgnoreCase(name2));

    int count1 = name1.length();
    int count2 = name2.length();

    if (count1 > count2)
      System.out.println(name1.charAt(1));
    else
      System.out.println(name2.charAt(2));

    // true --> name1.charAt(1) // false: name2.charAt(2)
    // System.out.println( "character is " + ( (count1>count2) ?
    // name1.charAt(1) : name2.charAt(2) ) );

    // what type of data types are supported in switch variable

    // WHOLE NUMBERS within the range of int (byte , short , int )
    // char , String

    /*
     * store the last character of name 2 in char variable and create switch
     * statement to check few cases as below
     * 
     * case 'a' --> print name ended with a case 'b' --> print name ended
     * with b case 'c' --> print name ended with c if no match print did not
     * get abc
     */
    // get the last character
    int lastCharIndex = count1 - 1;
    char lastChar = name1.charAt(lastCharIndex);
    System.out.println("last char of name1 is " + lastChar);

    switch (lastChar) {
      
    case 'a':
      System.out.println("name as ended with a ");
      break;
    case 'b':
      System.out.println("name as ended with b ");
      break;
    case 'c':
      System.out.println("name as ended with c ");
      break;
    default:
      System.out.println("NO MATCH AT ALL ");

    



//public class MoreStringPractice {

  //public static void main(String[] args) {
    
    // s1.contains("something")  ---> check for part of string inside another string
    // s1.indexOf("s")  ---> this will give you position of certain part of the string
    
    String s5 = "Zuhkra" ; 
    boolean uExistsOrNot = s1.contains("u")  ; 
    
    System.out.println(  "does name contains u : " +   s5.contains("u")     );
    
    System.out.println(  "what is the position of u : "  + s5.indexOf("u") );
  }
  }
}
