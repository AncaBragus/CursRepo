package homework2;

import java.util.Scanner;

public class Score{
	int score ;
	public void askScore(){
		System.out.println("Introduceti punctajul ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		scan.close();
	}
	public void checkScore(){
		askScore();
		if(score < 66){
			System.out.println("Ai picat");
		}else {
			System.out.println("Ai trecut");
		}
}
	public static void main(String[] args) {
		Score obj = new Score();
		obj.checkScore();
	}

}
