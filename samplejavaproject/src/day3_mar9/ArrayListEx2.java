package day3_mar9;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> itr = new ArrayList<String>();
		itr.add("Java");
		itr.add("Python");
		itr.add(".net");
		
		//for(String str:itr) {
			//System.out.println(str);
	//	}
		itr.forEach((s)->System.out.println(s));
		}

}
