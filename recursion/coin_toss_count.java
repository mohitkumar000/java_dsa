package recursion;
import java.util.*;

public class coin_toss_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int coin = scn.nextInt();
		coin_toss(coin,"");
		

	}
	public static void coin_toss(int n,String ans)
	{
		if(n==0)
		{
			System.out.println(ans+" ");
			return;
		}
		if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
		{
			coin_toss(n-1,ans+"H");
		}
		
		coin_toss(n-1,ans+"T");
			
	}

}
