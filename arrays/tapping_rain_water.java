package arrays;
import java.util.*;

public class tapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		while(n>=0)
		{
			int n2 = scn.nextInt();
			int [] arr = new int[n2];
			for(int i =0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
			}
			
			int value = TrappingRainWater(arr);
			System.out.println(value);
			n--;
			
		}
	}
		
		
	public static int TrappingRainWater(int[] arr) {
		int n=arr.length;
		int [] left=new int[n];
		left[0]=arr[0];
		for(int i=1;i<left.length;i++)
		{
			left[i]=Math.max(left[i-1],arr[i]);
			
			
			
		}
		int[] right = new int[n];
		right [n-1] =arr[n-1]; 
		for(int i= n-2;i>=0;i--)
		{
			
			right[i]=Math.max(right[i+1],arr[i]);
			
			
			
		}
		int sum=0;
		for(int i=0;i<right.length;i++)
		{
			sum =sum+Math.min(left[i],right[i]-arr[i]);
			
			
			
			
		}
		return sum;
		
	}

}
