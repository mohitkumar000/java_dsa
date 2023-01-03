package Dynamic_programming;

public class fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int dp [] = new int[n+1];
		System.out.println(fibbotd(n,dp));
	}
	public static int fibbo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		
		
		int f1 = fibbo(n-1);
		int f2 = fibbo(n-2);
		return f1+f2;
	}
	public static int fibbotd(int n,int [] arr)
	{
		if(n==0||n==1)
		{
			return n;
		}
		if(arr[n]!=0)
		{
			return arr[n];
		}
		
		int f1 = fibbotd(n-1,arr);
		int f2 = fibbotd(n-2,arr);
		return arr[n]=f1+f2;
	}

}
