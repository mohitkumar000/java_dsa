package recursion;

public class Maze_path {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		int ans =maze_path(0,0,n-1,m-1,"");
		System.out.println(ans);

	}
	public static int  maze_path(int cr,int cc,int er,int ec,String ans)
	{
		if(cr==er&&cc==ec)
		{
			count++;
			
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		int ans1=maze_path(cr,cc+1,er,ec,ans+"H");
		int ans2=maze_path(cr+1,cc,er,ec,ans+"V");
		return ans1+ans2;
		
	}

}
