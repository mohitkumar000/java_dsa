package algorithm_solver;
import java.util.*;
import algorithm_solver.even_odd;


public class command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		input_format();
		
		int input = scn.nextInt();
		
		if(input ==1 )
		{
			even_odd obj =new even_odd();
			System.out.println("Enter the number");
			int x = scn.nextInt();
			obj.even_odd(x);
		}
		//for the second input
		if(input ==2 )
		{
			merge_two_array obj1 = new merge_two_array();
			System.out.println("Enter the size of first array");
			int [] arr1 = input_array();
			//second_array
			System.out.println("Enter the size of second array");
			int [] arr2 = input_array();
			
			int[] merge = obj1.merge_array(arr1,arr2);
			
			for(int i =0;i<merge.length;i++)
			{
				System.out.println("finally merged array is "+merge[i]);
			}
			
			}
		//for the third input
		if(input==3)
		{
			System.out.println("Enter the size of array array");
			int [] sorted_array = input_array();
			
			System.out.println("enter the elemnt to be searched");
			int ele = scn .nextInt();
			
			searching_for_sorted_array objsorted = new searching_for_sorted_array();
			 int ans = objsorted.binary_search(sorted_array,ele);
			 System.out.println("Element is at index "+ans);
			 
			
		}
		
		////for the fourth input
		
		if(input==4)
		{
			System.out.println("Enter the size of array array");
			int [] unsorted_array = input_array();
			System.out.println("enter the elemnt to be searched");
			int ele = scn .nextInt();
			sorting_for_unsorted_array unsortedobj = new sorting_for_unsorted_array();
			
			int ans = unsortedobj.unsorted_array(unsorted_array,ele);
			
			 System.out.println("Element is at index "+ans);
		}
		
	////for the fourth input
		
		if(input ==5)
		{
			System.out.println("Enter the size of array");
			int [] unsorted_array = input_array();
			
			Sorting sorted_obj = new Sorting();
			int [] ans = sorted_obj.sort(unsorted_array);
			
			for(int i =0;i<ans.length;i++)
			{
				System.out.println("Sorted_array is  "+ans[i]);
			}
			
			
		}
		if(input ==6)
		{
			System.out.println("Enter the size of array array");
			int [] unsorted_array = input_array();
			sum_of_all_element objsum = new sum_of_all_element();
			
			int ans = objsum.sum_of_array(unsorted_array);
			System.out.println(ans);
			
		}
		
		input_format();
		
		
		
		
		
		
		
		
		
		

	}
	
	public static void input_format()
	{
		
		System.out.println("1-To find the number is even or odd type 1");
		System.out.println("2-To merge two array into one array type 2");
		System.out.println("3-To search a element in a sorted array type 3");
		System.out.println("4-To search a element in a unsorted array type 4");
		System.out.println("5-TO Sort an array type 5");
		System.out.println("6-To find the sum of all elements in an arra type 6");
		
		
	}
	
	public static int []  input_array()
	{
		Scanner scn = new Scanner(System.in);
		
		int s =scn.nextInt();
		System.out.println("enter the elemnts of the array");
		int [] unsorted_array = new int[s];
		for(int i=0;i<unsorted_array.length;i++)
		{
			unsorted_array[i]=scn.nextInt();
		}
		return unsorted_array;
		
	}

}
