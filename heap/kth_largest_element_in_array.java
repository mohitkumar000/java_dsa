package heap;
import java.util.*;

public class kth_largest_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,3,1,2,4,5,5,6};
		int k =4;
		//PriorityQueue<Integer>pq = new PriorityQueue<>();//min heap
		
		// max heap PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
		
		System.out.println(kth_largest(arr,k));

	}
	public static int kth_largest(int [] arr,int k)
	{
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		for(int i =0;i<k;i++)
		{
			pq.add(arr[i]);
			
		}
		for(int i =k;i<arr.length;i++)
		{
			if(arr[i]>pq.peek())
			{
				pq.remove();
				pq.add(arr[i]);
			}
			
			
		}
		return pq.peek();
	}

}
