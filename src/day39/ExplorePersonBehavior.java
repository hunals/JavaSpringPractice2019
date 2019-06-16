package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.age = 19 ;
		p.gender = 'F' ;
		p.name = "Elif Derya Kubra";
		
		Person g = new Person();
		g.age = 19 ;
		g.gender = 'F' ;
		g.name = "Gulay";
		
		p.eat() ;		
		p.tellMeYourName();
		p.printPersonInfo();
		
		
		p.eat() ;	
		g.tellMeYourName();	
		g.printPersonInfo(); 
	}

}


/*
package day39;

public class ExplorePersonBehavior {

  public static void main(String[] args) {
    
    
    Person p = new Person(); 
    p.age = 19; 
    p.gender = 'M'; 
    p.name = "Abdul Khan"; 
    
    Person g = new Person(); 
    g.age = 19; 
    g.gender = 'F'; 
    g.name = "Alina"; 
    
    p.eat();
    p.tellMeYourName();
    
    g.eat();
    g.tellMeYourName();
    
    

  }

}

*/