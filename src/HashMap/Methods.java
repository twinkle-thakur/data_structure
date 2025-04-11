package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Methods {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	map.put(2,"twinkle");
	map.put(4,"om");
	map.put(5,"bob");
	map.put(2, null);
	//map.remove(2);
	//System.out.println(map);
//	for(int i:map.keySet()) {
//		System.out.println(i+"="+map.get(i));
//	}
	
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for(Entry<Integer, String> entries:entrySet) {
		//System.out.println(entries.getKey()+" "+entries.getValue());
		//or
		System.out.println(entries);
	}
	
}
}
