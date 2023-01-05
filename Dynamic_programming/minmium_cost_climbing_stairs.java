package Dynamic_programming;

import java.util.Arrays;

public class minmium_cost_climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,100,1,1,1,100,1,1,100,1};
		
	
		
	
		
		int [] dp = new int[arr.length];
		Arrays.fill(dp,-1);
		int fs=minimum_costtd(arr,0,dp);
		int ss =minimum_costtd(arr,1,dp);
		
		System.out.println(Math.min(fs,ss));
		

	}
	public static int minimum_costtd(int [] arr,int i,int [] dp)
	{
		if(i>=arr.length)
		{
			return 0;
		}
		int fs=minimum_costtd(arr,i+1,dp);
		int ss=minimum_costtd(arr,i+2,dp);
		
		return arr[i]+Math.min(fs,ss);
		
	}
}
