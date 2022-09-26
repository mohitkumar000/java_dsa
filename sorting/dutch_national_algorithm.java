package sorting;
import java.util.*;

public class dutch_national_algorithm {
	//dutch national flag

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		sort(arr);
		for(int j =0;j<arr.length;j++)
		{
			System.out.println(arr[j]+ " ");
		}
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int i =0;
		int j=arr.length-1;
		int k =0;
		while(k<=j)
		{
			if(arr[k]==2)
			{
				int temp =arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
				
			}
			else if(arr[k]==0){
				int temp =arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i--;
				k++;
				
			}
			else
			{
				k++;
				 
			}
		}
		
	}

}
