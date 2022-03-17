package day4_mar10;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("aaa");
		list.add("python");
		System.out.println(list);
		list.addFirst("first");
		list.addLast("last");
		list.forEach((l)->System.out.println(l));

	}

}
