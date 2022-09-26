package recursion;

public class print_decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pd(n);

	}
	public static void pd(int n)
	{
		if(n==0) {
			return;
		}
		System.out.println(n);
		pd(n-1);
	}

}
