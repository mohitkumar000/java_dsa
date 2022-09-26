package college_lab;
import java.util.*;

public class search_in_sorted_arrayt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int key =scn.nextInt();
		search(arr, key);
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		

	}
	 public static int search(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length - 1;

	        while(start <= end) {
	            int mid = (start + end)/2;

	            if(target == nums[mid]) {
	                return mid;
	            }

	            if(nums[start] <= nums[mid]) { 
	                if(target >= nums[start] && target < nums[mid]) {  
	                    end = mid-1;
	                } else {
	                    start = mid+1;
	                }
	            } else { 
	                if(target > nums[mid] && target <= nums[end]) { 
	                    start = mid+1;
	                } else {
	                    end = mid-1;
	                }
	            }
	        }

	        return -1;
	    }

}
