package day55;

public abstract class AbstractClassWithNoAbstractMethod {
	/*

	 * ABSTRACT METHOD MUST BE IN ABSTRACT CLASS 

	 * 

	 * HOWEVER 

	 * A ABSRACT CLASS DOES NOT HAVE TO HAVE ABSTRACT METHOD 

	 * 

	 * 

	 * THE ONLY EFFECT OF MAKING THIS ABSTRACT AT THIS MOMENT 

	 * IS TO PREVENT OBJECT IS BEING CREATED OUT OF THIS CLASS

	 * 

	 * */ 

	

	public static void main(String[] args) {

		

		

		AbstractClassWithNoAbstractMethod obj = 

				new AbstractClassWithNoAbstractMethod() ; 

	}

	

	

}
