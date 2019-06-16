package day41;

public class Teacher {

	private String name;
	private String specialty;

	// getters and setters
	
	// getter method is just like any other method
	// it's specially for getting the fields value
	// and returning it from the method
	// it accepts no parameter
	
	
	public String getName() {
		return name ;
	}
	
	// setter method is just like any other method
	// it's specifially for setting/updating the field value
	// it accepts one parameter so we can pass the new value
	// and return nothing
	
	public void setName(String newName) {
		name = newName ;
	}
	
	// getter method is just like any other method
	// it's specially for getting the fields value
	// and returning it from the method
	// it accepts no parameter
		
		
	public String getSpecialty() {
		return specialty ;
	}
		
	// setter method is just like any other method
	// it's specifially for setting/updating the field value
	// it accepts one parameter so we can pass the new value
	// and return nothing
		
	public void setSpecialty(String newSpecialty) {
		specialty = newSpecialty ;
	}
}
