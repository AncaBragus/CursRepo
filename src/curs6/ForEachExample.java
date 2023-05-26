package curs6;
//import java.util.Arrays;
public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] orase = {"Iasi","Cluj","Bran","Pitesti","Ploiesti","Cluj"}; // permite duplicate
		System.out.println(orase[1]);
		
		for (int i=0; i<orase.length; i++){
			System.out.println(orase[i]);
		}
		System.out.println("------------parcurge lista cu for each care nu foloseste index");
		
		for(String element:orase){
			System.out.println(element);
			//System.out.println(Arrays.toString(orase));
		}
			
	}

}
