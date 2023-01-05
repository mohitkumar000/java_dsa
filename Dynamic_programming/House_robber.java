package Dynamic_programming;
import java.util.*;
public class House_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,7,9,3,1};
		 int [] dp = new int[arr.length];
		Arrays.fill(dp,-1);
		System.out.println(house_robber(arr,0));

	}
	public static int house_robber(int [] arr,int i)
	{
		if(i>arr.length)
		{
			return 0;
		}
		
		int rob= house_robber(arr,i+2)+arr[i];
		int dnrob = house_robber(arr,i+1);
		
		return Math.max(rob, dnrob);
		
		
	}
	public static int house_robbertd(int [] arr,int i,int [] dp)
	{
		if(i>arr.length)
		{
			return 0;
		}
		 if(dp[i]!=-1) {
			 return dp[i];
		 }
		
		int rob= house_robbertd(arr,i+2,dp) + arr[i];
		int dnrob = house_robbertd(arr,i+1,dp);
		
		return dp[i]=Math.max(rob, dnrob);
		
	}

	
}
