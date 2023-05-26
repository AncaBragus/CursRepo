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
	static int[] numbers ={1,3,5,7,8,9,2,12};
	
	public static void main(String[] args) {
			System.out.println("-----FOR");
			solFor(8);
			System.out.println("-----FOR EACH");
			rezolvareCuForEach(8);
			System.out.println("-----While");
			rezolvareCuWhile(8);
			System.out.println("-----DO WHile");
			rezolvareCuDoWhile(8);	
	}
	
	public static void solFor(int number){
		for (int i =0 ; i < numbers.length; i++ ){
			if (numbers[i] == number){
				System.out.println("Index pentru " + number + " este "+ i);
			}
		}
	}
	public static void rezolvareCuForEach(int number) {
		int i =0;
		for(int element : numbers) {
			if(number == element) {
				System.out.println("Index pentru " + element + " este " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuWhile(int number) {
		int i = 0;
		while(i < numbers.length) {
			if(numbers[i]== number) {
				System.out.println("Index pentru " + number + " este " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuDoWhile(int number) {
		
		int i = 0;
		do {
			if(numbers[i]== number) {
				System.out.println("Index pentru " + number + " este " + i);
			}
			i++;
		}while(i < numbers.length);		
		
	}

}