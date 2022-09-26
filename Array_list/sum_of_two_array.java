package Array_list;
import java.util.*;


public class sum_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scn.nextInt();
        }
        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scn.nextInt();
        }
        System.out.print(sumof_array(arr1,arr2));
        
       

	}
	public static void sumof_array(int[] arr1,int [] arr2)
	{
		int carry =0;
		int i =arr1.length-1;
		int j =arr2.length -1;
		ArrayList<Integer>list =new ArrayList<>();
		while(i>=0||j>=0)
		{
			int sum =0;
			if(i>=0)
			{
				sum= +arr1[i];
				i--;
			}
			if(j>=0)
			{
				sum= +arr1[j];
				j--;	
			}
			
			sum+=carry;
			list.add(sum%10);
			carry =sum/10;
		}
		
		
	}

}
