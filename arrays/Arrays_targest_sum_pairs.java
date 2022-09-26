 package arrays;
import java.util.*;

public class Arrays_targest_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int sum = scn.nextInt();
		Arrays.sort(arr);
		
		
		
		int left =0;
		int right =arr.length-1;
		while(left<right)
		{
			if(arr[left]+arr[right]<sum)
			{
				left++;
				
			}
			else if(arr[left]+arr[right]>sum)
			{
				right--;
			}
			else
			{
			System.out.println(arr[left]+" "+"and"+" "+arr[right]);
			left++;
			right--;
			}
			
			
		}
		
		
		
		
	}

}
