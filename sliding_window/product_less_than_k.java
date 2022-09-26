package sliding_window;

public class product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int product_less_k(int[] arr,int k)
	{
		int si =0;
		int ei =0;
		int p=1;
		int ans=0;
		
		while(ei<arr.length)
		{
			//grow karo window
			p=p*arr[ei];
			
			//shrink karo window 
			while(p>=k)
			{
				p=p/arr[si];
				si++;
			}
			 ans=ans+ei-si+1;
			
			ei++;
			
			
			//ans calculate
		}
		return ans;
	}

}
