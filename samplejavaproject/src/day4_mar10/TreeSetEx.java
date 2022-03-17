package day4_mar10;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> str = new TreeSet<String>();
		str.add("java");
		str.add("java");
		str.add("1");
		str.add("c");
		str.add("python");
		str.add("oracle");
		str.add("2");
		str.add("spring");
		System.out.println(str);
	} // O/p is in ascending order 
	  // duplicates and null values are not allowed.

}
