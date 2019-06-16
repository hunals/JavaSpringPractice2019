package officehours;

import java.util.ArrayList;

public class May20 {

	    public static void main(String[] args) {
	       // Task: given an email and saparete name, company, and extension
	        
	        
	    String mail="spartan@cybertek.com";
	    int a=mail.indexOf("@");
	    int d=mail.indexOf(".");
	    
	    ArrayList<String> list1=new ArrayList<>();
	    String name=mail.substring(0,a);
	    String company=mail.substring(a+1,d);
	    String extension=mail.substring(d+1);
	    list1.add(name);
	    list1.add(company);
	    list1.add(extension);
	    //System.out.println(list1);
	    
	    String mail1="horse@google.com";
	    int a1=mail1.indexOf("@");
	    int d1=mail1.indexOf(".");
	    
	    ArrayList<String> list2=new ArrayList<>();
	    String name1=mail1.substring(0,a1);
	    String company1=mail1.substring(a1+1,d1);
	    String extension1=mail1.substring(d1+1);
	    list2.add(name1);
	    list2.add(company1);
	    list2.add(extension1);
	    //System.out.println(list2);
	    
	//  String newMail=list.get(0)+"@"+list.get(1)+"."+list.get(2);
	//  System.out.println(newMail);
	    
	    ArrayList<ArrayList<String> > arr=new ArrayList<>();
	    arr.add(list1);
	    arr.add(list2);
	    System.out.println(arr.get(0));
	    System.out.println(arr.get(1));
	    System.out.println(arr);
	    
	    for (int i = 0; i < arr.size(); i++) {
	        System.out.println( arr.get(i).get(0)+"@"+arr.get(i).get(1)+"."+arr.get(i).get(0));
	    }
	
	
	    }
	    
}
