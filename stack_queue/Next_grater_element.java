package stack_queue;
import java.util.*;

public class Next_grater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= scn.nextInt();
			
		}
		nge(arr);
		
		

	}
	public static void nge(int [] arr)
	{
		Stack<Integer>st=new Stack<>();
		int[]ans =new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!st.empty()&&arr[i]>arr[st.peek()])
			{
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			ans[st.pop()]=-1;
					
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+ans[i]);
		}
		
	}

}
