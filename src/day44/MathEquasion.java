package day44;

public class MathEquasion {

	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;
	
	public MathEquasion() {
		System.out.println("no arg");
	}
	
	public MathEquasion(double oprand1, double oprand2, char operator) {
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator;
	}
	
	
	public void calculate() {
		switch (this.operator) {
		case '+':
			result = oprand1+oprand2;
			break;

		case '-':
			result = oprand1-oprand2;
			break;
			
		case '*':
			result = oprand1*oprand2;
			break;
			
		case '/':
			result = oprand1/oprand2;
			break;
			
		default:
			System.out.println("INVALID @@@!!!");
		}
	}
	
	
	public double getOprand1() {
		return oprand1;
	}
	
	public void setOprand1(int oprand1) {
		this.oprand1 = oprand1;
	}
	
	public double getOprand2() {
		return oprand2;
	}
	
	public void setOprand2(int oprand2) {
		this.oprand2 = oprand2;
	}
	
	public double getResult() {
		return result;
	}
	
	public void getOperator(char operator) {
		this.operator = operator;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public String toString() {
	    return "MathEquasion [operand1=" + oprand1 + ", operand2=" + oprand2 + ", result=" + result + ", operator="
	        + operator + "]";
	  } 
	  
	
	
	
}


/*

package day44;

public class MathEquasion {
  
  private double operand1;
  private double operand2;
  private double result;
  private char operator;
  
  public MathEquasion() {
    System.out.println("no arg");
  }

  public MathEquasion(double operand1, double operand2, char operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operator = operator;
  }

  public void calculate() {
    
    switch (this.operator) {

      case '+':
        this.result = this.operand1 + this.operand2;
        break;
      case '-':
        result = operand1 - operand2;
        
        break;
      case '*':
        result = operand1 * operand2;
        
        break;
      case '/':
        result = operand1 / operand2;      
        break;
      
      default: 
        System.out.println("INVALID @@@!!!");
      
    }

    
  }
  


  public double getOperand1() {
    return operand1;
  }
  public void setOperand1(int operand1) {
    this.operand1 = operand1;
  }
  public double getOperand2() {
    return operand2;
  }
  public void setOperand2(int operand2) {
    this.operand2 = operand2;
  }
  public char getOperator() {
    return operator;
  }
  public void setOperator(char operator) {
    this.operator = operator;
  }
  public double getResult() {
    return result;
  }
  
  public String toString() {
    return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 + ", result=" + result + ", operator="
        + operator + "]";
  } 
  
  
  



MathEquation e1 = new MathEquation(12.1,33.2, '-'); 

Create a class called MathEquation 
	add 4 private fields 
		oprand1 , oprand2 , result as double 
		operator as char 

	Encapsulate first 3 fiels 
		with getters and setters
	provide only setter for operator field

	Create no arg constructor 
		just print out message from no Arg 

	create 1 arg constructor 
		set the operator value 

	create 3 args constructor 
		set all 3 fields value 
				: oprand1, oprand2, operator 

	create a void instance method calculate
			with no parameter
		set the result value 
			according to oprand1 oprand2 operator
			if operator is + - * / 
				calculate result 

	Create toString method to return all fields value 


	In main method in another class
	create 4 MathEquation objects 
	and call calculate method 
	and print out the result field value 



*/