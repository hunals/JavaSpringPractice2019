package repl6;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl174 {

	public static String lameDb(String db, String op,String id,String data){
		 
		String returned = "";
		int h = Integer.parseInt(id); 
		ArrayList<String> datalst = new ArrayList<>(Arrays.asList(db.split("#")));
		String[] sp = db.split("#"); 
		

		if(op.equals("add")) 
			datalst.add(h-1, id + data);
	  	if(op.equals("edit")) 
	  		datalst.set(h-1, id+data);
	  	if(op.equals("delete")) 
	  		datalst.remove(h-1);

		for (int i = 0; i < datalst.size(); i++) 
			returned += "#" + datalst.get(i);

		return returned.substring(1);
	    
	  }
		 
	  
	  
	public static void main(String[] args) {
	    
	     
	System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
	       
	System.out.print(lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
	       
	System.out.print(lameDb("1tst#2bla#3foo","delete","1","")+"\n");
	       
	System.out.print(lameDb("1tst#2bla#3foo","none","1","")+"\n");
	     
	   }
	  
}

/*

class Main {
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
  
  
  
  
  
  
  
  
   public static String lameDb(String db, String op,String id,String data)
  {
    
   if(op.equals("add")){
     db=db+'#'+id+data+"";
   }else if(op.equals("edit")){
    db=db.substring(0,db.indexOf(id)+1)+data+db.substring(db.indexOf(id)+1+data.length())+"";
    }else if(op.equals("delete")){
      db=db.substring(0,db.indexOf(id)-1)+db.substring(db.indexOf(id)+data.length()+1)+"";
    }
    return db;
  
  }//end lameDb
  
   }
  
}



String[] arr=db.split("#");
    String newdb="";
    int num=Integer.parseInt(id);
    if(op.equals("add"))
    newdb=db+"#"+id+data;
    else if(op.equals("edit"))
    {
    arr[num-1]=id+data;
    newdb=arr[0]+arr[1]+arr[2];
    }
    else if(op.equals("delete"))
    {
    arr[num-1]="";
    newdb=arr[0]+arr[1]+arr[2];
    }
    else if(op.equals("none"))
    newdb=db;
  return newdb;


Bir veritabanı (DB), en genel anlamıyla organize bir veri 
topluluğudur. ... Başka bir deyişle, bir veritabanı, 
bir kuruluş tarafından bilgi depolama, yönetme ve alma yöntemi 
olarak kullanılır.
Veritabanlarında veri çalışırken, verileri okuyabilir, 
ekleyebilir, düzenleyebilir, silebilirsiniz.

Lame veritabanı.

Bu yöntem 4 karakter alır ve bir karakter dizisi döndürür.
Bu yöntem çok temel bir veritabanı etkileşimi yaratır.
veritabanına veri ekleyebilir, düzenleyebilir ve kaldırabilirsiniz.
Bütün bunlar sadece String ve string metodlarını kullanarak.
örnek bir veritabanı şöyle görünebilir:
1data # 2moredata # 3yet daha fazla veri

Eğer split ("#") kullanırsak, bir diziye dönüşecektir.

Bir veritabanı tablosu olarak şöyle görünecek:
1data
2moredata
3yet daha fazla veri

Her satır yukarıdaki örnekte bir numara kimliğine (1, 2, 3) sahiptir.
her veri satırı # ile ayrılır
Her satırdaki veriler kimlik doğrulamasından hemen sonra

parametreler:

String db: tüm topal veritabanını bir dizge olarak tutar. 
İstenen işleme bağlı olarak bu parametre değerini değiştireceksiniz

Dize op: op işlem için kısa, yöntemin veritabanında yapacağı işlem
3 var: ekle, düzenle ve sil. Başka bir işlem için, 
veritabanını olduğu gibi döndürün.

String id: işlemek istediğimiz veritabanı satırının kimliğini 
tutar, kimliği bulmak için kimliği kullanırız.
veritabanı satırını değiştirmek istiyoruz

String data: ekleme veya düzenleme işlemleri için kullanacağımız 
veri dizisini tutar




A database (DB), in the most general sense, is an organized 
collection of data. ... In other words, a database is used 
by an organization as a method of storing, managing and 
retrieving information. 
When you work data in databases, you can read, add, edit, 
delete data.

Lame database.

This method gets 4 strings and returns a string.
This method creates a very basic database interaction.
you can add, edit and remove data from the database.
all this using only String and string methods.
an example database may look like this:
1data#2moredata#3yet more data

if we use split("#") it will turn into an array.

as a database table it will look like this:
1data
2moredata
3yet more data

each row has a number id (1, 2 ,3) in above example.
each row of data is separated by #
data in each row is right after id

parameters:

String db : holds the whole lame database as a string. You will 
modify this parameter value depending on operation requested

String op : op is short for operation, the operation the method 
will do on the database,
there are 3 : add, edit and delete. For any other operation, 
return the database as is.

String id : holds the id of the database row we want to manipulate, 
we use the id to find the 
database row we want to manipulate

String data : holds a string of data we will use for the add or 
edit operations

example use of the method:

m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa
(since operation is 'add', we added '#4aaa' to the end and return)

m.lameDb("1test#2bla#3foo","edit","2","bbb")
returns:  1test#2bbb#3foo
(since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)


m.lameDb("1tst#2bla#3foo","delete","1","")
returns:  #2bla#3foo

m.lameDb("1tst#2bla#3foo","none","1","")
returns:  1tst#2bla#3foo







 */


