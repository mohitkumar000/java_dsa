package assignment_2;
import java.util.*;

public class palindromre_substring {
	static int count =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		substring(str);
		
		
		

	}
	public static void substring(String str)
	{
		int i =0;
		int j=0;
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				String ss = str.substring(i,j);
				if(ispalindrome(ss) ==true )
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean ispalindrome(String str)
	{
		int i=0;
		int j =str.length()-1;
		while(i<=j)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(i);
			if(ch1!=ch2)
			{
				return false;
			}
			else
			{
				i++;
				j--;
				
			}
			
			
		}
		return true;
	}

}
