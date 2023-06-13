package curs10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	/** set: unique elements but not ordered 
	 * output:
	   true
		0
		----------
		false
		4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String> set = new HashSet();
			System.out.println(set.isEmpty());
			System.out.println(set.size());
			set.add("mov");
			set.add("alb");
			set.add("rosu");
			set.add("galben");
			System.out.println("----------");
			System.out.println(set.isEmpty());
			System.out.println(set.size());

			for(String element: set){
				System.out.println(element);
			}
			System.out.println("---------- or with Iterator");
			Iterator<String> iterator =set.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
				
			}
			System.out.println("----------remove");
			set.remove("galben");
			for(String element: set){
				System.out.println(element);
			}
			System.out.println("----------contains");
			System.out.println(set.contains("negru"));
			System.out.println(set.contains("rosu"));
			
			System.out.println("----------clear");
			set.clear();
			System.out.println(set.isEmpty());
			System.out.println(set.size());
			
			
	}

}
