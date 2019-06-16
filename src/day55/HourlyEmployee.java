package day55;

public  class HourlyEmployee extends Employee{

//	int id;

//	String name;

	private int monthlyHourWorked; 

	private int hourlyRate;

	

	public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {

		super(id,name);

		this.monthlyHourWorked = monthlyHourWorked;

		this.hourlyRate = hourlyRate;

	}



	@Override

	public boolean isIn100KClub() {

		int annual = monthlyHourWorked * hourlyRate * 12;

		return annual>100000;

	} 



	public int getMonthlyHourWorked() {

		return monthlyHourWorked;

	}



	public void setMonthlyHourWorked(int monthlyHourWorked) {

		this.monthlyHourWorked = monthlyHourWorked;

	}



	public int getHourlyRate() {

		return hourlyRate;

	}


	public void setHourlyRate(int hourlyRate) {

		this.hourlyRate = hourlyRate;

	}



	@Override

	public String toString() {

		return "HourlyEmployee [monthlyHourWorked=" 

				+ monthlyHourWorked + ", hourlyRate=" 

				+ hourlyRate + ", id=" + getId()

				+ ", name=" + getName() + "]";

	}



	@Override

	public void calculateAnnualSalary() {

	

		int annual = monthlyHourWorked * hourlyRate * 12;

		System.out.println("the salary is : "+ annual);
	

	}
	

}

/*
HourlyEmployee class 

	private instance fields 
		id 
		name
		MonthlyHourWorked
		hourlyRate

	constructor to set all 
	add getters and setters 
	add toString method 

  method 
	calculateAnualSalary()

SalariedEmployee

private instance fields 
		id 
		name
		monthlySalary 
 method 
	calculateAnualSalary()
	add getters and setters 
	add toString method 

TASKS : 
	ABSTRACT out an Employee class out of these two classes 
	to make it abstract to provide reusable fields 
	and abstract method to provide the idea rather than implementation detail 

*/