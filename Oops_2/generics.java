package Oops_2;

public class generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,40,50};
		String[] arr1= { "raj", "riya", "kunal"};
		display(arr);
		

	}
	public static <t>void display(t [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

}
