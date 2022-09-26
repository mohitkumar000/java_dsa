package recursion;

public class static_variable_demo {
	static int val =500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(val);//static vsaribale will be acessed
		fun();
		System.out.println(val);//local varibale of function will be accesed
		
		

	}
	public static void fun()
	{
		System.out.println("hey");
		val =val-5;
		int val =50;
		static_variable_demo.val=static_variable_demo.val+6;//to access global varibale class name shpould be used
		System.out.println(val);
	}

}
