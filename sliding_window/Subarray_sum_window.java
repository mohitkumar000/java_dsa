package sliding_window;

public class Subarray_sum_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,14,7,11,13,18,16};
		

	}
	public static int SubArray(int []arr,int k)
	{
		int sum =0;
		for(int i=0;i<k;i++)
		{
			sum +=arr[i];
		}
		int ans=sum;
		for(int i=k;i<arr.length;i++)
		{
			sum+=arr[i];
			sum=sum-arr[i-k];
			ans=Math.max(ans, sum);
			
		}
		return ans;
	}

}
