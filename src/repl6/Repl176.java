package repl6;

	import java.util.ArrayList;
	public class Repl176 {


		public static ArrayList<Integer> test()
		{
			//write code here
			ArrayList<Integer> test = new ArrayList<>();
			
			  return test;
		}
	}


/*

ArrayList, diziye benzer bir nesne koleksiyonudur. Ancak, 
nasıl çalıştıkları konusunda dikkate değer farklılıklar:
Bir ArrayList'in boyutu değiştirilebilir
ArrayLists ile kolayca eleman ekleyebilir, ekleyebilir ve silebilirsiniz
Sadece nesnelerin ArrayLists'ine sahip olabilirsiniz! 
(int / double / boolean ilkel veri türleridir)

ÖNEMLİ: Lütfen ilkel veri tiplerini temsil eden 
yeni nesnelerle çalışacağımızı unutmayın:
Tamsayı, int'yi temsil eden bir nesnedir.
Çift, iki katı temsil eden bir nesnedir.
Boolean, bir boole'yi temsil eden bir nesnedir
(Nesnelerin büyük harflerini not edin!)


Write code in the test method that will declare and initialize 
an ArrayList of Integers, then return it as is - empty.

An ArrayList is a collection of objects, similar to an array. 
However, a few notable differences in how they work:
The size of an ArrayList can be changed
You can add, insert, and delete elements easily with ArrayLists
You can only have ArrayLists of objects!  (int/double/boolean are primitive datatypes)

IMPORTANT: Please note that we will be working with new 
objects that represent primitive datatypes:
Integer is an object that represent an int
Double is an object that represents a double
Boolean is an object that represents a boolean
(Note the capital letters for the objects!)

However, unlike arrays, ArrayLists need to be imported 
before they can be used.  The line that we use to do this 
is the following (written outside the class header on line 3):
import java.util.ArrayList;

This allows us to create the ArrayList object.

To declare and initialize an ArrayList, we use the same code as we did to declare objects, except this time, our datatype is ArrayList<Type>:
// create an arraylist of Strings
    ArrayList<String> names = new ArrayList<>();
//  |<------------------->|   |<-------------------->|
//     declaration                 initialization

// create an arraylist of Integers
    ArrayList<Integer> nums = new ArrayList<>();

// create an arraylist of Student objects
    ArrayList<Student> youguys = new ArrayList<>();


*/