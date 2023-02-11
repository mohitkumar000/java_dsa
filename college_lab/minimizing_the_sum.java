package college_lab;
import java.util.*;

public class minimizing_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int soa = scn.nextInt();
		int[] arr = new int[soa];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int k = scn.nextInt();
		Arrays.sort(arr);
		
		
		for(int i=0;i<k;i++)
		{
			int largest = arr.length-1;
			
			largest = largest/2;
			arr[soa-1]=largest;
			
			
			
		}
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum =arr[i]+sum;
		}
		System.out.println(sum);
				
		
		

	}

}
