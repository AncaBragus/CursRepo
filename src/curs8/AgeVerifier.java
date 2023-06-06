package curs8;

public class AgeVerifier {

	public void checkAgeLimit(int age){
		
		if (age<18){
			throw new InvalidAgeException("Invalid age to proceed!"); 
		}else{
			System.out.println("You are allowed");
		}
	}
	
	
}
