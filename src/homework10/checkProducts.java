package homework10;

import java.util.ArrayList;
import java.util.List;

public class checkProducts {
/**
 * Considerand cele doua ArrayList de mai jos :
Primul contine : Product1 ; Product2 ; Product3 ; Product4 ; Product5
Al doilea contine : Product1 ; Product2 ; Product6 ; Product4 ; Product8

- Avem nevoie sa verificam daca produsele din primul arraylist se afla si in al
doilea arrayList
- Rezultatul verificarii ar trebui sa fie un output de tip yes/no
	[Yes,Yes, No, Yes, No]
 */
	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		List<String> list2 = new ArrayList();
		List<String> rez = new ArrayList();
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		for(String prod: list1){
			if (list2.contains(prod)){
				rez.add("Yes");
			}else {
				rez.add("No");
			}	
		}
		System.out.println(rez);
	}

}
