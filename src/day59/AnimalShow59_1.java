package day59;

import day57.*;
import day58.*;

public class AnimalShow59_1 {

	public static void main(String[] args) {


		// Cat is a Cat
		Cat c1 = new Cat();
		// copying the address stored inside to same c1
		// into c2 variable , and it's pointing to same object
		Cat c2 = c1;
		
//		c1 = new Dog(); // buda dogru degil cunku c1 cat dog ile bagi yok
		
		Animal a1 = c1;
		// Can a1 point to different animal object
		a1 = new Dog();
		
		IndoorPet i1 = c1;
		
		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		
		myAnimal = new Cat();
		myAnimal.makeNoise();
		
		myAnimal = new Horse();
		myAnimal.makeNoise();
		
		
		
		// WebDriver is an interface that we created
		//Chromdriver is a class that implement WebDriver
		
		WebDriver driver = new ChromeDriver();
		driver.navigateTo("google");
		
		// FirefoxDriver is a class that implement WebDriver
		
		/*
		 * driver = new FirefoxDriver();
		 * driver.navigateTo("google");
		 * 
		 * */
		
		
		
		
		
		
		// this is creating object 
		// without storing the address of the object
		// and just using it once -- like calling method as below
		
		// this object is not accesible after this line
		// because we did not write down the address
//		new Dog().makeNoise();
		
		
		
		
	}

}

/*
package day59;

import day57.ChromeDriver;
import day57.WebDriver;
import day58.*;

public class AnimalShow59_1 {

  public static void main(String[] args) {
    
    
    Animal myAnimal = new Dog(); 
    myAnimal.makeNoise();
    
    myAnimal = new Cat(); 
    myAnimal.makeNoise();
    
    myAnimal = new Horse(); 
    myAnimal.makeNoise();
    
    
    // WebDriver is an interface that we created 
    // ChromeDriver is a class that implement WebDriver 
    
    WebDriver driver = new ChromeDriver(); 
    driver.navigateTo("google");
    
    // FirefoxDriver is a class that implement WebDriver 
    
    /*
     * driver = new FirefoxDriver(); 
     * driver.navigateTo("google");
    
     * *
    
    
    
    // this is creating object
    // without storing the address of the object 
    // and just using it once -- like calling method as below
    
    // this object is not accessible after this line
      // because we did not write down the address
  //  new Dog().makeNoise();
    
    
    

  }

}

*/