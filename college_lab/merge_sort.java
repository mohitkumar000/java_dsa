package college_lab;
import java.util.*;

public class merge_sort {
	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//int n = scn.nextInt();
		//int [] arr = new int[n];
		//for(int i=0;i<arr.length;i++)
		//{
			//arr[i]=scn.nextInt();
		//}
		int arr[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
	    int n = arr.length;  

		mergesort(arr, 0, n - 1);  
		//print_array(arr, n);
		for (int i = 0; i < n; i++) 
	    {
	        System.out.print(arr[i] + " "); 
	    }
		
		
		
		
		
		
		
	}
	public static void merge(int [] arr,int beg,int mid,int end)
	{
		int i,j,k;
		int n1 =mid-beg+1;
		int n2 =end-mid;
		int [] leftArray = new int[n1];
		int [] rightArray = new int[n2];
		for(i=0;i<n1;i++)
		{
			leftArray[i]=arr[beg+i];
		}
		for(j=0;j<n2;i++)
		{
			rightArray[j]=arr[mid+1+j];
		}
		   i = 0;   
		    j = 0; 
		    k = beg;    
		      
		    while (i < n1 && j < n2)    
		    {    
		        if(leftArray[i] <= rightArray[j])    
		        {    
		            arr[k] = leftArray[i];    
		            i++;    
		        }    
		        else    
		        {    
		            arr[k] = rightArray[j];    
		            j++;    
		        }    
		        k++;    
		    }    
		    while (i<n1)    
		    {    
		        arr[k] = leftArray[i];    
		        i++;    
		        k++;    
		    }  
		    while (j<n2)    
		    {    
		        arr[k] = rightArray[j];    
		        j++;    
		        k++;    
		    }    
		
		
		
	}
	public static  void mergesort(int[] arr,int beg,int end)
	{
		  if (beg < end)   
		    {  
		        int mid = (beg + end) / 2;  
		        mergesort(arr, beg, mid);  
		        mergesort(arr, mid + 1, end);  
		        merge(arr, beg, mid, end);  
		    }  
	}
	public static void print_array(int[]arr,int n)
	{
	    
	    
		
	}

}
