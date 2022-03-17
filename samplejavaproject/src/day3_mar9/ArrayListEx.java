package day3_mar9;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add("Java");
		data.add(567);
		data.add("Python");
		data.add(220);
		data.add("Collections");
		//System.out.println(data);
		ListIterator itr = data.listIterator();
        while(itr.hasNext()) {
        	Object obj = itr.next();
        	if(obj instanceof Integer)
        	    System.out.println(obj);
        }
	}

}
