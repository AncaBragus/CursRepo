package curs4;

public class IncrementDecrement {
public static void main(String[] args) {
	/*
	 * nr++    =    nr = nr + 1
	 * post increment --> nr++
	 * pre increment --> ++nr
	 * 
	 */
	System.out.println("--POST increment");
	int num = 10;
	System.out.println("num inainte este " + num);
	System.out.println("POST increment este " + num++);// dupa ce executa linie face increment
	System.out.println("num dupa POST increment esste " + num); //10, 10, 11

	System.out.println("--PRE increment");
	int num1 = 10;
	System.out.println("inainte ete " + num1);
	System.out.println("PRE increment este " + ++num1);
	System.out.println("num dupa POST increment este " + num1); //10, 11, 11


}
}
