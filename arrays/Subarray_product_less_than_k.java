package arrays;
import java.util.*;

public class Subarray_product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k =scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int ans = product_less_k(arr,k);
		System.out.println(ans);
		
		
		

	}
	public static int product_less_k(int[] arr,int k)
	{
		int si =0;
		int ei =0;
		int p=1;
		int ans=0;
		
		while(ei<arr.length)
		{
			
			p=p*arr[ei];
            
           
			
			while(p>=k&&si<=ei)
			{
				p=p/arr[si];
				si++;
			}
			 ans=ans+ei-si+1;
			
			ei++;
			
			
			
		}
		return ans;
	}

}
