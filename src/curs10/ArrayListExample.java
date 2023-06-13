package curs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add("Oana");
		list.add("Maria");
		list.add("Carmen");
		list.add("Ion");
		for(String nume: list){
			System.out.println(nume);
		}
		System.out.println("----------");
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println("----------Add");
		list.add(0,"Carmen");
		System.out.println(list.size());
		
		System.out.println("----------IndexOf");
		for(String nume: list){
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		System.out.println("----------Remove");
		list.remove(0);
		list.remove("Ion");
		for(String nume: list){
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		
		//contains
		//clear
	}

}
