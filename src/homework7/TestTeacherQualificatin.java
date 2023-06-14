package homework7;

public class TestTeacherQualificatin {
	
	public static void main(String[] args) {
		Qualification qual = new Qualification("Java",4,"Afternoon");
		//Qualification qual = new Qualification("Java",4,"Morning");
		//Qualification qual = new Qualification("PL/SQL",4,"Morning");
		qual.verify();
	}
	
	
}
