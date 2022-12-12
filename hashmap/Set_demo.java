package hashmap;
import java.util.*;

public class Set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s= new LinkedHashSet<>();
		s.add(12);
		s.add(-12);
		s.add(21);
		s.add(34);
		s.add(23);
		s.add(23);
		
		System.out.println(s);
		System.out.println(s.contains(12));
		

	}

}
