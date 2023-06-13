package homework4;
/**
 * sirul lui Fibonacci
Avem o variabila pentru cate numere vrem sa calculam care are val 9
Avem doua numere cu care incepem 0 si 1
Seria se calculeaza: un numar fibonacci este suma a doua numere precedente):
 */

public  class Fibonacci {
	
	public static void fibonacciFor(int n1,int n2, int nr){
		System.out.print(n1+",");
		System.out.print(n2);
		int n3;
		for (int i=1; i<=nr-2; i++){
			n3=n1+n2;
			System.out.print("," + n3 );
			n1=n2;
			n2=n3;
			}	
	}
	public static void fibonacciWhile(int n1, int n2, int nr){
		System.out.print(n1+",");
		System.out.print(n2);
		int n3;	
		int i=1;
		while(i<=nr-2){
			n3=n1+n2;
			System.out.print("," + n3 );
			n1=n2;
			n2=n3;
			i++;
		}
	}
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21
		final int nr = 9;
		int n1= 0;
		int n2=1;
		fibonacciFor(n1,n2,nr);
		System.out.println();
		fibonacciWhile(n1,n2,nr);
		}

	}

