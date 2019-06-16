package day56;

public abstract class Shape {
  
  String color;
  
  
  public Shape(String color) {
    this.color=color;
  }
  
  public abstract  void calculatePerimeter();
  public abstract  double calculateArea();
  @Override
  public abstract String toString(); 
  
  
  
  // THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD 
  
  // --->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT'S DEFINED IN ABSTRACT METHOD
  

}
//
//class Circle extends Shape{
//	
//	double radius;
//
//	public Circle(String color, double radius) {
//		super(color);
//		this.radius = radius;
//	}
//	@Override
//	public void calculatePerimeter() {
//		double c = (2*radius*3.14);
//		System.out.println("calculated Perimeter of circle is " + c);
//	}
//	
//	public double calculateArea() {
//		return radius*radius*3.14;
//	}
//	@Override
//	public String toString() {
//		return "Circle [radius=" + radius + ", color=" + color + "]";
//	}
//	
//	
//	
//}

//class Rectangle extends Shape{
//	
//	double weight;
//	double height;
//	
//	public Rectangle(String color, double weight, double height) {
//		super(color);
//		this.weight = weight;
//		this.height = height;
//	}
//	
//	public double calculatePerimeter() {
//		double c= (weight + height)*2;
//		return c;
//	}
//	
//	public double calculateArea() {
//		double area = (weight * height);
//		return area;
//	}
//
//	@Override
//	public String toString() {
//		return "Rectangle [weight=" + weight + ", height=" + height + ", color=" + color + "]";
//	}
//	
//	
//}


/*
abstract class Shape

	instance filed : 
		color

	1 arg constructor to set the field value 

	abstract methods 

		calculatePerimeter() 
		calculateArea()  
		abstract toString() method accpet no param , return String 

sub classes 

	Circle 
		radius as double 

	2 args constructor to set the field values 

	implement abstract methods from super class 

	Perimeter for


	Rectangle 
		
		protected instance fields   width , height 

		3 args constructor to set the field values 
		implement abstract methods from super class 

	create a main method in rectangle and 
		create 1 Circle and 1 Rectangle object 
		call their methods 

*/