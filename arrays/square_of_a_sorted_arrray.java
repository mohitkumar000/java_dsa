package arrays;
import java.util.*;

public class square_of_a_sorted_arrray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int [] res = new int[arr.length];
		int final_ans = res.length-1;
		
		int start = 0;
		int end = arr.length-1;
		while(final_ans>=0)
		{
			if(Math.abs(arr[start])>Math.abs(arr[end]))
			{
				res[final_ans]= arr[start]*arr[start];
				start++;
			}
			else
			{
				res[final_ans] =arr[end]*arr[end];
				end--;
				
			}
			final_ans--;
		}
		
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
	

}
