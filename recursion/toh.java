package recursion;

public class toh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src ="A";
		String hlp ="B";
		String des = "C";
		
		int n =25;
		toh_(n,src,hlp,des);
		

	}
	
	public static void  toh_(int n,String src,String hlp,String des)
	
	{
		if(n==0)
		{
			return;
		}
		toh_(n-1,src,des,hlp);
		System.out.println("MOVE "+n+"th disk from "+src+"to"+des);
		toh_(n-1,hlp,src,des); 
	
		
	}

}
