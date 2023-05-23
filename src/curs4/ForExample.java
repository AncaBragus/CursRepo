package curs4;

public class ForExample {

	public static void main(String[] args) {		
		for(int i=0;i<10;i++){
			if(i==5){
				//break;//01234
				continue;//a facut skip iteratie curente: 1234 6789
			}
			System.out.println(i);	
		}
	}

}
