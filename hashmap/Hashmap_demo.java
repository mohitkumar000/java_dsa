package hashmap;
import java.util.*;


public class Hashmap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map = new HashMap<>();
		
		map.put("raj", 98);
		map.put("abc", 95);
		map.put("xyz", 93);
		map.put("qbc", 56);	
		map.put("bqc", 34);
		map.put("dba", 78);
		map.put("raj", 98);
		map.put("raj", null);
		System.out.println(map);
		//to get key value
		System.out.println(map.containsKey("raj"));
		System.out.println(map.containsKey("dsvdv"));
		//to print
		//o(1)
		System.out.println(map.get("raj"));
		
		map.keySet();
		
		
		
		

	}

}
