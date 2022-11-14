package algorithm_solver;

public class merge_two_array {

	public static int [] merge_array(int []arr1,int[]arr2)
	{
		int i=0;
		int j=0;
		int k=0;
		int [] ans = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]>arr2[j])
			{
				ans[k]=arr2[j];
				j++;
				k++;
			}
			else
			{
				ans[k]=arr1[i];
				i++;
				k++;
			}
		}
		while(i<arr1.length)
		{
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
		
		
	}
}
