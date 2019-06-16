package day50;


//What we can have inside one Class 
	Also see -- Tuesday notes 


//Inheritance 
	
	a class can use fields and methods from another class 
	by extending it, instead of creating everything from scracth 

	IS-A Relationship 
		Student IS-A Person 
		LocalStudent IS-A Student 
		Car - Vehicle 

	What keyword to build relationship 
			public class Student extends Person{

			}

	How many class a class can extends directly 
		a class can only extend one another class directlt 
		BAD : 
		public class Student extends Person, Human, Robot{} 


	Child--> Parent--> GrandParent--> Object (class)
	
	Child c1 = new Child() ; 
	c1.everyVisibleFieldsAndMethod.....


	What's inherited from super class 
		All visible fields / methods from super class 
		Constructor IS NOT INHERITED 	

	Visibility : 
		private : ----> in same class 
		default : ----> same package 
		protected: ---> same package+sub classes outside package
		public : -----> everywhere 


	Constructor : 
		how can we call other constructors of same class
			this(arg...) 
				 it has to be first statement 
				 it can only be called once 
				 recursive calls should be avoided 
				 	-- you call me , i call you --compiler error

		how can we call super class constructor 
			super(arg...)
				 it has to be first statement 
				 it can only be called once
				 if no constructor call is made already 
				 	super() will be inserted in first line 
				 super() and this() can not show up together 
				 	in same constructor 
				 CAN NOT CALL A CONSTUCTOR that we dont have 


	super(args..)