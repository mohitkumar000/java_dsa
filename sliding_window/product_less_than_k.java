package sliding_window;

public class product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,6,3};
		int k =10;
		int ans=product_less_k(arr,k);
		System.out.println(ans);
		
		

	}
	public static int product_less_k(int[] arr,int k)
	{
		int si=0;
		int ei=0;
		int p=1;
		int ans =0;
		while(ei<arr.length)
		{
			p=p*arr[ei];
			
			while(p>=k&&si<=ei)
			{
				p=p/arr[si];
				si++;
			}
			
			ans = ans +ei-si+1;
			ei++;
		}
		return ans;
		
		
		
	}

}
