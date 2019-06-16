package day44;

// POJO CLASS
// PLAIN OLD JAVA OBJECT 

/*
 * It has privates fields to represent object's attribute 
 * it has public getters and setters 
 * it has constructors to set all the field value 
 * it has toString method to return String representation of the object 
 *   in nice format with all fields value 
 * 
 * 
 * */

public class House {

  private String type; 
  private int bedroom; 
  private double price;
  
  public House() {
    // TODO Auto-generated constructor stub
  }

  
  public House(String type, int bedroom, double price) {
    this.type = type;
    this.bedroom = bedroom;
    this.price = price;
  }


  public String getType() {
    return type;
  }
//  public void setType(String type) {
//    this.type = type;
//  }
  public int getBedroom() {
    return bedroom;
  }
//  public void setBedroom(int bedroom) {
//    this.bedroom = bedroom;
//  }
  public double getPrice() {
    return price;
  }
//  public void setPrice(double price) {
//    this.price = price;
//  }
  
  public String toString() {
    return "House [type=" + type + ", bedroom=" + bedroom + ", price=" + price + "]";
  } 
  
  
  
  
}