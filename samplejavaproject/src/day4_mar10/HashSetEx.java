package day4_mar10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("Java");
		set.add("aaa");     // duplicates not allowed
		set.add("python");
		set.add("oracle");
		set.add(null);      // null values allowed
		System.out.println(set);
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}      // o/p is in random order

}
