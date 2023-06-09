package curs9;

public class GenericExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDetails(123, true);
		printDetails("Text",'c');
		printDetails(123.5,"text");
	}

	public static <T> void printDetails(T obj, T obj1){
		System.out.println("Data type pt obj "+ obj + " este " + obj.getClass().getName());
		System.out.println("Data type pt obj "+ obj1 + " este " + obj1.getClass().getName());
	}
}
