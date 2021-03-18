package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] players = {"Dhoni", "Zahir", "Ganguly", "Sachin"};
		Arrays.sort(players);
		//System.out.println();
		
		String str = Arrays.toString(players);
		System.out.println(str);
		
		List l = Arrays.asList(players);
		System.out.println(l);
		
		
		
	}

}
