package recursion;
import java.util.*;

public class generate_parenentesis_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		List<String>list= new ArrayList<>();
		generate_bracket(n,0,0,"",list);
		System.out.println(list);
		

	}
	
	public static void generate_bracket(int n,int open,int close,String ans,List<String>list)
	{
		
		if(open==n&&close==n)
		{
			//System.out.print("["+""+ans+" "+""+"]");
			list.add(ans);
			return;
		}
		if(open<n)
		{
			generate_bracket(n,open+1,close,ans+"(",list);
		}
		if(close<open)
		{
			generate_bracket(n,open,close+1,ans+")",list);
		}
			
		
		
		
		
	}
}
