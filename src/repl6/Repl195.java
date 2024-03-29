package repl6;

public class Repl195 {
	
		  public static void main(String[] args) {
		   
		   Db db = new Db();
		   db.insertData("aaa",123);
		   
		   
		    System.out.println(db.getData());//aaa
		    System.out.println(db.getYint());//123
		  
		  db.setData("zzz");
		  db.setYint(200);
		  
		  System.out.println(db.getData());//zzz
		    System.out.println(db.getYint());//200
		    
		  }
		}
class Db {
	  
	String data;
	int yint;
	
	  public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	public void insertData(String s, int i) {
		  
		  this.data = s;
		  this.yint = i;
	  }
}


/*
In  Db class we have two attributes/instance variables with the 
private visibility. meaning they cannot be accessed outside of the class.

Instance variables:
   1) name: data -  
       type: String
       Visibility/Access modifier: private
   2) name: yint -  
       type: int
       Visibility/Access modifier: private

Methods:
    - insertData - lets you set the values to above encapsulated instance variables.
    - getData - getter method for private data
    - getYint - getter method for private yint
    - setData - setter method for private data
    - setYint - setter method for private yint



for example:

 Db db = new Db();
 db.insertData("aaa",123);
   
 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123
  
 db.setData("zzz");
 db.setYint(200);
  
 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200

*/