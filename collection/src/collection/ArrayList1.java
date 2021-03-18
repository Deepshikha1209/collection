package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();//constructor with zero parameter
		
		
		System.out.println(al.add("java"));
		System.out.println(al.add("Angular"));
		System.out.println(al.add("hello"));
		System.out.println(al.add("ok"));
		System.out.println(al.contains("java"));
		System.out.println(al.indexOf("hello"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.remove("ok"));
		System.out.println(al.set(1, "nice"));
		al.add(2, "hi");
		System.out.println(al);
		
		ArrayList al1 = new ArrayList(al);
		System.out.println(al1);
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}
}