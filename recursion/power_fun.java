package recursion;

public class power_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		System.out.println(power(a,b ));
				

	}
	public static int power(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		int p = power(a,b-1);
		return a*p;
	}

}
