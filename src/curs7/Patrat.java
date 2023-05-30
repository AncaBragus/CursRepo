package curs7;

public class Patrat extends Shape{

	// constructorul nu se mosteneste si din acest motiv  il extind eu local
	public Patrat(String nume, String culoare) {
		super(nume, culoare);
	}
		//obiect al clasei patrat
		String nume = "patrat";
		String culoare = "negru";
		
		
		public void printDetails (){
			System.out.println("numele este " + super.nume + " si culoarea este " + super.culoare);
		}
	}


