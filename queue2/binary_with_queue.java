package queue2;
import java.util.*;

public class binary_with_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		
		generates(n);

	}

	private static void generates(int n) {
		// TODO Auto-generated method stub
		Queue<String>q= new LinkedList<>();
		
		q.add("1");
		
		while(n-- > 0) {
			String s1= q.remove();
			
			System.out.println(s1);
			
			q.add(s1+"0");
			q.add(s1+"1");
		}
		
		
		
	}

}
