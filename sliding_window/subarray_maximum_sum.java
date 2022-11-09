package sliding_window;

public class subarray_maximum_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,2,3,17,5,18,12,95};
		int k=3;
		int ans= sum(arr,k);
		System.out.println(ans);

	}
	public static int sum(int []arr,int k)
	{
		int sum =0;
		for(int i=0;i<k;i++)
		{
			sum +=arr[i];
		}
		int ans =sum;
		for(int i=k;i<arr.length;i++)
		{
			sum+=arr[i];
			sum=sum-arr[i-k];
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
