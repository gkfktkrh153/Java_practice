package kosa.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		
		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");
		
		// Map -> Set -> Iterator
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = iter.next();
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
		
		
		// Key, Value

		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			
		}
		
		// values
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println("value : " + value);
		}
	}

}
