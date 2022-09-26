package arrays;

public class swap_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		System.out.println(arr[0]+" "+arr[1]);
		
		swap(arr[0],arr[1]);
		
		System.out.println(arr[0]+" "+arr[1]);
		
		

	}
	public static void swap(int a,int b)
	{
		int temp =a;
		a=b;
		b=temp;
		
	}
	public static void display(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
