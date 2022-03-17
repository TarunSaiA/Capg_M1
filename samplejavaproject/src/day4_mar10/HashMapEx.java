package day4_mar10;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		data.put("arjun", 12345);
		data.put("tarun", 465465);
		data.put("sk", 535435);
		data.put("lucky", 2435435);
		System.out.println(data);
		
		System.out.println(data.get("tarun"));
		
		Set set = data.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Integer> entry = (Entry<String, Integer>) itr.next();
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		
		
	}

}
