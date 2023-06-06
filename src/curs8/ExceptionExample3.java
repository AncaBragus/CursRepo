package curs8;

public class ExceptionExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String nume=null ; //"Ion";
	System.out.println(nume.length());
	
}catch(Exception e){
	System.out.println("Exception occured");
}finally {
	System.out.println("Finally block of code - always executed");
}
	}

}
