package repl6;

public class Repl210 {

	public static void main(String[] args) {
	    System.out.println("Hello world!");
	  }
}

public class CameraPhone extends Phone{
	  
	int memorySize;
	int imageSize;
	
	public CameraPhone(int memorySize, int imageSize) {
		super();
		this.memorySize = memorySize;
		this.imageSize = imageSize;
	}
	
	public int numPictures() {
		return (memorySize *1000) / imageSize ;
	}
	
	
	
}

public class Phone{
	  
}



/*
Assume the existence of a Phone class that is a super class 
for CameraPhone class. 
Define a subclass, CameraPhone that contains two instance 
variables: an integer named, imageSize, representing 
the size in megapixels (for simplicity assume a pixel 
takes up one byte-- thus megapixels equals megabytes) 
of each picture (i.e., 2 means each image is composed 
of 2 megapixels), and an integer named memorySize, 
representing the number of gigabytes in the camera's 
memory (i.e., 4 means 4 Gigabytes of memory). 
There is a constructor that accepts two integer parameters 
corresponding to the above two instance variables and which 
are used to initialize the respective instance variables. 
There is also a method named numPictures that returns 
(as an integer) the number of pictures the camera's 
memory can hold. Don't forget that a gigabyte is 1,000 megabytes.

*/