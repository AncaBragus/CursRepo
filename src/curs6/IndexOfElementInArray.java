package curs6;

public class IndexOfElementInArray {

	/**
	 * avem un array si vrem sa gasim indexul acelui element
	 * rezolvam cu
	 * for
	 * for each
	 * while
	 * do while
	 */
	static int[] numbers ={1,3,5,7,8,9};
	public static void main(String[] args) {
		
	}
	
	public static void solFor(int number){
		for (int i =0 ; i < numbers.length; i++ ){
			if (numbers[i] == number){
				System.out.println("Index pentru " + number + " este "+ i);
			}
		}
	}

}
