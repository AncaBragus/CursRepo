package curs7;

public class TestShape {

	public static void main(String[] args) {
		Patrat patrat = new Patrat("Cerc" , "Galben");
		System.out.println(patrat.nume); // print obj clasei patrat
		System.out.println(patrat.culoare); //print obj clasei patrat
		
		patrat.printDetails();//print obj clasei Shape (cls parinte) pt ca are referinta super in fata variabilelor

	}

}
