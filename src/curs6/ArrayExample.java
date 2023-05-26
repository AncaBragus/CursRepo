package curs6;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] textArary =new String[5];
		//String[] textArary = {null, null, null, null, null};
		//index: 				 0		1	  2		3		4	
		textArary[1]="Mara";
		textArary[3]="Oana";
		System.out.println(textArary[0]);
		//System.out.println(textArary[3].length()); -> o sa dea eroare pt ca  e null aici
		System.out.println(textArary[1]);
		System.out.println(textArary[3]);
		textArary[3]="Ana";
		System.out.println(textArary[3]);
		System.out.println(textArary[3].length());
		
		//-----------------------
		try{
			System.out.println(textArary[5]);
		}catch (Exception e){
		System.out.println("ai incercat sa accesezi in afara array-ului");
		}
		System.out.println("Alt cod...");
	}

}
