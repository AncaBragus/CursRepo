package curs10;

import java.util.HashSet;

public class FindDupplicateInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myStrArray = {"Ana", "Maria","Ion", "Ana","Oana","Ion"};
		//index
		for (int i =0; i<myStrArray.length; i++){
			for (int j=i+1; j<myStrArray.length; j++){
				if (myStrArray[i].equals(myStrArray[j])){
					System.out.println("duplicat " + myStrArray[i]);
				}
			}
		}
	}
	
	/*8public static Set<String> gasesteDuplicate(String[] array){
		Set<String> numeDuplicat = new HashSet<E>();
		 for (int i =0; i<myStrArray.le)
	}
	*/

}
