package String2;
import java.util.*;

public class String_compresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static String compresssion(String str)
	{
		String ans = "";
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				//nothing
			}
			else
			{
				ans+=str.charAt(i);
			}
		}
		ans+=str.charAt(str.length()-1);
		
		
		return ans;
	}

}
