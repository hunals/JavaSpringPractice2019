package officehours;

import java.util.Arrays;

public class May6 {

	  public static int[] mergR(int[] a,int[] b) {
	    //we need to create an array 
	    //that is capable to handle values from both arrays a and b
	    //( a--> [1,2,3], b--> [4,5,6])
	    // c[] --> [0,0,0,0,0,0]
	    int[] c = new int[a.length+b.length];
	    //this index we gonna use to set values in the new arrray
	    int index =0;
	   for(int j=0;j<a.length;j++){
	    // 1st iteration --> [1,0,0,0,0,0]
	     // 2nd iteration --> [1,2,0,0,0,0]
	      // 3rd iteration --> [1,2,3,0,0,0]
	     c[index]=a[j];
	     index++;
	   }
	   for(int i=0; i<b.length;i++){
	     //index = 3 
	      // 1st iteration --> [1,2,3,4,0,0]
	     // 2nd iteration --> [1,2,3,5,4,0]
	      // 3rd iteration --> [1,2,3,4,5,6]
	     c[index] = b[i];
	      index++;
	   }
	   return c;
	    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
	   
		  
		  
	  }
		} 
		  
		  
		  /*
		  
		  
			  public static String lameDb(String db, String op,String id,String data)
			  {
			    //this tring we will use to store result
			    String output = "";
			    //we are creating an array of strings with records
			    // before; 1etsy#2wooden#3spoon
			    // after: {"1etsy", "2wooden", "3spoon"}
			    String[] values = db.split("#");
			    if(op.equalsIgnoreCase("add")){
			      // 1etsy#2wooden#3spoon+#+4+aaa
			      output = db + "#"+id+data;
			    }else if(op.equalsIgnoreCase("delete")){
			      for(String str: values){
			        // {"1etsy", "2wooden", "3spoon"}
			        //we gonna skip record that we want to delete
			          if(!str.startsWith(id)){
			            output+=str+"#";
			          }
			        
			      }
			    }else if(op.equalsIgnoreCase("edit")){
			       for(String str: values){
			        // {"1etsy", "2wooden", "3spoon"}
			        //we gonna modify record based on id
			          if(str.startsWith(id)){
			            output+=id+data+"#";
			          }else{
			            output+=str+"#";
			          }
			        
			      }
			    }else{
			      //for none operation
			      output = db;
			    }
			    //replcaAll takes regex (regular expression)
			    //regex - it's a pattern
			    // #$ mean if string ends with #, replcae it with empty string
			    return output.replaceAll("#$","");
			  }//end lameDb
			  
			  
			   public static void main(String[] args) 
			   {
			    
			     
			     System.out.print(
			       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
			       );
			       
			      System.out.print(
			       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
			       );
			       
			      System.out.print(
			       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
			       );
			       
			        System.out.print(
			       lameDb("1tst#2bla#3foo","none","1","")+"\n"
			       );
			     
			   }
			  
			}
	
	
	*/