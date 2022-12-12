package hashmap;

import java.util.*;

public class linked_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<String,Integer>map = new LinkedHashMap<>();
		
		map.put("raj", 98);
		map.put("abc", 95);
		map.put("xyz", 93);
		map.put("qbc", 56);	
		map.put("bqc", 34);
		map.put("dba", 78);
		map.put("sdvsd", 98);
		map.put("sdj", 76);
		System.out.println(map);
		//inserion order is preserved
		//implemented using doubly linked list

	}

}
