package stack_assignment;
import java.util.*;

public class balanced_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="()";
		boolean ans = validpara(str);
		System.out.println(ans);
		

	}
	public static boolean validpara(String str)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			
			char ch =str.charAt(i);
				if(ch=='{'||ch=='['||ch=='(')
        		{
        			st.push(ch);
        		}
				else
				{
					if(st.isEmpty())
					{
						return false;
					}
					else if(!ismatching(str.charAt(i),st.peek()))
					{
						return false;
					}
					
					{
						st.pop();
					}
				}
        		
		}
		return st.isEmpty();
		
		
	}
	public static boolean ismatching(char a,char b)
	{
		return (a=='('&&b==')'||a=='{'&&b=='}'||a=='['&&b==']');
		
		
		
	}

}
