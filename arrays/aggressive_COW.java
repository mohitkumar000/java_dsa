package arrays;
import java.util.*;

public class aggressive_COW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t =scn.nextInt();
		int nos =scn.nextInt();
		int noc =scn.nextInt();
		int [] stall = new int[nos];
		for(int i =0;i<stall.length;i++)
		{
			stall[i]=scn.nextInt();
			
		}
		Arrays.sort(stall);
		
		

	}
	public static int largestminimumdistance(int [] stall,int noc)
	{
		int lo=0;
		int n =stall.length;
		int hi = stall[n-1]-stall[0];
		int ans =0;
		while(lo<=hi)
		{
			int mid =(lo+hi)/2;
			if(isitPossible(stall ,noc,mid)==true)
			{
				ans=mid;
				lo=mid+1;
			}
			else
			{
				hi =mid-1;
			}
		}
		return ans;
		
		
	}
	public static boolean isitPossible(int[] stall,int noc,int mid)
	{
		int cow=1;
		int pos=stall[0];
		int i=1;
		while(i<stall.length)
		{
			if(stall[i]-pos>=mid)
			{
				cow++;
				pos=stall[i];
			}
			if(cow==noc)
			{
				return true;
			}
			i++;
		}
		
		return false;
	}
	

}
