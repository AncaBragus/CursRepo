package curs7;

import java.util.Random;

public class RandomNumbersExercise {

	/**
	 * prg care genereaza 6 nr intre 0 si 9 
	 * le pune in array
	 * nu tine numere duplicate
	 * printeaza array
	 * o met care  print array
	 * o met care verifica daca nr sunt duplicate
	 * o met care  genereaza nr
	 */
	public final int LENGTH = 6;
	public final int MAX_NUMBERS=9;
	
	public int[] generateNumbers(){
		int[] numbers= new int[LENGTH];
		Random  random= new  Random();
	
		for (int i=0; i<=LENGTH; i++){
			int randomNR =0;
			do{
			randomNR = random.nextInt(MAX_NUMBERS);
			} while (CheckDuplicate(numbers, randomNR));
			numbers[i]=randomNR;
		}
	return numbers;
	}
	
	public void printArray(){
		for ()
	}
	public boolean CheckDuplicate(int[]array, int nr){
		for (int number:array){
			if(number==nr){
				return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumbersExercise obj =new RandomNumbersExercise();
		obj.printArray(obj.generateNumbers());
	}

}
