package repl5;

import java.util.Arrays;
import java.util.Scanner;

public class Repl127 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    String[] words = str.split(", ");
		    String shortest = words[0];

		    
		    for(String s: words){
		      if(shortest.length()>s.length()){
		        shortest = s;
		      }
		    }
		int counter = 0;
		for (String s : words) {
			if(shortest.length()==s.length()) {
				counter++ ;
			}
		}
		String[] shortWords = new String[counter] ;
		for (int i = 0, j=0 ; i < words.length; i++) {
			if(shortest.length()==words[i].length()) {
				shortWords[j]=words[i];
				j++;
			}
		}
		Arrays.sort(shortWords);
		System.out.println(Arrays.toString(shortWords));
	}

}



/*
 
   String s="";
   String[] y=str.split(", ");
   String min=y[0];
   for (String i:y)
     if(i.length()<min.length())
       min=i;
   for (String i:y)
     if(i.length()==min.length())
       s=s+i+" ";
   String[] x=s.split(" ");
   Arrays.sort(x);
   System.out.print(Arrays.toString(x)); 
  
 




Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String[] words = str.split(", ");
String shortest = words[0];
for(String s: shortest){
  if(shortest.length()>s.length()){
    shortest = s;
  }
}
int counter = 0;
 for(String s: shortest){
  if(shortest.length() == s.length()){
    counter++;
  }
}
String[] shortWords = new String[counter];
for(int i=0, j =0 ; i < words.length; i++){
 if(shortest.length()==words[i].length()){
    shortWords[j]=words[i];
    j++;
 }
}
System.out.println(Arrays.);




Write a program that will find out shortest words in the given string str. 
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings. 
Print array with Arrays.toString() method. Sort array before printing. 
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]

*/