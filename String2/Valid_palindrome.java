package String2;
import java.util.*;

public class Valid_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String scn = sc.nextLine();
		
		for(int i=0;i<scn.length();i++)
		{
			for(int j=i+1;j<=scn.length();j++)
			{
				String sub = scn.substring(i,j);
				System.out.println(sub);
			
			}
		}
		
		
		

	}
	public static boolean ispalindrome(String sub)
	{
		boolean flag =true;
		int left =0;
		int right = sub.length()-1;
		while(left<right)
		{
			char chleft=sub.charAt(left);
			char chright=sub.charAt(right);
			if(chleft !=chright)
			{
				flag = false;
				break;
			}
			left++;
			right++;
			
		}
		
		return flag;
		
	}

}
