package curs7;

public class TestWildAnimal {

	
	public static void main(String[] args) {
		WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("-----------");
		Deer bambi= new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("-----------");
		Lion simba= new Lion();
		simba.makeSound();
		simba.eatMeat();
		
		System.out.println("-----------");
		//WebDriver driver = new CromeDriver(); -> mostenire
		//WAnimal este mostenit de Lion
		//Lion is an WildAnimal
		//Java permite sa fac obj lion de tip WildAnimal, pentru ca Lion is  an WildAnimal mostenit
		//putem avea 
		WildAnimal simba1 =new Lion();
		simba1.makeSound();
		(Lion)simba1.eatMeat(); //trebuie sa fac un cast ; nu e recomandat...
	}

}


