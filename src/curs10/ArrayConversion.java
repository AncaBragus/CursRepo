package curs10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {0,1,2,3,4,5};
		List<Integer> list = new ArayList<Integer>(Arrays.asList(intArray));
		for( Integer num :list){
			System.out.println(num);
		}
		System.out.println("-----------");
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(intArray));
	}

}
